package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
