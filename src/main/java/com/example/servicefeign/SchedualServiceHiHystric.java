package com.example.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2019/9/10 16:31
 */
//@Component
public class SchedualServiceHiHystric implements  Feign {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
