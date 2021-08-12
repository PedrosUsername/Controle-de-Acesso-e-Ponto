package com.dio.live;

import com.dio.live.UserCategory;
import com.dio.live.UserCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserCategoryService {


    UserCategoryRepository userCategoryRepository;

    @Autowired
    public UserCategoryService(UserCategoryRepository userCategoryRepository) {
        this.userCategoryRepository = userCategoryRepository;
    }

    public UserCategory saveUserCategory(UserCategory userCategory){
       return userCategoryRepository.save(userCategory);

    }

    public Iterable<UserCategory> findAll() {
       return   userCategoryRepository.findAll();
    }

    public Optional<UserCategory> getById(Long idUserCategory) {
        return userCategoryRepository.findById(idUserCategory);
    }

    public UserCategory updateUserCategory(UserCategory userCategory){
        return userCategoryRepository.save(userCategory);

    }

    public void deleteUserCategory(Long idUserCategory) {
        userCategoryRepository.deleteById(idUserCategory);
    }
}
