package com.dio.live;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.UserCategory;

@Repository
public interface UserCategoryRepository extends CrudRepository<UserCategory, Long> {

}
