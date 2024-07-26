package com.sr.login.login_page.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/users/", method = RequestMethod.POST)
    public String addUserDetails(@RequestBody String userDetails) {
        return "user added successfully";
    }
}