package com.janpomer.manager;

import org.springframework.stereotype.Component;

@Component
public class SampleManager {
    public int sum(int a, int b) {
        return a + b;
    }
}
