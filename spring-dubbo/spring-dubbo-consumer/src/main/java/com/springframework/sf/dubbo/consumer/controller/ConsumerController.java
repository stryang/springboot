package com.springframework.sf.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springframework.sf.dubbo.api.rpc.RpcService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yq
 * @date: 2019/11/21 16:53
 * @description:
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Reference(version = "1.0.0")
    RpcService rpcService;

    @RequestMapping("/rpc")
    public String rpc(String info) {
        return rpcService.dubboRpc(info);
    }
}
