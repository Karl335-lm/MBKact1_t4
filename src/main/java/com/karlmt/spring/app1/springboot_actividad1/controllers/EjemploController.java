package com.karlmt.spring.app1.springboot_actividad1.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class EjemploController {

   
 @GetMapping("/detalles_info")
public String info(Map<String, Object> model) {
    model.put("Titulo", "Servidor en linea");
    model.put("Servidor", "Informaticonfig");
    model.put("Ip", "192.168.0.19");
    return "detalles_info";
}
}