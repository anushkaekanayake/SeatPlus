package org.seatplus.Services;

import org.seatplus.models.Reservation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by anushka.ekanayake on 9/7/2016.
 * Uses to handle all the services related to reservation of seats
 */
public class ReservationService {

    /**
     * add new reservation
     *
     * @param reservation Reservation object
     * @return responseEntity
     */
    public ResponseEntity<String> reserve(Reservation reservation) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);

        return responseEntity;
    }


    public ResponseEntity<String> cancelReservation(int id) {
        ResponseEntity<String> responseEntity = new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
//remove an existing reservation
        return responseEntity;
    }

}
