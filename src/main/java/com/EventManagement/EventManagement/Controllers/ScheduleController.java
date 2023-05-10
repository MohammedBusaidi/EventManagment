package com.EventManagement.EventManagement.Controllers;

import com.EventManagement.EventManagement.Models.Schedule;
import com.EventManagement.EventManagement.Services.ScheduleServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "schedule")
public class ScheduleController {
    ScheduleServices scheduleServices;
    @GetMapping(value = "getAll")
    public List<Schedule> getAllSchedules() {

        return scheduleServices.getAllSchedules();
    }
    @GetMapping(value = "getById")
    public Schedule getScheduleById(@RequestParam Long id) {

        return scheduleServices.getScheduleById(id);
    }
}
