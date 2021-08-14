package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/ocorrencia")
public class OccurrenceController {
    @Autowired
    OccurrenceService occurrenceService;

    @PostMapping(path="/add")
    public Occurrence createOccurrence(@RequestBody Occurrence occurrence){
        return occurrenceService.saveOccurrence(occurrence);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<Occurrence> getOccurrenceList(){
        return occurrenceService.findAll();

    }

    @GetMapping("/{idOccurrence}")
    public ResponseEntity<Occurrence>  getOccurrenceByID(@PathVariable("idOccurrence") Long idOccurrence) throws Exception {
        return  ResponseEntity.ok(occurrenceService.getById(idOccurrence).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Occurrence updateOccurrence(@RequestBody Occurrence occurrence){
        return occurrenceService.updateOccurrence(occurrence);
    }

    @DeleteMapping("/{idOccurrence}")
    public ResponseEntity deleteByID(@PathVariable("idOccurrence") Long idOccurrence) throws Exception {
       try {
           occurrenceService.deleteOccurrence(idOccurrence);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
