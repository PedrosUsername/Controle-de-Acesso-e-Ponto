package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/data")
public class DateTypeController {
    @Autowired
    DateTypeService dateTypeService;

    @PostMapping(path="/add")
    public DateType createDateType(@RequestBody DateType dateType){
        return dateTypeService.saveDateType(dateType);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<DateType> getDateTypeList(){
        return dateTypeService.findAll();

    }

    @GetMapping("/{idDateType}")
    public ResponseEntity<DateType>  getDateTypeByID(@PathVariable("idDateType") Long idDateType) throws Exception {
        return  ResponseEntity.ok(dateTypeService.getById(idDateType).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public DateType updateDateType(@RequestBody DateType dateType){
        return dateTypeService.updateDateType(dateType);
    }

    @DeleteMapping("/{idDateType}")
    public ResponseEntity deleteByID(@PathVariable("idDateType") Long idDateType) throws Exception {
       try {
           dateTypeService.deleteDateType(idDateType);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
