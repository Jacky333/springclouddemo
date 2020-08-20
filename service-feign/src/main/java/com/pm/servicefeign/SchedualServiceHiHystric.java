package com.pm.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2020/08/13 20:15
 */
@Component
public class SchedualServiceHiHystric  implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
