package com.example.demo.controller;

import com.example.demo.client.TipoCambioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/api/tipo-cambio")
public class TipoCambioController {

    @Autowired
    private TipoCambioClient tipoCambioClient;

    
    @PostMapping("/guardar")
    public ResponseEntity<String> guardarTipoCambio() {
        String resultado = tipoCambioClient.obtenerYGuardarTipoCambio();
        return ResponseEntity.ok(resultado);
    }
}
