package com.dio.live;

import com.dio.live.AccessLevel;
import com.dio.live.AccessLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccessLevelService {


    AccessLevelRepository accessLevelRepository;

    @Autowired
    public AccessLevelService(AccessLevelRepository accessLevelRepository) {
        this.accessLevelRepository = accessLevelRepository;
    }

    public AccessLevel saveAccessLevel(AccessLevel accessLevel){
       return accessLevelRepository.save(accessLevel);

    }

    public Iterable<AccessLevel> findAll() {
       return   accessLevelRepository.findAll();
    }

    public Optional<AccessLevel> getById(Long idAccessLevel) {
        return accessLevelRepository.findById(idAccessLevel);
    }

    public AccessLevel updateAccessLevel(AccessLevel accessLevel){
        return accessLevelRepository.save(accessLevel);

    }

    public void deleteAccessLevel(Long idAccessLevel) {
        accessLevelRepository.deleteById(idAccessLevel);
    }
}
