package com.seatplus.services;

import com.seatplus.models.User;
import com.seatplus.repository.UserRepository;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anushka.ekanayake on 9/5/2016.
 * Handle all the services related to users of this system
 */
@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    /**
     * Add new User to the platform
     *
     * @param user
     * @return
     */
    @Transactional
    public ResponseEntity<String> addUser(User user) {
        ResponseEntity<String> responseEntity;
        try {
            userRepository.save(user);
            responseEntity = new ResponseEntity<>(HttpStatus.CREATED);
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }

        responseEntity = new ResponseEntity<>(HttpStatus.CREATED);


        //if success response entity will be assigned a created http status
        return responseEntity;
    }

    /**
     * Delete an existing User account from the platform
     *
     * @param id = userID
     * @return
     */
    public ResponseEntity<String> removeUser(int id) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return responseEntity;
    }

    /**
     * update the existing User profile
     *
     * @param User
     * @return reponse entity with the relevant return code
     */
    public ResponseEntity<String> updateUser(User User) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return responseEntity;
    }


}
