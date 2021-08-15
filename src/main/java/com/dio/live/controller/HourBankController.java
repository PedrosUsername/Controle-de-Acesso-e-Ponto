package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/banco")
public class HourBankController {
    @Autowired
    HourBankService hourBankService;

    @PostMapping(path="/add")
    public HourBank createHourBank(@RequestBody HourBank hourBank){
        return hourBankService.saveHourBank(hourBank);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<HourBank> getHourBankList(){
        return hourBankService.findAll();

    }

    @GetMapping("/{idHourBank}")
    public ResponseEntity<HourBank>  getHourBankByID(@PathVariable("idHourBank") Long idHourBank) throws Exception {
        return  ResponseEntity.ok(hourBankService.getById(idHourBank).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public HourBank updateHourBank(@RequestBody HourBank hourBank){
        return hourBankService.updateHourBank(hourBank);
    }

    @DeleteMapping("/{idHourBank}")
    public ResponseEntity deleteByID(@PathVariable("idHourBank") Long idHourBank) throws Exception {
       try {
           hourBankService.deleteHourBank(idHourBank);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
