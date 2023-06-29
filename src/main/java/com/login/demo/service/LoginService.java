package com.login.demo.service;

import com.login.demo.entity.LoginRepository;
import com.login.demo.model.Login;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {
    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public Login create(Login login) {
        return loginRepository.save(login);
    }

    public List<Login> read() {
        return loginRepository.findAll();
    }

    public Optional<Login> getById(int id) {
        return loginRepository.findById(id);
    }

    public Optional<Login> update(int id, Login login) {
        return loginRepository.findById(id)
                .map(newLogin -> {
                    newLogin.setEmail(login.getEmail());
                    newLogin.setPassword(login.getPassword());
                    return loginRepository.save(newLogin);
                });
    }

    public Optional<Login> deleteService(int id) {
        return loginRepository.findById(id).map(
                record -> {
                    loginRepository.deleteById(id);
                    return record;
                }
        );
    }
}
