package com.seatplus.Services;

import com.seatplus.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by anushka.ekanayake on 9/5/2016.
 * Handle all the services related to users of this system
 */
public class UserService {

    /**
     * Add new user to the platform
     *
     * @param user
     * @return
     */
    public ResponseEntity<String> addUser(User user) {
        ResponseEntity<String> responseEntity = new ResponseEntity<String>(HttpStatus.BAD_REQUEST);

        //if success response entity will be assigned a created http status
        return responseEntity;
    }

    /**
     * Delete an existing user account from the platform
     * @param id = userID
     * @return
     */
    public ResponseEntity<String> removeUser(int id) {
        ResponseEntity<String> responseEntity = new ResponseEntity<String>(HttpStatus.BAD_REQUEST);

        return responseEntity;
    }

}
