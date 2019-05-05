package com.ramesh.docker.springbootdocker.mycity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

   /*

    JPA -- JAVA persistence API - A specific which let's us to do ORM when we connecting to RDBMS database

    --> Object Relational Mapping
    --> ORM helps us to map our class to Table in a SQL DB
    --> Configure entity classes and JPA framework will take care

    What is Spring Data JPA?

    makes things even easier in Spring

     */

@RestController
public class CityController {



   // make a private member variable of Business service

    @Autowired
    private CityService cityService;

    // mapping for getting all the teams details

    @RequestMapping("/cities")

    public List<City> getAllCities(){
        return cityService.getAllCities();
    }


    // lets add some new city to our service
    // HTTP POST

    @RequestMapping(method=RequestMethod.POST,value = "/cities")

    public void addCity(@RequestBody City city){

        cityService.addCity(city);

    }

   /*  // get one person details

    @RequestMapping(method = RequestMethod.GET, value = "/cities/{person}")

    public String City getOneCity(@PathVariable String person){
       return City;
    } */

    // Update a person
    // need person to be updated and updated  person details [json]

    @RequestMapping(method = RequestMethod.PUT, value = "cities/{person}")

    public void updateTeam(@RequestBody City city, @PathVariable String person){
    cityService.updateCity(city, person);
    }

    // delete a team
    // need team to be updated and new team details [json]

    @RequestMapping(method = RequestMethod.DELETE, value = "cities/{person}")

    public void deleteTeam(@PathVariable String person){
        cityService.deleteCity(person);
    }

}
