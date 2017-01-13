package com.tylersadler.controller;

import com.tylersadler.dto.MemberDto;
import com.tylersadler.service.MemberService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MemberController {

    private final MemberService memberService;

    @Inject
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @RequestMapping(value = "/members", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MemberDto> findAll(){
        return memberService.findAll();
    }
}