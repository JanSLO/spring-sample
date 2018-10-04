package com.janpomer.controller;

import com.janpomer.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
    private SampleService sampleService;

    public SampleRestController(
            SampleService sampleService
    ) {
        this.sampleService = sampleService;
    }


    @GetMapping(value = "/addOne/{value}")
    int addOne(@PathVariable("value") int number) {
        return sampleService.addOne(number);
    }
}
