package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.HourBank;

@Repository
public interface HourBankRepository extends CrudRepository<HourBank, Long> {

}
