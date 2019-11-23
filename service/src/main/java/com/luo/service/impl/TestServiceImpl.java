package com.luo.service.impl;

import com.luo.service.TestService;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Override
    public String testService(String name) {
        return name;
    }
}
