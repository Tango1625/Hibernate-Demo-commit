package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
	      EntityManager entityManager = entityManagerFactory.createEntityManager();
	      EntityTransaction entityTransaction = entityManager.getTransaction();
	      
	      Student s1 = entityManager.find(Student.class,6);
	      if (s1 !=null) {
			 s1.setName("omkar");
			 s1.setEmail("omkar@gmail.com");
			 entityTransaction.begin();
		     entityManager.merge(s1);
		     entityTransaction.commit();
		}else {
			System.out.println("Student not found");
		}
	      System.out.println("All good");
	}

}
