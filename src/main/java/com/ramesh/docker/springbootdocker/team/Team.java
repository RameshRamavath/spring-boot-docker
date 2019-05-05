package com.ramesh.docker.springbootdocker.team;

public class Team {

    // this for defining our member variable, getters and setters

    private String team;
    private String empName;
    private String track;
    private int yearsOfExp;


    // default constructor
    public Team (){

    }

    // parameterized constructor
    public Team(String team, String empName, String track, int yearsOfExp) {
        this.team = team;
        this.empName = empName;
        this.track = track;
        this.yearsOfExp = yearsOfExp;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
}
