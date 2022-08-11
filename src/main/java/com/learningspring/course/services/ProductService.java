package com.learningspring.course.services;

import com.learningspring.course.entities.Product;
import com.learningspring.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    //recupera todos.
    public List<Product> findAll(){
        return repository.findAll();
    }

    //recupera por id.
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
