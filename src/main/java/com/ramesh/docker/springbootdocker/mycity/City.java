package com.ramesh.docker.springbootdocker.mycity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

    // this for defining our member variable, getters and setters

    // while using JPA, we need to tell SPRING that, this object or elements of this class will be stored/retrieved from DB

    // Ex: City is my table name and it has below three columns

    // each instance of this class is a Row in my table.

    // this can done by declaring as @Entity class -- With that JPA will understand to create Table and respective columns.

    //IMP :: What is my key for this table [Must for any table in RDBMS] --> @Id annotation

    @Id
    private String Person;
    private String CityName;
    private int Age;


    public City(String person, String cityName, int age) {
        Person = person;
        CityName = cityName;
        Age = age;
    }

    // default constructor
    public City(){

    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getPerson() {
        return Person;
    }

    public void setPerson(String person) {
        Person = person;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
