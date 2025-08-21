package com.hello.core.proj1.order;

import com.hello.core.proj1.member.Grade;
import com.hello.core.proj1.member.Member;
import com.hello.core.proj1.member.MemberService;
import com.hello.core.proj1.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "member_A", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "item_A", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}