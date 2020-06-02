package com.dewi.nacosconsumer;

import com.dewi.nacosconsumer.remote.RemoteClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: guoyuting
 * @Date: Created at 2020/6/2 4:19 PM
 */
@Slf4j
@RestController
public class TestController {

//    @Autowired
//    LoadBalancerClient loadBalancerClient;

    @Autowired
    private RemoteClient remoteClient;

//    @GetMapping("/test")
//    public String test() {
//        // 通过nacos-consumer中的负载均衡接口选取服务节点进行调用
//        ServiceInstance instance = loadBalancerClient.choose("alibaba-nacos-discovery-server");
//        String url = instance.getUri() + "/hello?name=" + "didi";
//        RestTemplate template = new RestTemplate();
//        String result = template.getForObject(url, String.class);
//        return "Invoked : " + url + ", return :" + result;
//    }

    @GetMapping("/testRemote")
    public String hello(@RequestParam String name) {
        String result = remoteClient.hello(name);
        return "return : " + result;

    }
}
