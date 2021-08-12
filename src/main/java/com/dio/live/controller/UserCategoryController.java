package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoria")
public class UserCategoryController {
    @Autowired
    UserCategoryService userCategoryService;

    @PostMapping(path="/add")
    public UserCategory createUserCategory(@RequestBody UserCategory userCategory){
        return userCategoryService.saveUserCategory(userCategory);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<UserCategory> getUserCategoryList(){
        return userCategoryService.findAll();

    }

    @GetMapping("/{idUserCategory}")
    public ResponseEntity<UserCategory>  getUserCategoryByID(@PathVariable("idUserCategory") Long idUserCategory) throws Exception {
        return  ResponseEntity.ok(userCategoryService.getById(idUserCategory).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public UserCategory updateUserCategory(@RequestBody UserCategory userCategory){
        return userCategoryService.updateUserCategory(userCategory);
    }

    @DeleteMapping("/{idUserCategory}")
    public ResponseEntity deleteByID(@PathVariable("idUserCategory") Long idUserCategory) throws Exception {
       try {
           userCategoryService.deleteUserCategory(idUserCategory);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
