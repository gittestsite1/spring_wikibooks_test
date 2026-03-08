package com.springboot.hello.controller;

import com.springboot.hello.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    @PutMapping("/member")
    public String postMember(@RequestBody Map<String, Object> putData){

        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach(map -> sb.append(map.getKey() + ":::" + map.getValue() + "\n")  );

        return sb.toString();
    }


    // DTO로 구성하는 방식 2가지 설정
    @PutMapping("/member1")
    public String postMemberDto1(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

    // return 그대로 String으로 하지 않는 방식
    @PutMapping("/member2")
    public MemberDto postMemberDto2(@RequestBody MemberDto memberDto){
        return memberDto;
    }


    // ResponseEntity를 가공해서 응답값 변경하기
    @PutMapping("/member3")
    public ResponseEntity<MemberDto> postMemberDto3(@RequestBody MemberDto memberDto){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(memberDto);
    }
}
