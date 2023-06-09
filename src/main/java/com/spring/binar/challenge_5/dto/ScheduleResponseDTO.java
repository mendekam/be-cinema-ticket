package com.spring.binar.challenge_5.dto;

import com.spring.binar.challenge_5.models.Film;
import com.spring.binar.challenge_5.models.Seat;
import com.spring.binar.challenge_5.models.Studio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleResponseDTO {
    private int scheduleId;
    private long fromDate;
    private long toDate;
    private int price;
    private Studio studio;
    private Film film;
    private List<Seat> availableSeats;
}
