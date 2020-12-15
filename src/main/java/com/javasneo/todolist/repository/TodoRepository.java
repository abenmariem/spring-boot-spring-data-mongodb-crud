package com.javasneo.todolist.repository;

import com.javasneo.todolist.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Abderrahmen on 14/12/2020.
 */
public interface TodoRepository extends MongoRepository<Todo, String> {
}
