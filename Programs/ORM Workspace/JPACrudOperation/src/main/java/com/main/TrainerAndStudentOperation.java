package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bean.Student;
import com.bean.Trainer;

public class TrainerAndStudentOperation {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");
		EntityManager manager  = emf.createEntityManager();	// like Statement or PreparedStatement
		EntityTransaction tran = manager.getTransaction();
		
		// Store Trainer Data 
		
		Trainer t1 = new Trainer();
		t1.setTid(100);
		t1.setTname("Ravi");
		t1.setTech("Java");
		
		Trainer t2 = new Trainer();
		t2.setTid(101);
		t2.setTname("Raj");
		t2.setTech("Python");

		Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("Reeta");
		s1.setAge(21);
		s1.setTsid(100);
		
		Student s2 = new Student();
		s2.setSid(2);
		s2.setSname("Veeta");
		s2.setAge(22);
		s2.setTsid(100);
		
		
		Student s3 = new Student();
		s3.setSid(3);
		s3.setSname("Meeta");
		s3.setAge(23);
		s3.setTsid(101);
		
		Student s4 = new Student();
		s4.setSid(4);
		s4.setSname("Teeta");
		s4.setAge(25);
		s4.setTsid(101);
		
		tran.begin();
			manager.persist(t1);
			manager.persist(t2);
		tran.commit();
		System.out.println("Trainer record stored");
		
		tran.begin();
			manager.persist(s1);
			manager.persist(s2);
			manager.persist(s3);
			manager.persist(s4);
		tran.commit();
		
		System.out.println("Student records stored");
	}

}
