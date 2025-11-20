package com.CursoJavaWeb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CursoJavaWeb.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
