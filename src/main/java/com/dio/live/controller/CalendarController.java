package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/calendario")
public class CalendarController {
    @Autowired
    CalendarService calendarService;

    @PostMapping(path="/add")
    public Calendar createCalendar(@RequestBody Calendar calendar){
        return calendarService.saveCalendar(calendar);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<Calendar> getCalendarList(){
        return calendarService.findAll();

    }

    @GetMapping("/{idCalendar}")
    public ResponseEntity<Calendar>  getCalendarByID(@PathVariable("idCalendar") Long idCalendar) throws Exception {
        return  ResponseEntity.ok(calendarService.getById(idCalendar).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Calendar updateCalendar(@RequestBody Calendar calendar){
        return calendarService.updateCalendar(calendar);
    }

    @DeleteMapping("/{idCalendar}")
    public ResponseEntity deleteByID(@PathVariable("idCalendar") Long idCalendar) throws Exception {
       try {
           calendarService.deleteCalendar(idCalendar);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
