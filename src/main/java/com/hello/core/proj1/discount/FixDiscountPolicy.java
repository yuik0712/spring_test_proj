package com.hello.core.proj1.discount;

import com.hello.core.proj1.member.Grade;
import com.hello.core.proj1.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount = 1000; // 1,000원 할인

    @Override
    public int discount(Member member, int price) {
        // 등급이 VIP인 사람들만 1,000원 할인
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}