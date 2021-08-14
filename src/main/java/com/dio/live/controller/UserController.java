package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(path="/add")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<User> getUserList(){
        return userService.findAll();

    }

    @GetMapping("/{idUser}")
    public ResponseEntity<User>  getUserByID(@PathVariable("idUser") Long idUser) throws Exception {
        return  ResponseEntity.ok(userService.getById(idUser).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{idUser}")
    public ResponseEntity deleteByID(@PathVariable("idUser") Long idUser) throws Exception {
       try {
           userService.deleteUser(idUser);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
