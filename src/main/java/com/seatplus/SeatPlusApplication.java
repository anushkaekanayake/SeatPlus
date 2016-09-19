package com.seatplus;

import com.seatplus.models.User;
import com.seatplus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SeatPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeatPlusApplication.class, args);

	}


}
