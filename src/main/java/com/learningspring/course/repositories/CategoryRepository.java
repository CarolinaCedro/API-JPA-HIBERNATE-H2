package com.learningspring.course.repositories;

import com.learningspring.course.entities.Category;
import com.learningspring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
