package com.proyects.main.service;

import java.util.Optional;

import com.proyects.main.entities.Patient;

public interface PatientService {
    Optional<Patient> findAppointmentByIdPatient();
}
