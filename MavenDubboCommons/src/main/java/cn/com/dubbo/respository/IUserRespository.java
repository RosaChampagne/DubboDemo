package cn.com.dubbo.respository;

import cn.com.dubbo.entity.User;

public interface IUserRespository {
    public User selectUserById(int userId);
}
