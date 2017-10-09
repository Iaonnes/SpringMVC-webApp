package com.firstApp.beans;

import javax.persistence.*;

@Entity
@Table(name="marck")
public class Marca {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	

	public Marca(int id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}
	
	
	public Marca() {
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
}
