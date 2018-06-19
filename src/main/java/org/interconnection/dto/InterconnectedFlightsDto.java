package org.interconnection.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;


public class InterconnectedFlightsDto {
    private int stop;
    private Collection<InterconnectedFlightScheduleDto> flightScheduleDtoCollection;
}
