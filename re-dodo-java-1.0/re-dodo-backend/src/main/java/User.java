public class User {

//    fields
    String username;
    int userId;
    String password;
    String email;
    int phone;
    int dob;
    int homeCoords;

//    constructors

    public User() {

    }

    public User( String aUsername, String aPassword, String aEmail, int aPhone, int aDob, int aHomeCoords) {
        this.username = aUsername;
        this.password = aPassword;
        this.email = aEmail;
        this.phone = aPhone;
        this.dob = aDob;
        this.homeCoords = aHomeCoords;

    }

    public User (String aUsername, int aUserId, String aPassword) {
        this.username = aUsername;
        this.password = aPassword;
        this.userId = aUserId;
    }

}
