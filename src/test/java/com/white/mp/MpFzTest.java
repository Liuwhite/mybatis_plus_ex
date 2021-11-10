package com.white.mp;

import com.white.mp.domain.Order;
import com.white.mp.mapper.OrderMapper;
import com.white.mp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class MpFzTest {

    @Resource
    private UserMapper userMapper;
    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testOne2One(){
        List<Order> orders = orderMapper.findAllOne();
        System.out.println(orders);
    }
}
