package com.qunhongtech.customer;


import com.alibaba.dubbo.config.annotation.Reference;
import com.qunhongtech.api.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference //引用服务
    private HelloService helloService;

    @GetMapping("/sayHello")
    private String sayHello(@RequestParam String name){

        System.out.println("调用sayHello成功了..." + " name:" + name);

        return helloService.sayHello(name);
    }

}
