package com.dio.live;

import com.dio.live.Occurrence;
import com.dio.live.OccurrenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OccurrenceService {


    OccurrenceRepository occurrenceRepository;

    @Autowired
    public OccurrenceService(OccurrenceRepository occurrenceRepository) {
        this.occurrenceRepository = occurrenceRepository;
    }

    public Occurrence saveOccurrence(Occurrence occurrence){
       return occurrenceRepository.save(occurrence);

    }

    public Iterable<Occurrence> findAll() {
       return   occurrenceRepository.findAll();
    }

    public Optional<Occurrence> getById(Long idOccurrence) {
        return occurrenceRepository.findById(idOccurrence);
    }

    public Occurrence updateOccurrence(Occurrence occurrence){
        return occurrenceRepository.save(occurrence);

    }

    public void deleteOccurrence(Long idOccurrence) {
        occurrenceRepository.deleteById(idOccurrence);
    }
}
