package com.seatplus.services;

import com.seatplus.models.User;
import com.seatplus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by anushka.ekanayake on 9/5/2016.
 * Handle all the services related to users of this system
 */
@Service
public class UserService {
@Autowired
    UserRepository userRepository;

    public void testService(){
        /*User user=new User();
        user.setUserId(2);
        user.setUser_name("user2");
        user.setPassword("user2_pw");
        user.setEmail("user2@stp.com");
        userRepository.save(user);*/
        System.out.println("++++++++++++++++++++++");
        List<User> userList=userRepository.findAll();
        for (User obj:userList) {
            System.out.println(obj.getEmail().toString());
        }

    }

    /**
     * Add new user to the platform
     *
     * @param user
     * @return
     */
    public ResponseEntity<String> addUser(User user) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        //if success response entity will be assigned a created http status
        return responseEntity;
    }

    /**
     * Delete an existing user account from the platform
     *
     * @param id = userID
     * @return
     */
    public ResponseEntity<String> removeUser(int id) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return responseEntity;
    }

    /**
     * update the existing user profile
     *
     * @param user
     * @return reponse entity with the relevant return code
     */
    public ResponseEntity<String> updateUser(User user) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return responseEntity;
    }
    

}
