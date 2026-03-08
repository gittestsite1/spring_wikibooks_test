package com.springboot.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {

    // PathVariable
    // RequestParam
    // 2개 이용하여서 처리
    @DeleteMapping(value = "/{variable}")
    public String deleteMember(@PathVariable String variable){
        return variable;
    }

    @DeleteMapping(value = "/request1")
    public String getRequestParam(@RequestParam String email){
        return email;
    }

}
