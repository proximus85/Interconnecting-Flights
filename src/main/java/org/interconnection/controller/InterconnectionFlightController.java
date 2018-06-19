package org.interconnection.controller;

import org.interconnection.domain.Route;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/interconnections")
public class InterconnectionFlightController {

    @RequestMapping(method = RequestMethod.GET)
    Collection<Route> getRoutes() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Collection<Route>> routes =
                restTemplate.exchange("https://api.ryanair.com/core/3/routes/",
                        HttpMethod.GET, null, new ParameterizedTypeReference<Collection<Route>>() {
                        });


        return routes.getBody();
    }
}
