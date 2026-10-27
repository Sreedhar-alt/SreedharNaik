
package com.shtechsolutions.shtech.controller;

import com.shtechsolutions.shtech.entity.StudentEnquiry;
import com.shtechsolutions.shtech.repository.StudentEnquiryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enquiries")
@CrossOrigin(origins = "*")
public class StudentEnquiryController {

    private final StudentEnquiryRepository repository;

    public StudentEnquiryController(StudentEnquiryRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public StudentEnquiry saveEnquiry(@RequestBody StudentEnquiry enquiry) {
        return repository.save(enquiry);
    }

    @GetMapping
    public List<StudentEnquiry> getAllEnquiries() {
        return repository.findAll();
    }
}
