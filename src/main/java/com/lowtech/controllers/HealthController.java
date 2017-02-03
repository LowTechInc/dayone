package com.lowtech.controllers;

import com.lowtech.health.Status;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @RequestMapping("/health")
    public Status status() {

        return Status.OK;
    }

}
