package com.dio.live;

import com.dio.live.Location;
import com.dio.live.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationService {


    LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location saveLocation(Location location){
       return locationRepository.save(location);

    }

    public Iterable<Location> findAll() {
       return   locationRepository.findAll();
    }

    public Optional<Location> getById(Long idLocation) {
        return locationRepository.findById(idLocation);
    }

    public Location updateLocation(Location location){
        return locationRepository.save(location);

    }

    public void deleteLocation(Long idLocation) {
        locationRepository.deleteById(idLocation);
    }
}
