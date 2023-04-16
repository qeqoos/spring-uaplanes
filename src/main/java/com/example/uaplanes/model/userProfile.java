package com.example.uaplanes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.OffsetDateTime;

@Entity
public class userProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_profile_id;

    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private OffsetDateTime created_at;

    public userProfile() {
    }

    public userProfile(Integer user_profile_id, String first_name, String last_name, String username, String password, OffsetDateTime created_at) {
        this.user_profile_id = user_profile_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.created_at = created_at;
    }

    public Integer getUser_profile_id() {
        return user_profile_id;
    }

    public void setUser_profile_id(Integer user_profile_id) {
        this.user_profile_id = user_profile_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    public OffsetDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(OffsetDateTime created_at) {
        this.created_at = created_at;
    }
}
