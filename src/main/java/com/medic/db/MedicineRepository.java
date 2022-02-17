package com.medic.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medic.model.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}
