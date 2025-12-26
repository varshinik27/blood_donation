package com.example.blooddonation.service;



import com.example.blooddonation.entity.Donor;
import java.util.List;

public interface DonorService {
    Donor addDonor(Donor donor);
    List<Donor> getAllDonors();
    Donor updateDonor(Long id, Donor donor);
    void deleteDonor(Long id);
    List<Donor> getDonorsByBloodGroup(String bloodGroup);
}
