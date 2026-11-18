package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.Map;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) { this.calculatorService = calculatorService; }

    @GetMapping("/calculate")
    public Map<String, Double> calculate(@RequestParam double a, @RequestParam double b, @RequestParam String operation) {
        try { return Map.of("result", calculatorService.calculate(a, b, operation)); }
        catch (IllegalArgumentException ex) { throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage()); }
    }
}
