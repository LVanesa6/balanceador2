package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contenedor {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 @Override
public String toString() {
	// TODO Auto-generated method stub
	return "Nombre Contenedor:" + name;
}
}
