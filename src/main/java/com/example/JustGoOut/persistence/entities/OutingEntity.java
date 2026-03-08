package com.example.JustGoOut.persistence.entities;

import com.example.JustGoOut.domain.OutingStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Outings")
public class OutingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int outingId;

    private String outingName;
    private String outingDesc;
    private LocalDate outingDate;
    private OutingStatus outingStatus;
    private int userId;
}
