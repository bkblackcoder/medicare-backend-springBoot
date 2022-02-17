package com.medic.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medic.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
