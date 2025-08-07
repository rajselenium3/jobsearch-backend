package com.example.jobssearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobssearch.model.UserProfile;
import com.example.jobssearch.repository.UserProfileRepository;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository repository;

    public UserProfile saveProfile(UserProfile profile) {
        return repository.save(profile);
    }
}
