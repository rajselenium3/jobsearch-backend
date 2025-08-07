package com.example.jobssearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobssearch.model.UserProfile;
import com.example.jobssearch.service.UserProfileService;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin(origins = "*")
public class ProfileController {

    @Autowired
    private UserProfileService service;

    @PostMapping
    public UserProfile saveProfile(@RequestBody UserProfile profile) {
        return service.saveProfile(profile);
    }
}