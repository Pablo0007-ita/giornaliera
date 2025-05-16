package org.cospessardegna.giornaliera.controller;

import org.cospessardegna.giornaliera.entities.User;
import org.cospessardegna.giornaliera.service.UserService;
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
        return userService.findById(id).orElseThrow();}
    @PostMapping
    public User create(@RequestBody User user){
        User tmp= user;
        System.out.println(""+tmp);

        return userService.save(user);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        userService.deleteById(id);
    }

}
