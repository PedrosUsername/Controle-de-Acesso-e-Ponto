package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.DateType;

@Repository
public interface DateTypeRepository extends CrudRepository<DateType, Long> {

}
