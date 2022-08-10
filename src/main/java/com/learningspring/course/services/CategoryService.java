package com.learningspring.course.services;

import com.learningspring.course.entities.Category;
import com.learningspring.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    //recupera todos.
    public List<Category> findAll(){
        return repository.findAll();
    }

    //recupera por id.
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
