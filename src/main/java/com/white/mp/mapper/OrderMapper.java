package com.white.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.white.mp.domain.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    List<Order> findAllOne();
}
