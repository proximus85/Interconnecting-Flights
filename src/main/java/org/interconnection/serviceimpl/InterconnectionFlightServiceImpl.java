package org.interconnection.serviceimpl;

import org.interconnection.dto.InterconnectedFlightScheduleDto;
import org.interconnection.dto.InterconnectedFlightsDto;
import org.interconnection.service.InterconnectionFlightService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class InterconnectionFlightServiceImpl implements InterconnectionFlightService {

    @Override
    public Collection<InterconnectedFlightsDto> getInterconnectedFlights(
            InterconnectedFlightScheduleDto interconnectedFlightScheduleDto) {

        return null;
    }
}
