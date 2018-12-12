package cn.com.dubbo.consumer.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.com.dubbo.DubboConsumerApp;
import cn.com.dubbo.consumer.IDemoService;
import cn.com.dubbo.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DubboConsumerApp.class)
public class TestDemoServiceImpl {

    @Autowired
    private IDemoService iDemoService;

    @Test
    public void testFindUserById() {
        User user = this.iDemoService.findUserById(10);
        System.out.println(user);
    }
}
