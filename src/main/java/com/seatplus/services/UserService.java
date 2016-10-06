package com.seatplus.services;

import com.seatplus.models.User;
import com.seatplus.repository.UserRepository;
import com.seatplus.utils.Messenger;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public ResponseEntity<Object> addUser(User user) {
        ResponseEntity<Object> responseEntity;
        try {
            //check in the db, whether this user is exist
            User userExisting = userRepository.findOne(user.getUser_id());
            if (userExisting != null) {
                //this user is existing
                Messenger messenger =new Messenger("This user is already exist");
                responseEntity = new ResponseEntity<>(messenger, HttpStatus.BAD_REQUEST);

            } else {
                userRepository.save(user);
                responseEntity = new ResponseEntity<>(HttpStatus.CREATED);
            }
        } catch (HibernateException ex) {
            responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            ex.printStackTrace();
        }
        return responseEntity;
    }

    /**
     * Delete an existing User account from the platform
     *
     * @param id = userID
     * @return response entity with the return code
     */
    @Transactional
    public ResponseEntity<String> removeUser(int id) {
        ResponseEntity<String> responseEntity;
        try {
            userRepository.delete(id);
            responseEntity = new ResponseEntity<>(HttpStatus.OK);
        } catch (HibernateException ex) {
            responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            ex.printStackTrace();
        }

        return responseEntity;
    }

    /**
     * update the existing User profile
     *
     * @param user
     * @return response entity with the relevant return code
     */
    @Transactional
    public ResponseEntity<String> updateUser(User user) {
        ResponseEntity<String> responseEntity;

        try {
            userRepository.save(user);
            responseEntity = new ResponseEntity<>(HttpStatus.OK);
        } catch (HibernateException ex) {
            responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            ex.printStackTrace();
        }

        return responseEntity;
    }


}
