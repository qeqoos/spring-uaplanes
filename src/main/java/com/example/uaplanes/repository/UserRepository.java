package com.example.uaplanes.repository;

import com.example.uaplanes.model.userProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<userProfile, Integer> {
}
