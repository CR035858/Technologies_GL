package com.Udemy.todo.Service;

import com.Udemy.todo.dto.TodoDto;

import java.util.List;

public interface TodoService {

	TodoDto saveTodo(TodoDto todoDto);

	List<TodoDto> viewDtos();

	TodoDto findById(Long dtoId);

	void deleteDto(Long dtoId);

	TodoDto updateTodoDto(Long dtoId, TodoDto todoDto);

	TodoDto completeTodoDto(Long idLong);

	TodoDto inCompleteDto(Long idLong);

}
