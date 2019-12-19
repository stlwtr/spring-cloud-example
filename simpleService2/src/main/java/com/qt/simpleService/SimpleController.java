package com.qt.simpleService;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.shared.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SimpleController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String home() {
        return "hello world";
    }

    @GetMapping("queryService")
    public String queryService() {
        List<InstanceInfo> instanceInfos = discoveryClient.getInstancesById("simpleService");

        return "hi";
    }
}
