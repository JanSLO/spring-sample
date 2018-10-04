package com.janpomer.service;

import com.janpomer.manager.SampleManager;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private SampleManager sampleManager;

    public SampleService(SampleManager sampleManager) {
        this.sampleManager = sampleManager;
    }

    public int addOne(int number) {
        return sampleManager.sum(number, 1);
    }
}
