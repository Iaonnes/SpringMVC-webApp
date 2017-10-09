package com.firstApp.service;

import java.util.List;

import com.firstApp.beans.Marca;

public interface ServiceMarca {
	
	public void registrar(Marca marca) throws Exception;
	public void eliminar (int id) throws Exception;
	public void actualizar (Marca marca) throws Exception;
	public Marca getById(int id) throws Exception;
	public List  allMarcas();

}
