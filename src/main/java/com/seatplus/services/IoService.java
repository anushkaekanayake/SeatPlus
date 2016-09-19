package com.seatplus.services;

import com.seatplus.utils.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anushka.ekanayake on 9/7/2016.
 * read project configuration files and map to relevant models and pass for further usage
 */
public class IoService {

    public List meaageReader(String status) {
        ArrayList<String> actionList = new ArrayList<>();

        switch (status) {
            case Constants.STUS_SUCCESS_RESERVATION:
                actionList.add(Constants.MSG_SUCCESS_RESERVATION_PATH_USER);
                actionList.add(Constants.MSG_SUCCESS_RESERVATION_PATH_SELLER);
                break;
            case Constants.STUS_CANCEL_RESERVATION:
                actionList.add(Constants.MSG_CANCEL_RESERVATION_PATH_SELLER);
                actionList.add(Constants.MSG_CANCEL_RESERVATION_PATH_USER);
                break;
            case Constants.STUS_RESERVATION_SUMMERY_SELLER:
                actionList.add(Constants.MSG_RESERVATION_SUMMERY);
                break;
            case Constants.MSG_FAIL_RESERVATION_PATH_ADMIN:
                actionList.add(Constants.MSG_FAIL_RESERVATION_PATH_ADMIN);
                break;
            case Constants.STUS_OTHER_PROMO_SELLER:
                actionList.add(Constants.MSG_PROMOTIONS_PATH_SELLER);
                break;
            case Constants.STUS_OTHER_PROMO_USER:
                actionList.add(Constants.MSG_PROMOTIONS_PATH_USER);
                break;
            default:
                actionList.add(Constants.MSG_SYSTEM_ALERT);
        }

        return confReader(actionList);
    }

    /**
     * Uses to read error message from configuration files
     *
     * @param paths json paths / xml paths
     * @return message object list with the correct values related to the status for different parties (sellers, users)- one object for one person
     */
    private static List confReader(ArrayList<String> paths) {

        //read the values and assign them to message object
        return new ArrayList<>();
    }
}
