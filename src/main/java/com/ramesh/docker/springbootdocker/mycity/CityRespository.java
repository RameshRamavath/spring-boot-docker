package com.ramesh.docker.springbootdocker.mycity;

import org.springframework.data.repository.CrudRepository;

public interface CityRespository extends CrudRepository <City,String>{

    // basically Spring has an Interface which handles all CRUD operations on databases out of box
    // because these operations are standard on any Entity

    // Interface is --> CrudRepository  --> we need to give generic data types [our repository class and Id type] --> with we will get
    // all basic methods under CityRepository

    // we just need to add if any special methods required for our repository


    // ==> pass this dependency to our Service class and use default CRUD operations [Instead of writing our own methods]
}
