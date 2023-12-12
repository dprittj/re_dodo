package redodo.redodobackend.Models;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

public class User {

//  ---fields---
    private static String username;
    private static int userId;
    private static String password;
    private static String email;
//    private static Integer phone;
    private static String dob;
    private static String homeCoords;
    private static Set<Interest> userInterests;




//  ---constructors---

    public User() { }

    public User(String aUsername, String aPassword, String aEmail, String aDob, String aHomeCoords) {
        this.username = aUsername;
        this.password = aPassword;
        this.email = aEmail;
//        this.phone = aPhone;
        this.dob = aDob;
        this.homeCoords = aHomeCoords;
    }

    public User(String aUsername, int aUserId, String aPassword) {
        this.username = aUsername;
        this.password = aPassword;
        this.userId = aUserId;
    }

//  ---getters & setters---

    public static String getUsername() {
        return username;
    }

    public void setUsername(String aUsername){
        this.username = aUsername;
    }

    public int getUserId() {
        return userId;
    }

    public void setPassword(String aPassword) {
        this.password = aPassword;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String aEmail) {
        email = aEmail;
    }

//    public int getPhone() {
//        return phone;
//    }

//    public void setPhone(int aPhone) {
//        this.phone = aPhone;
//    }

    public String getDob() {
        return dob;
    }

    public static void setDob(String aDob) {
        dob = aDob;
    }

    public static String getHomeCoords() {
        return homeCoords;
    }

    public static void setHomeCoords(String aHomeCoords) {
        homeCoords = aHomeCoords;
    }

    public void addDetails(String username, String email, String dob, String homeCoords){
       if (User.getUsername().equals(username)){
           User.setEmail(email);
           User.setDob(dob);
           User.setHomeCoords(homeCoords);
       }
    }



//  ---data/DB---
//    username = "Daniel";
//    password = "123456";
//    email = "dprittj@gmail.com";
//    phone = 1234567890;
//    dob = Calendar.getInstance();
//    homeCoords = "STL";

//    "Daniel", "123456", "dprittj@gmail.com", 1234567890, Calendar.getInstance(),"STL"



}
