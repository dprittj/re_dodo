package Models;

public class UserModel {

//    fields
    private String username;
    private int userId;
    private String password;
    private String email;
    private int phone;
    private int dob;
    private int homeCoords;

//    constructors

    public UserModel() {

    }

    public UserModel(String aUsername, String aPassword, String aEmail, int aPhone, int aDob, int aHomeCoords) {
        this.username = aUsername;
        this.password = aPassword;
        this.email = aEmail;
        this.phone = aPhone;
        this.dob = aDob;
        this.homeCoords = aHomeCoords;

    }

    public UserModel(String aUsername, int aUserId, String aPassword) {
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
