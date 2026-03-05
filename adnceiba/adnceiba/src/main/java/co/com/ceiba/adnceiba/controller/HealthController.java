package co.com.ceiba.adnceiba.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "status", "OK",
            "message", "API funcionando"
        );
    }

    @GetMapping("/welcome/{nombre}")
    public Map<String, String> welcome(@PathVariable String nombre) {
        return Map.of(
            "message", "¡Hola, " + nombre + "! Bienvenido a la API de ADN Ceiba"
        );
    }

}