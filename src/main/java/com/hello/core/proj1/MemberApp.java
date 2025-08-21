package com.hello.core.proj1;

import com.hello.core.proj1.member.Grade;
import com.hello.core.proj1.member.Member;
import com.hello.core.proj1.member.MemberService;
import com.hello.core.proj1.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "member_A", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}