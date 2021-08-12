package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.WorkingTime;

@Repository
public interface WorkingTimeRepository extends CrudRepository<WorkingTime, Long> {

}
