package com.example.servicefeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 *  Feign的负载均衡
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
@RestController
public interface Feign {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
