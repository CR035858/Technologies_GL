package com.Udemy.todo.ServiceImpl;

import com.Udemy.todo.Entity.Todo;
import com.Udemy.todo.Repository.TodoRepository;
import com.Udemy.todo.Service.TodoService;
import com.Udemy.todo.dto.TodoDto;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

	private TodoRepository todoRepository;

	private ModelMapper modelMapper;

	@Override
	public TodoDto saveTodo(TodoDto todoDto) {

		// convert TodoDto into Todo Jpa entity
		Todo todo = modelMapper.map(todoDto, Todo.class);

		// Todo Jpa entity
		Todo savedTodo = todoRepository.save(todo);

		// Convert saved Todo Jpa entity object into TodoDto object

		TodoDto savedTodoDto = modelMapper.map(savedTodo, TodoDto.class);

		return savedTodoDto;
	}

	@Override
	public List<TodoDto> viewDtos() {
		List<Todo> todos = todoRepository.findAll();
		return todos.stream().map((todo) -> modelMapper.map(todo, TodoDto.class)).collect(Collectors.toList());
	}

	@Override
	public TodoDto findById(Long dtoId) {
		Todo todo = todoRepository.findById(dtoId).orElse(null);
		TodoDto todoDto = modelMapper.map(todo, TodoDto.class);

		return todoDto;
	}

	@Override
	public void deleteDto(Long dtoId) {
		todoRepository.deleteById(dtoId);

	}

	@Override
	public TodoDto updateTodoDto(Long dtoId, TodoDto todoDto) {
	//	Todo todo = todoRepository.findById(dtoId).orElseThrow();
		Todo todo = todoRepository.findById(dtoId).get();
		todo.setTitle(todoDto.getTitle());
		todo.setDescription(todoDto.getDescription());
		todo.setCompleted(todoDto.isCompleted());
		Todo updatedTodo = todoRepository.save(todo);

		TodoDto todoDto2 = modelMapper.map(updatedTodo, TodoDto.class);

		return todoDto2;
	}

	@Override
	public TodoDto completeTodoDto(Long idLong) {
		//Todo todo = todoRepository.findById(idLong).orElseThrow();
		Todo todo = todoRepository.findById(idLong).get();
		todo.setCompleted(Boolean.TRUE);
		return new ModelMapper().map(todo, TodoDto.class);
	}

	@Override
	public TodoDto inCompleteDto(Long idLong) {
		//Todo todo = todoRepository.findById(idLong).orElseThrow();
		Todo todo = todoRepository.findById(idLong).get();
		todo.setCompleted(Boolean.TRUE);
		return new ModelMapper().map(todo, TodoDto.class);
	}

}
