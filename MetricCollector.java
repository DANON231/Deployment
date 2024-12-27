package com.example.metrics;

import org.springframework.beans.factory.annotation.Autowired; 
import io.micrometer.core.instrument.MeterRegistry; 
import org.springframework.scheduling.annotation.Scheduled; 
import org.springframework.stereotype.Component; 

@Component
public class MetricCollector {

    @Autowired
    private MeterRegistry meterRegistry;

    @Scheduled(fixedRate = 1000) 
    public void collectMetrics() {
        
        meterRegistry.counter("metric.counter", "key", "value").increment();
    }
}
