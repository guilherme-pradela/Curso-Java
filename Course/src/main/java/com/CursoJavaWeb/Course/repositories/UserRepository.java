package com.CursoJavaWeb.Course.repositories;

import com.CursoJavaWeb.Course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
