package com.learningspring.course.repositories;

import com.learningspring.course.entities.Order;
import com.learningspring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
