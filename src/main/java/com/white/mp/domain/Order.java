package com.white.mp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Date orderTime;
    private Double total;
    private Long uid;

    @TableField(exist = false)
    private User user;
}
