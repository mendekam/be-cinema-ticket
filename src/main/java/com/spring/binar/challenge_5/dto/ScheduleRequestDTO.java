package com.spring.binar.challenge_5.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;

@Data
@Builder
public class ScheduleRequestDTO implements Serializable {
    private int scheduleId;
    private long fromDate;
    private long toDate;
    private int price;
    private int studioId;
    private int filmId;
    
    @JsonCreator
    public ScheduleRequestDTO(int scheduleId, Long fromDate, Long toDate, int price, int studioId, int filmId){
        this.scheduleId = scheduleId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.price = price;
        this.studioId = studioId;
        this.filmId = filmId;
    }
}
