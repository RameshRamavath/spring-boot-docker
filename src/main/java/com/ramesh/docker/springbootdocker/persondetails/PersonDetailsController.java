package com.ramesh.docker.springbootdocker.persondetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController

/*

A Controller is just a JAVA class marked with Annotations, and has two info's

1. What URL access triggers it
2. What method to run when accessed

--> Controller == [URI, HTTP method, Java method {business functionality}]


 */

public class PersonDetailsController {

    @RequestMapping("/persondetails/get")
    @GetMapping // for telling HTTP GET method

    // this method gives list of PersonalDetails object

    public List<PersonDetails> GetPersonDeatils(){
        return Arrays.asList(
            new PersonDetails(25,"Ramesh","WU"),
                new PersonDetails(26,"Mahesh","CTS")
        );
    }
}
