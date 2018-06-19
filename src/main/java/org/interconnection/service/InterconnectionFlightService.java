package org.interconnection.service;

import org.interconnection.dto.InterconnectedFlightScheduleDto;
import org.interconnection.dto.InterconnectedFlightsDto;

import java.util.Collection;

public interface InterconnectionFlightService {
    Collection<InterconnectedFlightsDto> getInterconnectedFlights(
            InterconnectedFlightScheduleDto interconnectedFlightScheduleDto);
}
