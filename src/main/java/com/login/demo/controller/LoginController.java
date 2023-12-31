package com.login.demo.controller;
import com.login.demo.model.Login;
import com.login.demo.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public Login create(@RequestBody Login login){
        return loginService.create(login);
    }

    @GetMapping
    public List<Login> read(){
        return loginService.read();
    }

    @GetMapping("/{id}")
    public Optional<Login> findById(@PathVariable int id){
        return loginService.getById(id);
    }
    @PutMapping("/{id}")
    public Optional<Login> updateController(@PathVariable int id, @RequestBody Login login){
        return loginService.update(id, login);
    }
    @DeleteMapping("/{id}")
    public Optional<Login> deleteController(@PathVariable int id){
        return loginService.deleteService(id);
    }
}
