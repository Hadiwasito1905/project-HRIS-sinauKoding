package HRISproject.HRISproject.controller;

import HRISproject.HRISproject.common.RestResult;
import HRISproject.HRISproject.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyService service;

    @GetMapping
    private RestResult getAll(){
        return new RestResult(service.find(null, 0, 10));
    }
}
