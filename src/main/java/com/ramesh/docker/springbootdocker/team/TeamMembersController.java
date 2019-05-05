package com.ramesh.docker.springbootdocker.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TeamMembersController {


   // make a private member variable of Business service

    @Autowired
    private TeamService teamService;

    // mapping for getting all the teams details
    @RequestMapping("/teams")
    public List<Team> getAllTeams(){
        return teamService.getTeams();
    }

    // getting details of specific team -- takes {team} as input


    @RequestMapping("/teams/{id}")
    public Team getTeam(@PathVariable String id){
        return teamService.getTeam(id);
    }


    // lets add some new team to our service
    // HTTP POST

    @RequestMapping(method=RequestMethod.POST,value = "/teams")

    public void addTeam(@RequestBody Team team){

        teamService.addTeam(team);

    }

    // Update a team
    // need team to be updated and new team details [json]

    @RequestMapping(method = RequestMethod.PUT, value = "teams/{id}")

    public void updateTeam(@RequestBody Team team, @PathVariable String id){
    teamService.updateTeam(id,team);
    }

    // delete a team
    // need team to be updated and new team details [json]

    @RequestMapping(method = RequestMethod.DELETE, value = "teams/{id}")

    public void deleteTeam(@PathVariable String id){
        teamService.deleteTeam(id);
    }

}
