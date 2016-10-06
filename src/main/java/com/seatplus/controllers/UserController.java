package com.seatplus.controllers;

import com.seatplus.models.User;
import com.seatplus.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Created by anushka.ekanayake on 9/4/2016.
 * Create User accounts for bus owners and buses and passengers (2phase)
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * add new users
     *
     * @param userObj
     * @return response entity with return code
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Object> addUser(@RequestBody User userObj) {
        return userService.addUser(userObj);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<String> updateUser(@RequestBody User userObj) {
        return userService.updateUser(userObj);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        return userService.removeUser(id);
    }


}

