package com.tutorial.springboot.tierarchitecture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Principal {

    @GetMapping("/hola")
    public String hola(){
        return "Hola, haciendo pruebas";
    }
}
