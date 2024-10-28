package com.Udemy.todo.Controller;

import com.Udemy.todo.Service.TodoService;
import com.Udemy.todo.dto.TodoDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/todos")
public class DtoController {

	@Autowired
	private TodoService todoService;

	@PostMapping
	public ResponseEntity<TodoDto> createTodo(@RequestBody TodoDto todoDto) {
		TodoDto savedTodo = todoService.saveTodo(todoDto);
		return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);

	}

	@GetMapping
	public ResponseEntity<List<TodoDto>> showAllTodos() {
		List<TodoDto> todoDtos = todoService.viewDtos();
		return ResponseEntity.ok(todoDtos);

	}

	@GetMapping("{id}")
	public ResponseEntity<TodoDto> getById(@PathVariable Long id) {
		TodoDto todoDto = todoService.findById(id);
		return new ResponseEntity<TodoDto>(todoDto, HttpStatus.OK);

	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deletEntity(@PathVariable Long id) {
		todoService.deleteDto(id);
		return ResponseEntity.ok("Todo Deleted Successfully");
	}

	@PutMapping("{id}")
	public ResponseEntity<TodoDto> updatEntity(@PathVariable Long id, @RequestBody TodoDto todoDto) {
		TodoDto todoDto2 = todoService.updateTodoDto(id, todoDto);
		return new ResponseEntity<TodoDto>(todoDto2, HttpStatus.OK);
	}
	
	@PatchMapping("{id}/complete")
	public ResponseEntity<TodoDto> completEntity(@PathVariable Long id){
		TodoDto todoDto=todoService.completeTodoDto(id);
		return new ResponseEntity<TodoDto>(todoDto, HttpStatus.OK);
		
	}
	@PatchMapping("{id}/incomplete")
	public ResponseEntity<TodoDto> inCompletEntity(@PathVariable Long id){
		TodoDto todoDto=todoService.inCompleteDto(id);
		return new ResponseEntity<TodoDto>(todoDto, HttpStatus.OK);
		
	}

}
