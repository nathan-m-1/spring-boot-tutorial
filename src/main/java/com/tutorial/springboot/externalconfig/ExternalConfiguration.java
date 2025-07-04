package com.tutorial.springboot.externalconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/external-config")
public class ExternalConfiguration {

    @Value("${mensaje.personalizado}")
    private String mensaje;

    @Value("${number.test}")
    private Integer number;

    @GetMapping("/test")
    public String test() {
        return "Mensaje: " + mensaje + ", Número: " + number;
    }
}
