package com.login.demo.service;

import com.login.demo.entity.LoginRepository;
import com.login.demo.model.Login;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public Login create(Login login){
        return loginRepository.save(login);
    }
    public List<Login> read(){
        return loginRepository.findAll();
    }
}
