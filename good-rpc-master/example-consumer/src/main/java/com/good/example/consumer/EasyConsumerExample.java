package com.good.example.consumer;

import com.good.example.common.model.User;
import com.good.example.common.service.UserService;
import com.good.wellrpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 *
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // 静态代理
//        UserService userService = new UserServiceProxy();
        // 动态代理
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
