package com.ramesh.docker.springbootdocker.persondetails;

public class PersonDetails {

    private int age;
    public  String name;
    private  String company;

    public PersonDetails(int age, String name, String company) {
        this.age = age;
        this.name = name;
        this.company = company;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
