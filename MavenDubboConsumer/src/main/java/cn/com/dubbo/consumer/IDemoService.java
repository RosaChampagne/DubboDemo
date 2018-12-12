package cn.com.dubbo.consumer;

import cn.com.dubbo.entity.User;

public interface IDemoService {
    public User findUserById(int userId);
}
