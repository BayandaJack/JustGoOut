package com.example.JustGoOut.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Outing {
    private int outingId;
    private String outingName;
    private String outingDesc;
    private LocalDate outingDate;
}
