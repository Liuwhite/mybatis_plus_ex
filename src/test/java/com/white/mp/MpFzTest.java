package com.white.mp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.white.mp.domain.Order;
import com.white.mp.domain.User;
import com.white.mp.mapper.OrderMapper;
import com.white.mp.mapper.UserMapper;
import com.white.mp.query.UserQuery;
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


    @Test
    void test2(){
        UserQuery query = new UserQuery();
        query.setId(1l);
//        userWrapper.and(wrapper ->wrapper.eq(“pwd”, pwd).or().eq(“phone”, phone));
        List<User> user = userMapper.selectList(new LambdaQueryWrapper<User>()
                .eq(User::getIsDel,false)
                .and(wrapper -> wrapper.eq(User::getId, query.getId()).or().eq(User::getUsername, query.getUsername())));

        System.out.println(user);
    }
}
