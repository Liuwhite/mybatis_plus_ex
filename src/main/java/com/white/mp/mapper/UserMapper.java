package com.white.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.white.mp.domain.Role;
import com.white.mp.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 分页条件查询
     * 也可以封装一个query类封装参数，map在rpc传输中比较重
     * @param page
     * @param params
     * @return
     */
    IPage<User> selectPageVo(Page<User> page,@Param("params") Map<String,Object> params);

    /**
     * 一对多查询
     * @return
     */
    List<User> findOne2More();

    /**
     * 多对多
     * @return
     */
    List<Role> findMore2More();

    /**
     * 动态查询
     * @return
     */
    User findByTj();


    void updateBatch(List<User> users);
}
