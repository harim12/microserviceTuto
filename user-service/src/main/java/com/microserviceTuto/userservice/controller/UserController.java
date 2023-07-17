package com.microserviceTuto.userservice.controller;


import com.microserviceTuto.userservice.VO.ResponseTemplateVO;
import com.microserviceTuto.userservice.entity.User;
import com.microserviceTuto.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserWithDepartment(userId);
    }

}
