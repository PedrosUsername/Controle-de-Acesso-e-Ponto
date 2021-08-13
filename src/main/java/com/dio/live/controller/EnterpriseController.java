package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/empresa")
public class EnterpriseController {
    @Autowired
    EnterpriseService enterpriseService;

    @PostMapping(path="/add")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise){
        return enterpriseService.saveEnterprise(enterprise);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<Enterprise> getEnterpriseList(){
        return enterpriseService.findAll();

    }

    @GetMapping("/{idEnterprise}")
    public ResponseEntity<Enterprise>  getEnterpriseByID(@PathVariable("idEnterprise") Long idEnterprise) throws Exception {
        return  ResponseEntity.ok(enterpriseService.getById(idEnterprise).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Enterprise updateEnterprise(@RequestBody Enterprise enterprise){
        return enterpriseService.updateEnterprise(enterprise);
    }

    @DeleteMapping("/{idEnterprise}")
    public ResponseEntity deleteByID(@PathVariable("idEnterprise") Long idEnterprise) throws Exception {
       try {
           enterpriseService.deleteEnterprise(idEnterprise);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
