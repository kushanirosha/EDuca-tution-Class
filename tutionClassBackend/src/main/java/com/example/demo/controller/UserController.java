package com.example.demo.controller;

import com.example.demo.dto.LoginRq;
import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getLoggedUser", method = RequestMethod.POST)
    public ResponseEntity<UserDto> getLoggedUser(@RequestBody LoginRq loginRq){

        UserDto userDto = this.userService.getLoggedUser(loginRq);

        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
