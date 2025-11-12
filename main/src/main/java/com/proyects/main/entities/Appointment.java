package com.proyects.main.entities;

import java.time.DayOfWeek;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Appointment {

    private Long id;
    private Patient patient;
    private Physician physician;
    @Enumerated(EnumType.STRING)
    private DayOfWeek day;
    private LocalTime firstTime;
    private LocalTime endTime;
    @Enumerated(EnumType.STRING)
    private StateAppoiment stateAppoiment;
}
