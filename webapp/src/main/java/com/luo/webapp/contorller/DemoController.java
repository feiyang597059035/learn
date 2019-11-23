package com.luo.webapp.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luo.service.TestService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public String  test(){
        return  testService.testService("err");
    }
}
