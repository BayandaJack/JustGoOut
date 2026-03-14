package com.example.JustGoOut.persistence.entities;

import com.example.JustGoOut.domain.OutingStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.apache.catalina.User;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "outings")
public class OutingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long outingId;

    private String outingName;
    private String outingDesc;
    private LocalDate outingDate;
    @Enumerated(EnumType.STRING)
    private OutingStatus outingStatus;
    @ManyToOne
    private UserEntity userEntity;

    protected OutingEntity() {}

    public OutingEntity(String outingName, String outingDesc,
                        LocalDate outingDate, OutingStatus outingStatus, UserEntity userEntity) {
        this.outingName = outingName;
        this.outingDesc = outingDesc;
        this.outingDate = outingDate;
        this.outingStatus = outingStatus;
        this.userEntity = userEntity;
    }
}
