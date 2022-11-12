package com.example.postdemo.controller;

import com.example.postdemo.domain.Logger;
import com.example.postdemo.service.LoggerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LoggerController {

    @Autowired
    LoggerService loggerService;

    public void saveLog(Logger log) {
        loggerService.saveLog(log);
    }
}
