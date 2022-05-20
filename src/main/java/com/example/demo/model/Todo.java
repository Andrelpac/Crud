package com.example.demo.model;

public class Todo {
	
	private Integer id;

	private String titulo;
	
	private String description;
	
	private String hora;
	
	public Todo() {
	}

	public Todo(Integer id, String titulo, String description, String hora) {
		this.id = id;
		this.titulo = titulo;
		this.description = description;
		this.hora = hora;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
}
