package com.example.JustGoOut.logic_services.controllers;

import com.example.JustGoOut.domain.Outing;
import com.example.JustGoOut.domain.OutingStatus;
import com.example.JustGoOut.logic_services.dtos.OutingDto;
import com.example.JustGoOut.logic_services.services.OutingServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class OutingController {
    private final OutingServices outingServices;

    public OutingController(OutingServices outingServices){
        this.outingServices = outingServices;
    }

    @GetMapping("/outings")
    public Map<Integer, Outing> getAll(@RequestParam(required = false) OutingStatus status){

        if (status == null){
            return outingServices.getAllOutings();
        }else{
            return outingServices.getOutingsByStatus(status);
        }
    }

    @GetMapping("/outings/{id}")
    public Outing getOutingById(@PathVariable Integer id){
        return outingServices.getOutingById(id);
    }

    @PostMapping("/outings")
    public Outing createOuting(@RequestBody OutingDto outingDto){
        return outingServices.createOuting(outingDto);
    }

    /*
    @PutMapping("/outings/{id}")
    public Outing updateOuting(@PathVariable Integer id, @RequestBody OutingDto outingDto){

    }
     */

    @DeleteMapping("/outings/{id}")
    public Outing deleteOuting(@PathVariable Integer id){
        return outingServices.deleteOuting(id);
    }
}
