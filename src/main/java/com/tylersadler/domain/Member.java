package com.tylersadler.domain;

import javax.persistence.*;

@Entity
@Table(name = "Member")
public class Member extends AbstractPerson{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Member_Id")
    private Long memberId;

    public Member(Long memberId, String firstName, String lastName,
                   String phoneNumber){
        this.memberId = memberId;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
    }

    public Member(){}

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}
