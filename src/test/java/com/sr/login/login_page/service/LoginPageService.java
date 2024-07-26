package com.sr.login.login_page.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginPageService {

        private final LoginPageService loginRepository;

        @Autowired
        public LoginPageService(LoginPageService loginRepository) {
            this.loginRepository = loginRepository;
        }
        



}
