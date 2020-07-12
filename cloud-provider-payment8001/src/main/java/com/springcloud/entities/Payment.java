package com.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: YudongFeng
 * @date: 2020/7/12 21:35
 * @description:
 */

/**
 * 实体类
 *
 *
 * @Data
 * 使用这个注解，就不用再去手写Getter,Setter,equals,canEqual,hasCode,toString等方法了，注解后在编译时会自动加进去。
 * @AllArgsConstructor
 * 使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
 * @NoArgsConstructor
 * 使用后创建一个无参构造函数
 * @Builder
 * 关于Builder较为复杂一些，Builder的作用之一是为了解决在某个类有很多构造函数的情况，也省去写很多构造函数的麻烦，在设计模式中的思想是：用一个内部类去实例化一个对象，避免一个类出现过多构造函数，
 *
 * Serializable 序列化，后续部署可能用得到
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
