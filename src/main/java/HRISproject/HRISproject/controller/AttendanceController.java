package HRISproject.HRISproject.controller;

import HRISproject.HRISproject.common.RestResult;
import HRISproject.HRISproject.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    AttendanceService service;

    @GetMapping
    private RestResult getAll(){
        return new RestResult(service.find(null, 0, 10));
    }
}