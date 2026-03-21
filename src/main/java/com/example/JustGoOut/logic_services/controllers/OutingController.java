package com.example.JustGoOut.logic_services.controllers;

import com.example.JustGoOut.domain.Outing;
import com.example.JustGoOut.logic_services.services.OutingServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OutingController {
    private final OutingServices outingServices;

    public OutingController(OutingServices outingServices){
        this.outingServices = outingServices;
    }

    @GetMapping("/outings/{outingId}")
    public Outing getOutingById(@PathVariable Long outingId){
        return outingServices.getOutingById(outingId);
    }
}
