package com.haimingwey.security.service;

import com.haimingwey.security.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Override
    public void methodOne() {
        System.out.println("method one");
    }

    @Override
    public void methodTwo(String msg) {
        System.out.println("msg:" + msg);
    }

    @Override
    public void methodThree(User user) {
        System.out.println(user.getUsername());
    }

    @Override
    public User methodFour() {
        User user = new User();
        user.setUsername("haimingwey");
        return user;
    }
}
