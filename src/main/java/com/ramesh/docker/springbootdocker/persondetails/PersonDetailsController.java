package com.ramesh.docker.springbootdocker.persondetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController

public class PersonDetailsController {

    @RequestMapping("/persondetails/get")
    @GetMapping

    public List<PersonDetails> GetPersonDeatils(){
        return Arrays.asList(
            new PersonDetails(25,"Ramesh","WU"),
                new PersonDetails(26,"Mahesh","CTS")
        );
    }
}
