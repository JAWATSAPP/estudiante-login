/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.logins.repository;

import com.example.logins.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author FLHORIAN
 */
public interface AlumnoRepository extends JpaRepository<Alumno, Long>{
    
}
