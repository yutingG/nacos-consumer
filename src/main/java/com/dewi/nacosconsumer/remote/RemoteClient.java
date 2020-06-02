package com.dewi.nacosconsumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: guoyuting
 * @Date: Created at 2020/6/2 4:33 PM
 */
@FeignClient(name = "alibaba-nacos-discovery-server")
public interface RemoteClient {

    @GetMapping(value = "/hello")
    String hello(@RequestParam(name = "name") String name);
}
