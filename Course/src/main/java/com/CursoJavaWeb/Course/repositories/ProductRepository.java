package com.CursoJavaWeb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CursoJavaWeb.Course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
