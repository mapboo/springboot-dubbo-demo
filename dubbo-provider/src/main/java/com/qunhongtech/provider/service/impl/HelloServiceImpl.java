package com.qunhongtech.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qunhongtech.api.service.HelloService;


@Service //发布服务
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
