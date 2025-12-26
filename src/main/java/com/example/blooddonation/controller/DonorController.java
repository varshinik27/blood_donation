package com.example.blooddonation.controller;



import com.example.blooddonation.entity.Donor;
import com.example.blooddonation.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin("*")
public class DonorController {

    @Autowired
    private DonorService service;

    @PostMapping
    public Donor addDonor(@RequestBody Donor donor) {
        return service.addDonor(donor);
    }

    @GetMapping
    public List<Donor> getAllDonors() {
        return service.getAllDonors();
    }

    @PutMapping("/{id}")
    public Donor updateDonor(@PathVariable Long id, @RequestBody Donor donor) {
        return service.updateDonor(id, donor);
    }

    @DeleteMapping("/{id}")
    public void deleteDonor(@PathVariable Long id) {
        service.deleteDonor(id);
    }

    @GetMapping("/blood/{group}")
    public List<Donor> getByBloodGroup(@PathVariable String group) {
        return service.getDonorsByBloodGroup(group);
    }
}
