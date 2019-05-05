package com.ramesh.docker.springbootdocker.mycity;


import com.ramesh.docker.springbootdocker.mycity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CityService {

    // inject CityRepository here

    @Autowired
    private CityRespository cityRespository;

   // ArrayList is mutable
    private List<City>  city = new ArrayList<>( Arrays.asList(
            new City("Ramesh","Hyd", 25),
           new City("Mahesh","Pune",30)

    ));


    // lets use all default methods we got with CrudRepository

    public List<City> getAllCities(){

        // convert below iterable to List
        List<City> cities = new ArrayList<>();
        cityRespository.findAll().forEach(cities::add);
        return cities;
    }


    public void addCity(City city) {
        cityRespository.save(city);
    }

    public void updateCity(City city, String person){
        cityRespository.save(city);
    }

    public void deleteCity(String person){
        cityRespository.deleteById(person);
    }


}
