package com.example.external.controller;

import com.example.external.dto.ExecutionRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/external")
@Slf4j
public class ExecutionController {
    @PostMapping("/execute")
    public ResponseEntity<ExecutionRequestDto> execute(@RequestBody ExecutionRequestDto request) {
        log.warn("Request Received: {}", request.toString());
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            log.warn("Error while sleeping {}", e.getMessage());
        }

        log.warn("Request Processed: {}", request);
        return ResponseEntity.ok(request);
    }
}
