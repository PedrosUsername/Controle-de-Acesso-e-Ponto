package com.dio.live;

import com.dio.live.HourBank;
import com.dio.live.HourBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HourBankService {


    HourBankRepository hourBankRepository;

    @Autowired
    public HourBankService(HourBankRepository hourBankRepository) {
        this.hourBankRepository = hourBankRepository;
    }

    public HourBank saveHourBank(HourBank hourBank){
       return hourBankRepository.save(hourBank);

    }

    public Iterable<HourBank> findAll() {
       return   hourBankRepository.findAll();
    }

    public Optional<HourBank> getById(Long idHourBank) {
        return hourBankRepository.findById(idHourBank);
    }

    public HourBank updateHourBank(HourBank hourBank){
        return hourBankRepository.save(hourBank);

    }

    public void deleteHourBank(Long idHourBank) {
        hourBankRepository.deleteById(idHourBank);
    }
}
