package pl.eventFinderApp.eventFinder.controller;

import pl.eventFinderApp.eventFinder.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.eventFinderApp.eventFinder.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/{idUser}")
    public ResponseEntity<List<User>> findUserById(@PathVariable(name = "idUser") Integer idUser) {
//        List<User> users = new ArrayList<>();
        List<User> users = userRepository.findUserById(idUser);
        return ResponseEntity.ok().body(users);
    }
}
