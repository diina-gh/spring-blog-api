package com.blog.blog.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.blog.models.User;
import com.blog.blog.repositories.UserRepository;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> listAllUser() {
        return repository.findAll();
    }

    public void saveUser(User user) {
        repository.save(user);
    }

    public User getUser(Integer id) {
        return repository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }
    
}