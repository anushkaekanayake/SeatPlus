package com.seatplus.models;

import javax.persistence.*;

/**
 * Created by anushka.ekanayake on 9/5/2016.
 */
@Entity
@Table(name = "User")
public class User {
    @Id
    private Integer user_id;
    
    private String user_name;

    private String password;

    private String email;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
