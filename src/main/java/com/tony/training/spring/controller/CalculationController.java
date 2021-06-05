package com.tony.training.spring.controller;


import com.tony.training.spring.BasicApiApplication;
import com.tony.training.spring.model.CalculationResponse;
import com.tony.training.spring.service.GetNumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculationController {
    private static final Logger log = LoggerFactory.getLogger(BasicApiApplication.class);

    @Autowired
    private GetNumService getNumService;

    @GetMapping("/calculation")
    public  @ResponseBody
    CalculationResponse getOne(@RequestParam int max, @RequestParam int divisor, @RequestParam int limit) {
        return new CalculationResponse(getNumService.getNumByApi(max,divisor,limit));
    }

}