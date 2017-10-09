package com.firstApp.dao;

import java.util.List;

import com.firstApp.beans.Marca;

public interface DAOMarca {

	public void registrar(Marca marca) throws Exception;
	public void eliminar (int id) throws Exception;
	public void actualizar (Marca marca) throws Exception;
	public Marca getById(int id) throws Exception;
	public List allMarcas();
	
}
