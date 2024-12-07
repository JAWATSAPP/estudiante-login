/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.logins.controller;

import com.example.logins.service.AlumnoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author FLHORIAN
 */
@Controller

public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/alumnos")
    public String listAlumnos(Model model) {
        model.addAttribute("alumnos", alumnoService.getAllAlumnos());
        return "alumnos";
    }

}
