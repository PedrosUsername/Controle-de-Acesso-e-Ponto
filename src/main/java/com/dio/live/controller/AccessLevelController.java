package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/nivel")
public class AccessLevelController {
    @Autowired
    AccessLevelService accessLevelService;

    @PostMapping(path="/add")
    public AccessLevel createAccessLevel(@RequestBody AccessLevel accessLevel){
        return accessLevelService.saveAccessLevel(accessLevel);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<AccessLevel> getAccessLevelList(){
        return accessLevelService.findAll();

    }

    @GetMapping("/{idAccessLevel}")
    public ResponseEntity<AccessLevel>  getAccessLevelByID(@PathVariable("idAccessLevel") Long idAccessLevel) throws Exception {
        return  ResponseEntity.ok(accessLevelService.getById(idAccessLevel).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public AccessLevel updateAccessLevel(@RequestBody AccessLevel accessLevel){
        return accessLevelService.updateAccessLevel(accessLevel);
    }

    @DeleteMapping("/{idAccessLevel}")
    public ResponseEntity deleteByID(@PathVariable("idAccessLevel") Long idAccessLevel) throws Exception {
       try {
           accessLevelService.deleteAccessLevel(idAccessLevel);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
