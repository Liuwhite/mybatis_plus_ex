package com.white.mp.domain;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.print.attribute.standard.Fidelity;
import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //用户ID
    @TableId(type = IdType.AUTO)
    private Long id;
    //用户名
    private String username;
    //密码
    private String password;
    //出生日期
    private Date birthday;
    //性别 0女 1男
    private Integer sex;
    //创建时间
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    //更新时间
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;
    //逻辑删除
    @TableLogic
    private Integer isDel;
    //版本号 乐观锁
    @Version
    private Integer version;

    @TableField(exist = false)
    private List<Order> orderList;

    @TableField(exist = false)
    private List<Role> roleList;
}
