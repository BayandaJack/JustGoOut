package com.example.JustGoOut.persistence.repos;

import com.example.JustGoOut.domain.Outing;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class OutingRepo {
    private Map<Integer, Outing> outings = new HashMap<>();

    //methods
    public Map<Integer, Outing> getOutings(){
        return outings;
    }

    public Outing addOuting(Integer id, Outing outing){
        outings.put(id, outing);
        log.info("New outing added to list");
        return outings.get(id);
    }

    public void deleteOuting(int outingId){
        log.info("Deleted outing {}:, {}", outingId, outings.get(outingId));
        outings.remove(outingId);
    }
}
