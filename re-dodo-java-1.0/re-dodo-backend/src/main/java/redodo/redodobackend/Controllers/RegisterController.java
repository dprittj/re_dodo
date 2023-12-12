package redodo.redodobackend.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import redodo.redodobackend.Models.User;

import java.util.Calendar;

import static redodo.redodobackend.Controllers.UserController.allUsers;
import static redodo.redodobackend.Controllers.UserController.alldodos;

@Controller
public class RegisterController {

//    @PostMapping("/regUser")
//    public String processNewUser(@RequestParam String registerName, String registerPass, String email, Integer phone, Calendar birth, String homeCoords) {
////        model.addAttribute("users", allUsers);
//        allUsers.add(new User(registerName, registerPass, email, phone, birth, homeCoords));
//        alldodos.put(registerName, new User (registerName, registerPass, email, phone, birth, homeCoords));
////        usersDB.add(new User(registerName, registerPass, email, phone, birth, homeCoords));
////        System.out.println(allUsers.get(0));
//        return "profilebuild";
//    }

}
