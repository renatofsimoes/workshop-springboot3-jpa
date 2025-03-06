package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.OrderItemPK;
																	//chave primária composta
																	//do tipo OrderItemPK
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
