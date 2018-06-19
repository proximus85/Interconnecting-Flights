package org.interconnection.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Builder
@Setter
@Getter
@NoArgsConstructor
public class InterconnectedFlightScheduleDto {
    private String departureAirport;
    private String arrivalAirport;
    private Date departureDateTime;
    private Date arrivalDateTime;
}
