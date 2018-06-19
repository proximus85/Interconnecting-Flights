package org.interconnection.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DailyFlightSchedule {
    private int dayInMonthNumber;
    private Collection<FlightTime> flightTimes = new ArrayList();
}
