package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;

@Service
public class TodoService {

	List<Todo> lista = new ArrayList<Todo>();

	public String inserir(Todo todo) {
		lista.add(todo);
		return "Foi inserido com sucesso";
	}

	public List<Todo> retornarTodos() {
		return lista;
	}

	public Todo retornarUnico(Integer id) {
		for (Todo todo : lista) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

	public Todo atualizar(Integer id, Todo newTodo) {
		for (Todo todo : lista) {
			if (todo.getId() == id) {
				if (newTodo.getTitulo() != "" && newTodo.getTitulo() != null) {
					todo.setTitulo(newTodo.getTitulo());
				}
				if (newTodo.getDescription() != "" && newTodo.getDescription() != null) {
					todo.setDescription(newTodo.getDescription());
				}
				if (newTodo.getHora() != "" && newTodo.getHora() != null) {
					todo.setHora(newTodo.getHora());
				}
				return todo;
			}
		}
		return null;
	}

	public String deletar(Integer id) {
		Todo deletado = null;
		for (Todo todo : lista) {
			if (todo.getId() == id) {
				deletado = todo;
				break;
			}
		}
		if (deletado != null) {
			lista.remove(deletado);
			return "Deletado com Sucesso";
		}
		return "Não há item com esse id para ser deletado";
	}

}
