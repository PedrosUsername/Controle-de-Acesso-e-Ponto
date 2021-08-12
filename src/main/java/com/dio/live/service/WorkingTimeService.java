package com.dio.live;

import com.dio.live.WorkingTime;
import com.dio.live.WorkingTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkingTimeService {


    WorkingTimeRepository workingTimeRepository;

    @Autowired
    public WorkingTimeService(WorkingTimeRepository workingTimeRepository) {
        this.workingTimeRepository = workingTimeRepository;
    }

    public WorkingTime saveWorkingTime(WorkingTime workingTime){
       return workingTimeRepository.save(workingTime);

    }

    public Iterable<WorkingTime> findAll() {
       return   workingTimeRepository.findAll();
    }

    public Optional<WorkingTime> getById(Long idWorkingTime) {
        return workingTimeRepository.findById(idWorkingTime);
    }

    public WorkingTime updateWorkingTime(WorkingTime workingTime){
        return workingTimeRepository.save(workingTime);

    }

    public void deleteWorkingTime(Long idWorkingTime) {
        workingTimeRepository.deleteById(idWorkingTime);
    }
}
