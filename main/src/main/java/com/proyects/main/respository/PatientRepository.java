package com.proyects.main.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyects.main.entities.Patient;
@Repository
public interface  PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findById(Long id);
    Patient savePatient(Patient patient);

}