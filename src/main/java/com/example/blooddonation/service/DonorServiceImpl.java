package com.example.blooddonation.service;

import com.example.blooddonation.entity.Donor;
import com.example.blooddonation.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorServiceImpl implements DonorService {

    @Autowired
    private DonorRepository repository;

    @Override
    public Donor addDonor(Donor donor) {
        return repository.save(donor);
    }

    @Override
    public List<Donor> getAllDonors() {
        return repository.findAll();
    }

    @Override
    public Donor updateDonor(Long id, Donor donor) {
        Donor existing = repository.findById(id).get();
        existing.setName(donor.getName());
        existing.setBloodGroup(donor.getBloodGroup());
        existing.setCity(donor.getCity());
        existing.setAvailable(donor.isAvailable());
        return repository.save(existing);
    }

    @Override
    public void deleteDonor(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Donor> getDonorsByBloodGroup(String bloodGroup) {
        return repository.findByBloodGroup(bloodGroup);
    }
}
