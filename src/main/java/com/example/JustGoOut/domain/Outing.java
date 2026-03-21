package com.example.JustGoOut.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Outing {
    private Long outingId;
    private String outingName;
    private String outingDesc;
    private LocalDate outingDate;
    private OutingStatus outingStatus;
    private User user;
}
