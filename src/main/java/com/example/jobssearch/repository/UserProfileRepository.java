package com.example.jobssearch.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.jobssearch.model.UserProfile;

public interface UserProfileRepository extends MongoRepository<UserProfile, String> {
}
