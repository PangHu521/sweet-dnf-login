package com.sweet.simple.login.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 玩家账号
 *
 * @author 大师兄
 */
@Setter
@Getter
@Builder
@TableName("d_taiwan.accounts")
public class Accounts {

    /**
     * 账号id
     */
    @TableId(value = "UID", type = IdType.AUTO)
    private Integer uId;

    /**
     * 账号
     */
    @TableField("accountname")
    private String accountName;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * qq
     */
    @TableField("qq")
    private String qq;
}
