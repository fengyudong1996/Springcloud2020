package com.springcloud.service;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: YudongFeng
 * @date: 2020/7/12 22:52
 * @description:
 */


// 这里和我们的Mybatis一致，可以少写代码
@Mapper
public interface PaymentService {


    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
