package com.test.jpatest;


import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class JpaMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			Member member = new Member();
			member.setId(100L);
			member.setName("memberA");
			member.setCity("서울");
			member.setStreet("거꾸로해도 역삼역");
			member.setZipcode(123);
			em.persist(member);
			
			Order order = new Order();
			order.setId(100L);
			order.setOrderDate(LocalDateTime.now());
			order.setStatus("접수0");
			em.persist(order);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}

	}

}
