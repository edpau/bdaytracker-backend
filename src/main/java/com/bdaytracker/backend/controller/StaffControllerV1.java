package com.bdaytracker.backend.controller;

import com.bdaytracker.backend.model.Staff;
import com.bdaytracker.backend.service.StaffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/staff")
public class StaffControllerV1 {

    private final StaffService staffService;

    public StaffControllerV1(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<Staff> getAllStaff() {
        return staffService.getAllStaff();
    }

}
