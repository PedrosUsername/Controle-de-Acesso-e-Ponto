package com.dio.live;

import com.dio.live.User;
import com.dio.live.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
       return userRepository.save(user);

    }

    public Iterable<User> findAll() {
       return   userRepository.findAll();
    }

    public Optional<User> getById(Long idUser) {
        return userRepository.findById(idUser);
    }

    public User updateUser(User user){
        return userRepository.save(user);

    }

    public void deleteUser(Long idUser) {
        userRepository.deleteById(idUser);
    }
}
