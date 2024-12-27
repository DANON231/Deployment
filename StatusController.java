package com.example.controller;

import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.http.ResponseEntity; 

@RestController
public class StatusController {

    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok("Service is running");
    }
}
