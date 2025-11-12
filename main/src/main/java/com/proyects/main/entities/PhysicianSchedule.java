package com.proyects.main.entities;

import java.time.DayOfWeek;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicianSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Día de la semana (Lunes, Martes, etc.)
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    // Hora de inicio del turno
    private LocalTime startTime;

    // Hora de fin del turno
    private LocalTime endTime;

    // Relación con el médico
    @ManyToOne
    @JoinColumn(name = "physician_id")
    private Physician physician;
 
}
