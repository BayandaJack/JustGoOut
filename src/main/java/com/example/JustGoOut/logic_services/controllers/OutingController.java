package com.example.JustGoOut.logic_services.controllers;

import com.example.JustGoOut.domain.Outing;
import com.example.JustGoOut.logic_services.dtos.OutingDto;
import com.example.JustGoOut.logic_services.services.OutingServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class OutingController {
    private OutingServices outingServices;

    public OutingController(OutingServices outingServices){
        this.outingServices = outingServices;
    }

    @GetMapping("/outings")
    public Map<Integer, Outing> getAll(){
        return outingServices.getAllOutings();
    }

    @PostMapping("/outings")
    public void createOuting(@RequestBody OutingDto outingDto){
        outingServices.createOuting(outingDto);
    }
}
