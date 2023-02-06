package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetStudent {

	public static void main(String[] args) {
     
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
	      EntityManager entityManager = entityManagerFactory.createEntityManager();
	      EntityTransaction entityTransaction = entityManager.getTransaction();
	      
	      Student s1 = entityManager.find(Student.class,1);
	      System.out.println(s1.getId());
	      System.out.println(s1.getName());
	      System.out.println(s1.getEmail());
	}

}
