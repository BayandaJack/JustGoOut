package com.example.JustGoOut.logic_services.mappers;

import com.example.JustGoOut.domain.Outing;
import com.example.JustGoOut.persistence.entities.OutingEntity;

public class OutingMapper {

    //outing entity to domain
    public static Outing toDomain(OutingEntity outingEntity){
        return new Outing(
                outingEntity.getOutingId(),
                outingEntity.getOutingName(),
                outingEntity.getOutingDesc(),
                outingEntity.getOutingDate(),
                outingEntity.getOutingStatus(),
                UserMapper.toDomain(outingEntity.getUserEntity())
        );
    }

    //outing domain to entity
    public static OutingEntity toEntity(Outing outing){
        return new OutingEntity(
                outing.getOutingName(),
                outing.getOutingDesc(),
                outing.getOutingDate(),
                outing.getOutingStatus(),
                UserMapper.toEntity(outing.getUser())
        );
    }
}
