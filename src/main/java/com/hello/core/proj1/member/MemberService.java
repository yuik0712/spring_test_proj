package com.hello.core.proj1.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}