package com.seatplus.repository;

import com.seatplus.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by anushka.ekanayake on 9/18/2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
