package com.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: YudongFeng
 * @date: 2020/7/12 21:39
 * @description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 这里的泛型是通用的 ， 可以返回Payment 也可以返回别的
    //404 not_found   数字编码+异常信息
    private Integer code;
    private String message;
    private T   data;

    // 有了空参的，我们定义一个 data为空的构造器
    public CommonResult(Integer code, String message){
        // 这里的null是手打的 ，data是默认的不用手打
        this(code,message,null);
    }

}
