package com.lcwd.springmvc.model;

import javax.persistence.*;

/*
    name of variable and client side input tag name must be same otherwise mapping will not occur and give error.
    number of variable must be same as no of input tag at client side
*/
@Entity
public class User {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
    private String username;
    private String useremail;
    private String userpassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", useremail='" + useremail + '\'' +
                ", userpassword='" + userpassword + '\'' +
                '}';
    }
}
