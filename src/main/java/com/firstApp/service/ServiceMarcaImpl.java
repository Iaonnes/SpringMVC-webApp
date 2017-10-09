package com.firstApp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.firstApp.beans.Marca;
import com.firstApp.dao.DAOMarca;


@Service("SERVhiber")
public class ServiceMarcaImpl implements ServiceMarca {
	
	@Autowired
	private DAOMarca daoMarca;
	
	@Transactional
	public void registrar(Marca marca) throws Exception {
		
		try {
		
			daoMarca.registrar(marca);
			
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	@Transactional
	public void eliminar(int id) throws Exception {
		
		daoMarca.eliminar(id);
		
	}

	@Transactional
	public void actualizar(Marca marca) throws Exception {

		daoMarca.actualizar(marca);
		
	}

	@Transactional
	public Marca getById(int id) throws Exception {
		
		return daoMarca.getById(id);
	}

	@Transactional
	public List allMarcas() {
		
		return daoMarca.allMarcas();
	}


}
