package com.hello.core.proj1.order;

import com.hello.core.proj1.discount.DiscountPolicy;
import com.hello.core.proj1.discount.FixDiscountPolicy;
import com.hello.core.proj1.member.Member;
import com.hello.core.proj1.member.MemberRepository;
import com.hello.core.proj1.member.MemoryMemberRespository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRespository(); // 회원
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); // 가격

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}