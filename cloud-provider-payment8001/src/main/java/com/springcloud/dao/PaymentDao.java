package com.springcloud.dao;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: YudongFeng
 * @date: 2020/7/12 21:58
 * @description:
 */

/**
 * 添加Mapper注解之后这个接口在编译是会生成对应的实现类
 */
@Mapper
public interface PaymentDao {
    // 写操作
    public int create(Payment payment);
    // 读操作
    /*
    这里用的是Mybatis
    @param 注解用来传参 接收可以用 #{} 或者 ${}
     */
    public Payment getPaymentById(@Param("id") Long id);


}
