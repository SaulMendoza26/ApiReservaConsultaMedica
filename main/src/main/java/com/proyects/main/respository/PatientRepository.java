package com.proyects.main.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyects.main.entities.Patient;

public interface  PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findPatientById();

}