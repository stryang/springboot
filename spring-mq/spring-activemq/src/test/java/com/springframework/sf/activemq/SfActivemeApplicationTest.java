package com.springframework.sf.activemq;

import com.springframework.sf.activemq.constant.MqConstant;
import com.springframework.sf.activemq.producer.MqProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yq
 * @date 2019/9/6
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SfActivemeApplicationTest {
    @Autowired
    private MqProducer mqProducer;

    @Test
    public void contextLoads() {
        mqProducer.sendMQTopicMsg(MqConstant.MQMessage, "topic测试消息");
    }
}
