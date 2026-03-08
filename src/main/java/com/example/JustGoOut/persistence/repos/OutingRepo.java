package com.example.JustGoOut.persistence.repos;

import com.example.JustGoOut.domain.Outing;
import com.example.JustGoOut.domain.OutingStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Repository
public class OutingRepo {
    private Map<Integer, Outing> outings = new HashMap<>();

    //methods
    public Outing getOuting(Integer id){
        return outings.get(id);
    }

    public Map<Integer, Outing> getOutingsByStatus(OutingStatus status){
        return outings.entrySet()
                .stream()
                .filter(outing -> outing.getValue().getOutingStatus() == status)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }

    public Map<Integer, Outing> getOutings(){
        return outings;
    }

    public Outing addOuting(Integer id, Outing outing){
        outings.put(id, outing);
        log.info("New outing added to list");
        return outings.get(id);
    }

    public void deleteOuting(Integer outingId){
        log.info("Deleted outing {}:, {}", outingId, outings.get(outingId));
        outings.remove(outingId);
    }
}
