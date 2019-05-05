package com.ramesh.docker.springbootdocker.welcome;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*

RestController is just a Java class which is marked as annotation -
This tells our boot application - ResourceController as a REST resource controller


A ResourceController will have two things

1. An URL to access
2. Methods under it which will be invoked when we hit REST URL

@ RequestMapping - Used for defining URL for a given RestController
@ GetMapping - s a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).

 */

/*

=== Spring MVC controller ====

It is used for building web applications [java framework]

A Spring MVC provides an elegant solution to use MVC in spring framework by the help of DispatcherServlet.
Here, DispatcherServlet is a class that receives the incoming request and maps it to the right resource such as controllers, models, and views.


---> its looks for request from User, maps the URL, method from User to our existing controller's within our application

 */
@RestController


public class WelcomeController {


    @RequestMapping("/spring/welcome")
    @GetMapping

    public String Welcome(){

        return "Welcome to Spring-boot learning Mr. Ramesh";
    }

    /*
     So when we try to access http://localhost:8085//rest/spring/welcome -- Get HTTP method on Welcome method inside
     ResourceController Class will be executed.
     */
}
