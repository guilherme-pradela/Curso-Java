package com.CursoJavaWeb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CursoJavaWeb.Course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
