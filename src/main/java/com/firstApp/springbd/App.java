package com.firstApp.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.firstApp.beans.Marca;
import com.firstApp.service.ServiceMarca;



public class App {


	public static void main( String[] args ) throws Exception
    {
        
        
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/firstApp/xml/beans.xml");
        ServiceMarca sm = context.getBean("SERVhiber", ServiceMarca.class);
        
        
        System.out.println("---------------CRUD--------------");
        System.out.println("\n\n\n");
        System.out.println("1)Agregar\n2)Eliminar\n3)Actualizar\n");
        
        Marca m = new Marca();
        
        m.setId(12);
        m.setNombre("Void");
            
        try {
        	
        	sm.actualizar(m);
        	sm.eliminar(11);
        	
		} catch (Exception e) {
			
			throw e;
			
		}
        
    }
}


