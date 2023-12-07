package redodo.redodobackend.Models;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class User {

//  ---fields---
    private static String username;
    private static int userId;
    private static String password;
    private static String email;
    private static Integer phone;
    private static Calendar dob;
    private static String homeCoords;

    private static Set<Interest> userInterests;

    public static ArrayList<User> usersDB = new ArrayList<>();



//  ---constructors---

    public User() { }

    public User(String aUsername, String aPassword, String aEmail, Integer aPhone, Calendar aDob, String aHomeCoords) {
        this.username = aUsername;
        this.password = aPassword;
        this.email = aEmail;
        this.phone = aPhone;
        this.dob = aDob;
        this.homeCoords = aHomeCoords;

    }

    public User(String aUsername, int aUserId, String aPassword) {
        this.username = aUsername;
        this.password = aPassword;
        this.userId = aUserId;
    }

//  ---getters & setters---

    public String getUsername() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String aEmail) {
        this.email = aEmail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int aPhone) {
        this.phone = aPhone;
    }

    public Calendar getDob() {
        return dob;
    }

    public void setDob(Calendar aDob) {
        this.dob = aDob;
    }

    public String getHomeCoords() {
        return homeCoords;
    }

    public void setHomeCoords(String aHomeCoords) {
        this.homeCoords = aHomeCoords;
    }


//  ---data/DB---
//    username = "Daniel";
//    password = "123456";
//    email = "dprittj@gmail.com";
//    phone = 1234567890;
//    dob = Calendar.getInstance();
//    homeCoords = "STL";



}
