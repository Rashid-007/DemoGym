package com.tylersadler.service;

import com.tylersadler.domain.Member;
import com.tylersadler.dto.EmployeeDto;
import com.tylersadler.dto.MemberDto;
import com.tylersadler.repository.MemberRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MemberServiceTest {
    @Mock
    private MemberRepository mockMemberRepository;

    @InjectMocks
    private MemberService testObject;

    private Member member;
    private Member member2;
    private Member member3;

    private List<Member> memberList;

    @Before
    public void setUp(){
        member = new Member();
        member2 = new Member();
        member3 = new Member();

        memberList = new ArrayList<>();
        memberList.add(member);
        memberList.add(member2);
        memberList.add(member3);
    }

    @Test
    public void testWhenFindAllIsCalledItReturnsListOfMemberDtos(){
        when(mockMemberRepository.findAll()).thenReturn(memberList);
        List<MemberDto> actual = testObject.findAll();
        assertEquals(3, actual.size());
    }

    @Test
    public void testWhenFindAllIsCalledAndRepoHasErrorItReturnsNullList(){
        when(mockMemberRepository.findAll()).thenThrow(new NullPointerException());
        List<MemberDto> actual = testObject.findAll();
        assertEquals(null, actual);
    }
}
