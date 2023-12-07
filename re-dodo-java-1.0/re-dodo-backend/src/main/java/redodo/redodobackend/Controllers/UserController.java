package redodo.redodobackend.Controllers;

import org.springframework.boot.SpringApplicationShutdownHandlers;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import redodo.redodobackend.Models.User;

import java.util.Calendar;
import java.util.Objects;

import static redodo.redodobackend.Models.User.usersDB;

public class UserController {

    @PostMapping("/userlogin")
    public String processLogin(@RequestParam String loginName, String loginPass){

//  package data and send to Models to perform operations listed below?
//
//  if username is found in database, and if password matches saved password for said username, then success! and if successful:
//          return "usernest";
//
//  however, if unsuccessful:
//          return "login";

//   TESTING METHODS:
        if (Objects.equals(loginName, Scratch.getUsername()) && Objects.equals(loginPass, Scratch.getPassword())){
            return "usernest";
        } else {
            return "login-error";
        }

    }


    @PostMapping("/registeruser")
    public static String processNewUser(@RequestParam Model model, String registerName, String registerPass, String email, Integer phone, Calendar birth, String homeCoords) {

        usersDB.add(new User(registerName, registerPass, email, phone, birth, homeCoords));
        model.addAttribute("usersDB", usersDB);

        return "profilebuild";
    }

}
