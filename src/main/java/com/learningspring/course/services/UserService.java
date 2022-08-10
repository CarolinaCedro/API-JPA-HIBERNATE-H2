package com.learningspring.course.services;

import com.learningspring.course.entities.User;
import com.learningspring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    //recupera todos.
    public List<User> findAll(){
        return repository.findAll();
    }

    //recupera por id.
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
