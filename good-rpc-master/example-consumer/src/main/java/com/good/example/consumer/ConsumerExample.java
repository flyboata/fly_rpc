package com.good.example.consumer;

import com.good.example.common.model.User;
import com.good.example.common.service.UserService;
import com.good.wellrpc.bootstrap.ConsumerBootstrap;
import com.good.wellrpc.config.RpcConfig;
import com.good.wellrpc.proxy.ServiceProxyFactory;
import com.good.wellrpc.utils.ConfigUtils;

/**
 * 服务消费者示例
 *
 */
public class ConsumerExample {

    public static void main(String[] args) {

        // 服务提供者初始化
        ConsumerBootstrap.init();

        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("good");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
