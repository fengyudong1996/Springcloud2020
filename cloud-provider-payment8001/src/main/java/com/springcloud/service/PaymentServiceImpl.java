package com.springcloud.service;

import com.springcloud.dao.PaymentDao;
import com.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: YudongFeng
 * @date: 2020/7/12 22:55
 * @description:
 */
/*
写我们service接口和实现类一定要有@Mapper 和 @Service
 */

@Service
public class PaymentServiceImpl implements PaymentService{

    // 这个Resource 是java自带的，它也可以进行依赖注入
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
