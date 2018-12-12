package cn.com.dubbo.consumer.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.com.dubbo.consumer.IDemoService;
import cn.com.dubbo.entity.User;
import cn.com.dubbo.respository.IUserRespository;

@Service
public class DemoServiceImpl implements IDemoService {

    @Reference(
            version = "${dubbo.application.version}",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}"
              )
    private IUserRespository userRs;

    @Override
    public User findUserById(int userId) {
        return this.userRs.selectUserById(userId);
    }

}
