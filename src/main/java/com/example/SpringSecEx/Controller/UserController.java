package com.example.SpringSecEx.Controller;

import com.example.SpringSecEx.Model.Users;
import com.example.SpringSecEx.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user)
    {
        return service.register(user);
    }
}
