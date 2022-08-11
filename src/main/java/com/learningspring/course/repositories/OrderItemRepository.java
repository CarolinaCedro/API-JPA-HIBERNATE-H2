package com.learningspring.course.repositories;

import com.learningspring.course.entities.OrderItem;
import com.learningspring.course.entities.Product;
import com.learningspring.course.entities.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
