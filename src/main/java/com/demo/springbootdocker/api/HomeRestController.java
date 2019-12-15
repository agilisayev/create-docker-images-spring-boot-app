package com.demo.springbootdocker.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@Api
public class HomeRestController {

    @ApiOperation(value = "get Message")
    @GetMapping(value = "/hello")
    public String hello(){
        return "Spring boot Rest running Docker!";
    }
}
