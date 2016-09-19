package com.seatplus.controllers;

import com.seatplus.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anushka.ekanayake on 9/4/2016.
 * Create user accounts for bus owners and buses and passengers (2phase)
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        userService.testService();
        return "ok";
    }
}
