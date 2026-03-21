package com.example.JustGoOut.logic_services.services;

import com.example.JustGoOut.domain.Outing;
import com.example.JustGoOut.logic_services.mappers.OutingMapper;
import com.example.JustGoOut.persistence.repos.OutingRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OutingServices {
    private final OutingRepo outingRepo;

    public OutingServices(OutingRepo outingRepo){
        this.outingRepo = outingRepo;
    }

    public Outing getOutingById(Long outingId){
        return OutingMapper.toDomain(outingRepo.findById(outingId).orElseThrow(null));
    }

}
