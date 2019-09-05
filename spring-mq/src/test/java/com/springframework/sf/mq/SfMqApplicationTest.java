package com.springframework.sf.mq;

import com.springframework.sf.mq.activeMq.MqProducer;
import com.springframework.sf.mq.constants.MqConstant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yq
 * @date 2019/9/5
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SfMqApplicationTest {

    @Autowired
    private MqProducer mqProducer;

    @Test
    public void contextLoads() {
        mqProducer.sendMQTopicMsg(MqConstant.MQMessage, "topic测试消息");
    }
}
