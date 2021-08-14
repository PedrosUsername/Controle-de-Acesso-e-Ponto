package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {

}
