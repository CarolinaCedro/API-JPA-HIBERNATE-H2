package com.learningspring.course.services;



import com.learningspring.course.entities.Order;
import com.learningspring.course.repositories.OrderRepository;
import com.learningspring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    //recupera todos.
    public List<Order> findAll(){
        return repository.findAll();
    }

    //recupera por id.
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
