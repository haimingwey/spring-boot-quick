package com.haimingwey.security;

import com.haimingwey.security.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SecurityTest {

    @Autowired
    public IUserService userService;

    @Autowired
    public UserDetailsService userDetailsService;

    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void testMethodOne() {
        userService.methodOne();
    }
}
