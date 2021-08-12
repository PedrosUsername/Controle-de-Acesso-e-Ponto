package com.dio.live;

import com.dio.live.DateType;
import com.dio.live.DateTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DateTypeService {


    DateTypeRepository dateTypeRepository;

    @Autowired
    public DateTypeService(DateTypeRepository dateTypeRepository) {
        this.dateTypeRepository = dateTypeRepository;
    }

    public DateType saveDateType(DateType dateType){
       return dateTypeRepository.save(dateType);

    }

    public Iterable<DateType> findAll() {
       return   dateTypeRepository.findAll();
    }

    public Optional<DateType> getById(Long idDateType) {
        return dateTypeRepository.findById(idDateType);
    }

    public DateType updateDateType(DateType dateType){
        return dateTypeRepository.save(dateType);

    }

    public void deleteDateType(Long idDateType) {
        dateTypeRepository.deleteById(idDateType);
    }
}
