package com.microserviceTuto.userservice.service;

import com.microserviceTuto.userservice.VO.Department;
import com.microserviceTuto.userservice.VO.ResponseTemplateVO;
import com.microserviceTuto.userservice.entity.User;
import com.microserviceTuto.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findUserByUserId(userId);

        Department department = restTemplate.getForObject("http://localhost:9001/departments/"+user.getDepartmentId(),
                                                           Department.class);
        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
