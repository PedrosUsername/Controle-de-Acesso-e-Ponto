package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.AccessLevel;

@Repository
public interface AccessLevelRepository extends CrudRepository<AccessLevel, Long> {

}
