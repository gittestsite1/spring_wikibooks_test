package com.springboot.hello.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
