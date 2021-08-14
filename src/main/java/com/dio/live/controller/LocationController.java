package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/localidade")
public class LocationController {
    @Autowired
    LocationService locationService;

    @PostMapping(path="/add")
    public Location createLocation(@RequestBody Location location){
        return locationService.saveLocation(location);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<Location> getLocationList(){
        return locationService.findAll();

    }

    @GetMapping("/{idLocation}")
    public ResponseEntity<Location>  getLocationByID(@PathVariable("idLocation") Long idLocation) throws Exception {
        return  ResponseEntity.ok(locationService.getById(idLocation).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Location updateLocation(@RequestBody Location location){
        return locationService.updateLocation(location);
    }

    @DeleteMapping("/{idLocation}")
    public ResponseEntity deleteByID(@PathVariable("idLocation") Long idLocation) throws Exception {
       try {
           locationService.deleteLocation(idLocation);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
