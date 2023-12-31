package redodo.redodobackend.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class Navigation {

    @GetMapping("/")
    public String dodo_main(){
        return "dodo-home";
    }

//    From dodo-main, <Enter> :
//    kicks to the login/or/register page
    @GetMapping("dodo-login-register")
    public String enter(){
        return "dodo-login-register";
    }

//  user either enters credentials (login) or registers; if entering credentials see LOGIN immediately below; if registering, go down to REGISTER

//  LOGIN

    @PostMapping("dodo-landing-pad/profile")
    public static void login(String username, String password){
//        1.0    send to data-controller for verification; and:
//        1.1    if verified, send data to goToProfile() nav controller method below.

//        1.101  if unverified, try again, and:
//        1.102  if still unverified, send back enter() method above with error message;
    }

    @GetMapping("dodo-user-nest")
    public static String goToProfile(String username, int userId, String userProfile){
//      retrieve user data via data-controller, and populate dodo-user-nest via Nest controller
        return userProfile;
    }

    @GetMapping("dodo-landing-pad/bird-unknown")
    public static String birdUnknown(){

//        generate error message, and:
//        send user back to dodo-landing-pad (ie, login/register) to try again
//        see enter() method above;
        return "dodo-landing-pad";
    }

//    REGISTER

    @PostMapping("dodo-landing-pad/register")
    public static void newUser(){
//        kick to createNew data-controller;
//        take user to newProfile controller to create profile

    }

    @GetMapping("dodo-user-nest/new")
    public static String newProfile(){
//        takes user to new profile method in Nest controller
        return "newUserNest.html";
    }



}
