package com.tylersadler.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "Member")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "memberId")
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
