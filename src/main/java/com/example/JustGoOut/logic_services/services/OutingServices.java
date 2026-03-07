package com.example.JustGoOut.logic_services.services;

import com.example.JustGoOut.domain.Outing;
import com.example.JustGoOut.logic_services.dtos.OutingDto;
import com.example.JustGoOut.persistence.repos.OutingRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class OutingServices {
    private final OutingRepo outingRepo;
    private int nextId = -1;

    public OutingServices(OutingRepo outingRepo){
        this.outingRepo = outingRepo;
    }

    //methods
    public Map<Integer, Outing> getAllOutings(){
        return outingRepo.getOutings();
    }

    public Outing createOuting(OutingDto outingDto){
        nextId++;
        Outing outing = new Outing(
                nextId,
                outingDto.getOutingName(),
                outingDto.getOutingDesc(),
                null
        );

        return outingRepo.addOuting(outing.getOutingId(), outing);
    }

    public Outing deleteOuting(Integer id){
        Outing deletedOuting = outingRepo.getOuting(id);
        outingRepo.deleteOuting(id);
        return deletedOuting;
    }

}
