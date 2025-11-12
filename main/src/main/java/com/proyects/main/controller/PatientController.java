package com.proyects.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyects.main.entities.Patient;

@RestController
@RequestMapping("/api")
public class PatientController {

@GetMapping("/")
public Patient findAppointmenPatient(){
    return null;
}
    

}
