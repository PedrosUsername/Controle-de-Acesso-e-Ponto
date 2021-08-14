package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.Occurrence;

@Repository
public interface OccurrenceRepository extends CrudRepository<Occurrence, Long> {

}
