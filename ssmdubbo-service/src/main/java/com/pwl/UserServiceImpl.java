package com.pwl;


import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    public String sayHello(String name) {
        return name;
    }
}
