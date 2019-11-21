package com.springframework.sf.dubbo.provider.rpc;

import com.alibaba.dubbo.config.annotation.Service;
import com.springframework.sf.dubbo.api.rpc.RpcService;

/**
 * @author: yq
 * @date: 2019/11/21 16:41
 * @description:
 */
@Service(version = "1.0.0")
public class DubboRpcServiceImpl implements RpcService {
    @Override
    public String dubboRpc(String info) {
        return "hello: " + info;
    }
}
