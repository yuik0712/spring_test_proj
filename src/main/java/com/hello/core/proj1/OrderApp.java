package com.hello.core.proj1;

import com.hello.core.proj1.member.Grade;
import com.hello.core.proj1.member.Member;
import com.hello.core.proj1.member.MemberService;
import com.hello.core.proj1.member.MemberServiceImpl;
import com.hello.core.proj1.order.Order;
import com.hello.core.proj1.order.OrderService;
import com.hello.core.proj1.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "member_A", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "item_A", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}