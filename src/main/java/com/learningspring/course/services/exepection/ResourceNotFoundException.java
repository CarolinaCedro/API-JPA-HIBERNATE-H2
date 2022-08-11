package com.learningspring.course.services.exepection;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
