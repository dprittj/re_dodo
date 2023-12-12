package redodo.redodobackend.Controllers;

import org.springframework.boot.SpringApplicationShutdownHandlers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import redodo.redodobackend.Models.User;

import java.util.*;

//import static redodo.redodobackend.Controllers.Scratch.usersDB;
//import static redodo.redodobackend.Models.User.usersDB;

@Controller
public class UserController {

    static ArrayList<User> allUsers = new ArrayList<>();
    static HashMap<String, User> alldodos = new HashMap<>();



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

    @PostMapping("/regUser")
    public String processRegistration(@RequestParam  String registerName, String registerPass, String email, String dob, String homeCoords) {

        allUsers.add(new User(registerName, registerPass, email, dob, homeCoords));

        return "profilebuild";

    }


    @GetMapping("/userslist")
    public static String viewUsers(Model model){
//        System.out.println(allUsers.get(0));
        allUsers.add(new User("Daniel", "123456", "dprittj@gmail.com", "09-04-1985","STL"));
        model.addAttribute("allUsers", allUsers);
        model.addAttribute("dodos", alldodos);

//        usersDB.add(new User("Ashley", "123456", "ashley@gmail.com", 1234567890, Calendar.getInstance(), "STL"));
        return "userslist";
    }

}
