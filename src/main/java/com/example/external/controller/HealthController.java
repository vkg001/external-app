package com.example.external.controller;

import jakarta.annotation.Nullable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/health")
@Slf4j
public class HealthController {
    @GetMapping({"", "/{message}"})
    public ResponseEntity<Map<String, String>> getHealth(@PathVariable @Nullable String message) {
        Map<String, String> response = new HashMap<>();
        response.put("application-id", "1");
        response.put("status", "ok");
        response.put("log", message != null ? message : "null");
        log.warn("Response: {}", response);
        return ResponseEntity.ok(response);
    }
}
