package com.good.examplespringbootconsumer;

import com.good.example.common.model.User;
import com.good.example.common.service.UserService;
import com.good.wellrpc.springboot.starter.annotation.RpcReference;
import org.springframework.stereotype.Service;

/**
 * 示例服务实现类
 *
 */
@Service
public class ExampleServiceImpl {

    /**
     * 使用 Rpc 框架注入
     */
    @RpcReference
    private UserService userService;

    /**
     * 测试方法
     */
    public void test() {
        User user = new User();
        user.setName("good");
        User resultUser = userService.getUser(user);
        System.out.println(resultUser.getName());
    }

}
