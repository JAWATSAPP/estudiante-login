/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.logins.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author FLHORIAN
 */
@Controller
public class LoginControler {
    
    @GetMapping("/login")
     public String showLoginForm() {
        return "login";
    }
      @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if ("root".equals(username) && "root".equals(password)) {
            return "redirect:/alumnos";
        } else {
            model.addAttribute("error", "Credenciales incorrectas");
            return "error";
        }
}
}
