package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class WorkingTimeController {
    @Autowired
    WorkingTimeService workingTimeService;

    @PostMapping(path="/add")
    public WorkingTime createWorkingTime(@RequestBody WorkingTime workingTime){
        return workingTimeService.saveWorkingTime(workingTime);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<WorkingTime> getWorkingTimeList(){
        return workingTimeService.findAll();

    }

    @GetMapping("/{idWorkingTime}")
    public ResponseEntity<WorkingTime>  getWorkingTimeByID(@PathVariable("idWorkingTime") Long idWorkingTime) throws Exception {
        return  ResponseEntity.ok(workingTimeService.getById(idWorkingTime).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public WorkingTime updateWorkingTime(@RequestBody WorkingTime workingTime){
        return workingTimeService.updateWorkingTime(workingTime);
    }

    @DeleteMapping("/{idWorkingTime}")
    public ResponseEntity deleteByID(@PathVariable("idWorkingTime") Long idWorkingTime) throws Exception {
       try {
           workingTimeService.deleteWorkingTime(idWorkingTime);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
