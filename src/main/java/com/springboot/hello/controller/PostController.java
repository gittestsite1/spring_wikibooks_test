package com.springboot.hello.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample(){
        return "hello post api";
    }

    // Request Body에 json을 이용하는 방법
    @PostMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postData){

        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach( map -> {
            sb.append(map.getKey() + " : " + map.getValue());
        });

        return sb.toString();

    }
}
