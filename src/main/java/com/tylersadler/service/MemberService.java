package com.tylersadler.service;

import com.tylersadler.domain.Member;
import com.tylersadler.dto.MemberDto;
import com.tylersadler.repository.MemberRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    private static final Log LOGGER = LogFactory.getLog(MemberService.class);

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public List<MemberDto> findAll() {
        try{
            List<Member> memberList = memberRepository.findAll();
            List<MemberDto> dtoList = new ArrayList<>();

            for (Member member: memberList) {
                MemberDto memberDto = new MemberDto(member.getMemberId(),
                        member.getFirstName(), member.getLastName(), member.getPhoneNumber());

                dtoList.add(memberDto);
            }

            return dtoList;
        } catch (Exception e){
            LOGGER.error("Find All",e);
            return null;
        }
    }
}