package com.CursoJavaWeb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CursoJavaWeb.Course.entities.OrderItem;
import com.CursoJavaWeb.Course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

