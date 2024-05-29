
package com.airline.airline;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api")
public class PruebaController {

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        String json = "{\"message\": \"Hello, World!\"}";
        return new ResponseEntity<>(json, HttpStatus.OK);
    }
            
    // Agrega más endpoints de la API aquí
            
}
