package com.blog.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blog.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}