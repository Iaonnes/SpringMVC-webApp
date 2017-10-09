package com.firstApp.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.firstApp.beans.Marca;


@Repository
public class DAOMarcaImpl implements DAOMarca {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger;
	
	public void registrar(Marca marca) throws Exception {
		
		sessionFactory.getCurrentSession().save(marca);
	}

	public void actualizar(Marca marca) throws Exception {
		
		sessionFactory.getCurrentSession().update(marca);
		
	}

	public void eliminar(int id) throws Exception {
		
		sessionFactory.getCurrentSession().delete(getById(id));
		
	}

	public Marca getById(int id) throws Exception {
		
		return (Marca) sessionFactory.getCurrentSession().get(Marca.class, id);
		
	}

	public List allMarcas() {
		
		return sessionFactory.getCurrentSession().createQuery("from marck").list();
		
	}



}
