package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.Calendar;

@Repository
public interface CalendarRepository extends CrudRepository<Calendar, Long> {

}
