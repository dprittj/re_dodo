package redodo.redodobackend.Models;

import java.util.Set;

public class User {

//    fields
    private static String username;
    private static int userId;
    private static String password;
    private static String email;
    private static int phone;
    private static int dob;
    private static int homeCoords;

    private static Set<Interest> userInterests;



//    constructors

    public User() {

    }

    public User(String aUsername, String aPassword, String aEmail, int aPhone, int aDob, int aHomeCoords) {
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

//    getters and setters

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

    public int getDob() {
        return dob;
    }

    public void setDob(int aDob) {
        this.dob = aDob;
    }

    public int getHomeCoords() {
        return homeCoords;
    }

    public void setHomeCoords(int aHomeCoords) {
        this.homeCoords = aHomeCoords;
    }

}
