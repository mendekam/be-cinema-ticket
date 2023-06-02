package com.spring.binar.challenge_5.dto;

import com.spring.binar.challenge_5.models.Film;
import com.spring.binar.challenge_5.models.Schedule;
import com.spring.binar.challenge_5.models.Studio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleRequestDTO {
    private long fromDate;
    private long toDate;
    private int price;
    private int studioId;
    private int filmId;

    public Schedule toSchedule(Studio studio, Film film){
        return Schedule.builder()
                .fromDate(fromDate)
                .toDate(toDate)
                .price(price)
                .studio(studio)
                .film(film)
                .build();
    }
}
