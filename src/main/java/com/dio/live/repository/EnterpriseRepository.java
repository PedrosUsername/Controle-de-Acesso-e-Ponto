package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.Enterprise;

@Repository
public interface EnterpriseRepository extends CrudRepository<Enterprise, Long> {

}
