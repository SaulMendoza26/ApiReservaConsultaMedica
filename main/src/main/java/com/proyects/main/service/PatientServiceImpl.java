package com.proyects.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyects.main.entities.Patient;
import com.proyects.main.respository.PatientRepository;
@Service
public class PatientServiceImpl implements  PatientService {

    @Autowired
    private PatientRepository patientRepository;
    @Override
    public Optional<Patient> findAppointmentById(Long id) {
        return patientRepository.findById(id);
    }

    @Override
    public Patient savePatient(Patient patient) {
      return patientRepository.save(patient);
    }

}
