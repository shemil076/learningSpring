package com.spring.project1.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
    // form property file
    @Value("${external.services.url}")
    private String url;

    public String returnServiceUrl() {
        return url;
    }
}
