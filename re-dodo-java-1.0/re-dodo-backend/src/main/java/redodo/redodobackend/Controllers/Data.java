package redodo.redodobackend.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

//    this controller class will perform CRUD operations on data and send back results to the necessary other controllers!
@Controller
public class Data {

    @PostMapping("/userlogin")
    public String processLogin(@RequestParam String username, String password){

        boolean flip = false;
        boolean flop = false;
//        package data and send to Models to perform operations listed below?
//
//        if username is found in database, and if password matches saved password for said username, then success! and if successful:
//        return "usernest";
//
//        however, if unsuccessful:
//        return "login";

           //  TESTING METHODS:
            if (Objects.equals(username, Scratch.getUsername())) {
                flip = true;
            }

            if (Objects.equals(username, Scratch.getPassword())) {
                flop=true;
            }

            if (flip && flop){
                return "usernest";
            } else {
                System.out.println("Incorrect. Goodbye.");
                return "login";
            }

//           if ((Objects.equals(username, Scratch.getUsername())) && (Objects.equals(password, Scratch.getPassword()))) {
//               System.out.println("Correct! Hello, finley.");
//               return "usernest";
//           }

    }



}
