package com.springboot.hello.controller;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(value = "/api/v1/get-api")
public class GetController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public  String getHello(){
        return "HelloWorld3";
    }

    // 변수명과 동일할때
    @GetMapping("/test/variable/{variable}")
    public String getHello2(@PathVariable String variable){
        return "getHello2~" + variable;
    }


//    @GetMapping("/test/variable/{test}")
//    public String getHello3(@PathVariable("test") String  variable){
//        return "getHello3~"+ variable;
//    }

    // paramter방식 체크하기
    @GetMapping("/request")
    public String getRequestParam(
            @RequestParam String nm1,
            @RequestParam String nm2,
            @RequestParam String nm3
            ){
        return "result = " + nm1 + nm2 + nm3;
    }

    // 이름이 다른경우
    @GetMapping("/request2")
    public String getRequestParam2(
            @RequestParam("nm1") String new_nm1,
            @RequestParam String nm2,
            @RequestParam String nm3
    ){
        return "result = " + new_nm1 + nm2 + nm3;
    }

//    // Map으로 RequestParam여러개 처리하는 방법
    // 62page 오류 코드
//    @GetMapping("/request3")
//    public String getMapParams(@RequestParam Map<String, String> param){
//        StringBuilder sb = new StringBuilder();
//
//        param.forEach(key, value)   sb.append(key + " : " + value);
//        return sb.toString();
//
//    }


    @GetMapping(value = "/request3")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

//        param.entrySet().forEach(map -> {
//            sb.append(map.getKey() + " : " + map.getValue() + "\n");
//        });

        param.entrySet().forEach(map -> sb.append(map.getKey()
         + " : " + map.getValue()+ "\n") );
        return sb.toString();
    }
}
