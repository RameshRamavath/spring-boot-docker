package com.ramesh.docker.springbootdocker.team;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TeamService {

    /*

    Business service are typically singletons - when application starts, Spring create an instance of this business service
    than it keeps it in memory and then we can declare the dependent controllers on this business service

    how to tell Spring as business service ==> @Service

    then how to use this in any of our controller --> create a private member variable [basically calling instance created as a variable]



    ex: private TeamService teamService; -- but we have to tell Spring to inject that dependency here
    for that we use @Autowired -- means teamService is the variable which is needs some dependency injection

     */

    // this is our business service for Team, which can be updated, deleted etc based on HTTP methods

    /*

Resource :: Rest API's deals with resources/entities - identify them first in-order to have that contract with Our REST API

Once we have resources then we can think about how the consumers want's to access these resources using diff HTTP methods

Ex: Team, Employee, Track [he is working], years of experience

here -- A team can have multiple Employees and an employee can work in multiple tracks


=========

Niw. HTTP methods define what we do with these resources -- simple access? or update? or create new ? or Delete

GET ::: /teams ---> get all teams
GET ::: /teams/id --> access individual team details

POST :: /teams --> create new team
PUT ::: /teams/id --> update the team details
DELETE :: /teams/id --> delete the team

 */
   // ArrayList is mutable
    private List<Team>  teams = new ArrayList<>( Arrays.asList(
            new Team("Bigdata","Ramesh","Analytics",5),
            new Team("Mobile","Mahesh","FrontEnd",6)
    ));


    // method which returns all teams details
    public List<Team> getTeams(){
        return teams;
    }

    // method for getting team details based on ID

    public  Team getTeam(String team){
        return teams.stream().filter(t -> t.getTeam().equals(team)).findFirst().get();
    }

    public  void addTeam(Team team){
        teams.add(team);
    }

    public void updateTeam(String id, Team team){

        // loop through each team and if team exists -- update it

        for (int i=0; i<teams.size(); i++){
            Team t = teams.get(i);
            if(t.getTeam().equals(id)){
                teams.set(i,team);
                return;
            }
        }

    }

    public void deleteTeam(String id){

       teams.removeIf(team -> team.getTeam().equals("id"));

    }
}
