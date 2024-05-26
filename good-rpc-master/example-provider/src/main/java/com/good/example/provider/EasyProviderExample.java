package com.good.example.provider;

import com.good.example.common.service.UserService;
import com.good.wellrpc.registry.LocalRegistry;
import com.good.wellrpc.server.HttpServer;
import com.good.wellrpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 *
 */
public class EasyProviderExample {

    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
