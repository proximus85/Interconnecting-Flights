package org.interconnection.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FlightTime {
    private int number;
    private ZonedDateTime departureTime;
    private ZonedDateTime arrivalTime;
}
