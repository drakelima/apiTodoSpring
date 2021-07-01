package io.github.crudigor.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.crudigor.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
