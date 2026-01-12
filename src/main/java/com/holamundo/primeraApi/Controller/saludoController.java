package com.holamundo.primeraApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class saludoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola Mundo";
    }
}
