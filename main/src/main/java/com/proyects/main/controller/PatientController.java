package com.proyects.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyects.main.entities.Patient;
import com.proyects.main.service.PatientService;

@RestController
@RequestMapping("/api")
public class PatientController {
    @Autowired
    PatientService patientService;
@GetMapping("/appointment/{id}")
public Patient findAppointmentPatient(@PathVariable Long id,@RequestBody Patient patient){
    return patientService.findAppointmentById(id).get();
}
    

}
