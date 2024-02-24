package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.LoginRq;
import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserDto getLoggedUser(LoginRq loginRq){

        User user = this.userDao.findByUserNameAndPassword(loginRq.getUserName(), loginRq.getPassword());

        UserDto userDto = null;

        if (user != null){
            userDto = new UserDto(user);
        }
        return userDto;
    }
}
