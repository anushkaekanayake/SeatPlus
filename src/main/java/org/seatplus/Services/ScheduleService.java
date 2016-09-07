package org.seatplus.Services;

import org.seatplus.models.Schedule;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by anushka.ekanayake on 9/7/2016.
 * Services related schedule related things
 */
public class ScheduleService {

    /**
     * add new schedule to the matching user (new bus adding)
     *
     * @param schedule schedule Object
     * @return responseEntity
     */
    public ResponseEntity<String> addSchedule(Schedule schedule) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        //add new schedule to the database
        return responseEntity;

    }


    /**
     * Update existing schedules
     *
     * @param schedule updated schedule object
     * @return responseEntity
     */
    public ResponseEntity<String> updateSchedule(Schedule schedule) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return responseEntity;
    }

    /**
     * Delete an existing schedule
     *
     * @param id scheduleID need to be removed
     * @return responseEntity
     */
    public ResponseEntity<String> deleteSchedule(int id) {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return responseEntity;
    }
}
