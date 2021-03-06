package com.seatplus.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anushka.ekanayake on 9/4/2016.
 * System admin related services, all analytics
 */
@RestController
@RequestMapping("/ad-service")
public class AdminController {


    @RequestMapping(value = "/fist-service",method = RequestMethod.GET)
    public ResponseEntity<?> firstService(){

        return new ResponseEntity<>("Test - service - response",HttpStatus.OK);
    }
}
