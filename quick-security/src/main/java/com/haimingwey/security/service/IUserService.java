package com.haimingwey.security.service;

import com.haimingwey.security.entity.User;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;

public interface IUserService {

    @Secured("authenticated")
    public void methodOne();

    @PreAuthorize("hasRole('ADMIN')")
    public void methodTwo(String msg);

    @PreAuthorize("#user.username == authentication.name")
    public void methodThree(User user);

    @PostAuthorize("returnObject.userName == authentication.name")
    public User methodFour();

}
