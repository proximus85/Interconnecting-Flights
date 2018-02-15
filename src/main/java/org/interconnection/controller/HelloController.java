package org.interconnection.controller;

import org.interconnection.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

@RestController
@RequestMapping("/interconnecting-flights")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello() {
        return "Hello";
    }

    @RequestMapping(value = "/helloGuys", method = RequestMethod.GET)
    Collection<Person> getUserList() {
        return Arrays.asList(
                new Person("Tomasz", "Nowak"),
                new Person("Adam", "Nowak"),
                new Person("Pawel", "Nowak")
        );
    }
}
