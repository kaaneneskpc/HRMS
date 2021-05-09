package com.example.hrms.business.abstracts;

import com.example.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
