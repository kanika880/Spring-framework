package com.spring.jdbc.application;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.application.controllers.*;

public class JdbcApplication {
	public static void main(String[] args) throws SQLException {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		
		CrudController crudController = context.getBean("crudController", CrudController.class);
		crudController.read();
		crudController.create();
		crudController.update();
		crudController.delete();
		context.close();
	}


}
