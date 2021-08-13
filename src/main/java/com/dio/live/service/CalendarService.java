package com.dio.live;

import com.dio.live.Calendar;
import com.dio.live.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CalendarService {


    CalendarRepository calendarRepository;

    @Autowired
    public CalendarService(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    public Calendar saveCalendar(Calendar calendar){
       return calendarRepository.save(calendar);

    }

    public Iterable<Calendar> findAll() {
       return   calendarRepository.findAll();
    }

    public Optional<Calendar> getById(Long idCalendar) {
        return calendarRepository.findById(idCalendar);
    }

    public Calendar updateCalendar(Calendar calendar){
        return calendarRepository.save(calendar);

    }

    public void deleteCalendar(Long idCalendar) {
        calendarRepository.deleteById(idCalendar);
    }
}
