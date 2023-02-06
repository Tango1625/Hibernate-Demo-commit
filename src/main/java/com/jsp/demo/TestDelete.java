package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
	      EntityManager entityManager = entityManagerFactory.createEntityManager();
	      EntityTransaction entityTransaction = entityManager.getTransaction();
	      
	      Student s1 = entityManager.find(Student.class,1);
	      
	      entityTransaction.begin();
	      entityManager.remove(s1);
	      entityTransaction.commit();
	      System.out.println("all good");
	    
	      
	}

}
