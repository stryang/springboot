package com.springframework.sf.dubbo.consumer.init;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springframework.sf.dubbo.api.rpc.RpcService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: yq
 * @date: 2019/11/21 18:52
 * @description:
 */
@Component
public class StartRunner implements CommandLineRunner {

    @Reference(version = "1.0.0")
    RpcService rpcService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(rpcService.dubboRpc("启动时调用rpc"));
    }
}
