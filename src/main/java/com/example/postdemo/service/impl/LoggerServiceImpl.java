package com.example.postdemo.service.impl;

import com.example.postdemo.domain.Logger;
import com.example.postdemo.repo.LoggerRepo;
import com.example.postdemo.service.LoggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoggerServiceImpl implements LoggerService {

    @Autowired
    LoggerRepo loggerRepo;

    @Override
    public void saveLog(Logger logger) {
        loggerRepo.save(logger);
    }
}