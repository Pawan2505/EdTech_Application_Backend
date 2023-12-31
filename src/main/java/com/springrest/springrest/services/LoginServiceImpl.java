package com.springrest.springrest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.LoginDao;
import com.springrest.springrest.entities.Login;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    public LoginServiceImpl() {
    }

    @Override
    public Login getLogin(String name) {
        Optional<Login> optionalLogin = loginDao.findByName(name);
        return optionalLogin.orElse(null);
    }

    @Override
    public Login addLogin(Login login) {
        loginDao.save(login);
        return login;
    }
}
