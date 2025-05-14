package org.cospessardegna.Giornaliera.controller;

import org.cospessardegna.Giornaliera.entities.User;
import org.cospessardegna.Giornaliera.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;

    }
    @GetMapping
    public List<User> getAll(){
         return userService.findAll();
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
        return userService.findById(id).orElseThrow();
    }
    @PostMapping
    public User create(@RequestBody User user){
        return userService.save(user);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        userService.deleteById(id);
    }

}
