package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.Move;

@Repository
public interface MoveRepository extends CrudRepository<Move, Long> {

}
