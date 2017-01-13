package com.tylersadler.dto;

import com.tylersadler.domain.AbstractPerson;

public class MemberDto extends AbstractPerson{
    private Long memberId;

    public MemberDto(Long memberId, String firstName, String lastName,
                  String phoneNumber){
        this.memberId = memberId;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
    }

    public MemberDto(){}

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}
