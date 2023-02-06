package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      EntityTransaction entityTransaction = entityManager.getTransaction();
      
      Student s6 = new Student();
      s6.setId(7);
      s6.setName("pratham");
      s6.setEmail("pratham@gmail.com");
      
      Student s2 = new Student();
      s2.setId(2);
      s2.setName("akshay");
      s2.setEmail("akshay@gmail.com");
      
      Student s3 = new Student();
      s3.setId(3);
      s3.setName("uday");
      s3.setEmail("uday@gmail.com");
      
      Student s4 = new Student();
     s4.setId(5);
      s4.setName("adved");
      s4.setEmail("adved@gmail.com");
      
      Student s5 = new Student();
      s5.setId(6);
      s5.setName("nishant");
      s5.setEmail("nishant@gmail.com");
      
      
      entityTransaction.begin();
      entityManager.persist(s6);
      entityManager.persist(s2);
      entityManager.persist(s3);
      entityManager.persist(s4);
      entityManager.persist(s5);
    
      entityTransaction.commit();
      System.out.println("All good");
	}

}
