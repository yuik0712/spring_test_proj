package com.hello.core.proj1.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}