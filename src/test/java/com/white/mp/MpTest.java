package com.white.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.white.mp.domain.Role;
import com.white.mp.domain.User;
import com.white.mp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MpTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        User user = new User();
        user.setUsername("wangwu");
        user.setPassword("789");
        user.setSex(0);
        userMapper.insert(user);
    }

    @Test
    public void testDelete() {
        userMapper.deleteById(4l);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(4l);
        user.setUsername("wangwu");
        user.setPassword("789");
        user.setSex(0);
        userMapper.updateById(user);
    }

    //普通条件查询
    @Test
    public void testSelect() {
        User user = userMapper.selectById(1l);
        System.out.println("user");
    }

    //分页条件查询
    @Test
    public void testSelectByPage() {
        Page<User> page = new Page<>();
        page.setCurrent(1);
        page.setSize(2);
        Map map = new HashMap<String, Long>();
        map.put("id", 2l);
        userMapper.selectPageVo(page,map);
    }

    //条件构造器
    @Test
    public void testByWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //in
//        queryWrapper.inSql("id", "select id from user where id < 2");
        //like
//        queryWrapper.like("username", "zh");
        //order by
        queryWrapper.orderByAsc("birthday");
        List<Map<String, Object>> list = userMapper.selectMaps(queryWrapper);

    }

    //乐观锁
    @Test
    public void testVersion() {
        User user = new User();
        user.setId(4l);
        user.setUsername("wangwu1");
        user.setPassword("7891");
        user.setSex(0);


        User user1 = new User();
        user.setId(4l);
        user.setUsername("zhaoliu");
        user.setPassword("3453");
        user.setSex(0);
        userMapper.updateById(user);
        userMapper.updateById(user1);
    }

    /*一对多*/
    @Test
    public void findOne2More(){
        List<User> userOrders = userMapper.findOne2More();
    }

    /*多对多*/
    @Test
    public void findMore2More(){
        List<Role> userRoles = userMapper.findMore2More();
    }
    }
