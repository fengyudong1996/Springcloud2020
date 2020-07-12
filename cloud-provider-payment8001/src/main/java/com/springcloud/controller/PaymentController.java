package com.springcloud.controller;

import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import com.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: YudongFeng
 * @date: 2020/7/12 23:04
 * @description:
 */

/**
 * controller 调service service调dao
 *
 * @ ResponseBody 的作用就是让这个API只传给前端Json
 */


@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    /*
    @PostMapping 处理Post请求
     */
    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果："+result);
        if (result >0 ){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444 ,"插入数据库失败",null);
        }
    }

    /*
    @GetMapping 处理读操作
    @PathVariable 可以将URL中占位符参数{xxx}绑定到处理器类的方法形参中@PathVariable(“xxx“)
     */

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******插入结果："+payment);
        if (payment != null ){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444 ,"查询数据库失败，查询id："+id,null);
        }
    }

}
