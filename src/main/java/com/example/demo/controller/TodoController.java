package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Todo> getAll(){
		return todoService.retornarTodos();
	}
	
	@GetMapping(path = "/{n}")
	public Todo getOne(@PathVariable(name = "n") Integer id) {
		return todoService.retornarUnico(id);
	}
	
	@PostMapping
	public String create(@RequestBody Todo todo) {
		return todoService.inserir(todo);
	}
	
	@PutMapping("/{n}")
	public Todo atualizar(@PathVariable Integer n, @RequestBody Todo todo) {
		return todoService.atualizar(n, todo);
	}
	
	@DeleteMapping("/{n}")
	public String deletar(@PathVariable Integer n) {
		return todoService.deletar(n);
	}


}
