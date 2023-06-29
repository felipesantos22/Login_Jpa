package com.login.demo.entity;
import com.login.demo.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login,Integer> {

}
