package cn.com.dubbo.respository.impl;

import com.alibaba.dubbo.config.annotation.Service;

import cn.com.dubbo.entity.User;
import cn.com.dubbo.respository.IUserRespository;

@Service(
        version="${dubbo.service.version}",
        application="${dubbo.application.id}",
        registry="${dubbo.registry.id}",
        protocol="${dubbo.protocol.id}"
        )
public class UserRespositoryImpl implements IUserRespository {

    @Override
    public User selectUserById(int userId) {
        System.out.println("*************UserRespositoryImpl***************");
        User user = new User();
        user.setUserAge(18);
        user.setUserId(userId);
        user.setUserName("王源" + userId);
        user.setUserUserName("Roy" + userId);
        return user;
    }

}
