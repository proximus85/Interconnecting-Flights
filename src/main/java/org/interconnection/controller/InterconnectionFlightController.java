package org.interconnection.controller;

import org.interconnection.dto.InterconnectedFlightScheduleDto;
import org.interconnection.dto.InterconnectedFlightsDto;
import org.interconnection.service.InterconnectionFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Date;

@RestController
@RequestMapping("/interconnections")
public class InterconnectionFlightController {

    private final InterconnectionFlightService interconnectionFlightService;

    @Autowired
    public InterconnectionFlightController(InterconnectionFlightService interconnectionFlightService) {
        this.interconnectionFlightService = interconnectionFlightService;
    }

    @RequestMapping(method = RequestMethod.GET)
    Collection<InterconnectedFlightsDto> getRoutes(@RequestParam String departure,
                                                   @RequestParam String arrival,
                                                   @RequestParam Date departureDateTime,
                                                   @RequestParam Date arrivalDateTime) {

        InterconnectedFlightScheduleDto interconnectedFlightScheduleDto = InterconnectedFlightScheduleDto.builder()
                .departureAirport(departure)
                .arrivalAirport(arrival)
                .departureDateTime(departureDateTime)
                .arrivalDateTime(arrivalDateTime)
                .build();

        return interconnectionFlightService.getInterconnectedFlights(interconnectedFlightScheduleDto);
    }
}
