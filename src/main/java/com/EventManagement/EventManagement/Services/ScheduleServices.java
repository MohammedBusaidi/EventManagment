package com.EventManagement.EventManagement.Services;

import com.EventManagement.EventManagement.Models.Schedule;
import com.EventManagement.EventManagement.Repositories.ReviewRepository;
import com.EventManagement.EventManagement.Repositories.ScheduleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ScheduleServices {
    final ScheduleRepository scheduleRepository;
    public List<Schedule> getAllSchedules() {

        return scheduleRepository.findAll();
    }

    public Schedule getScheduleById(Long id) {

        return scheduleRepository.findById(id).get();
    }

}
