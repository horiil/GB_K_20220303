package com.koreait.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JapMain2 {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			// 비영속 상태
			Member member = new Member();
			member.setId(100L);
			member.setName("JPA1");
			
			// 여기서 부터 영속 상태
			// EntityManager안에있는 영속 컨텍스트에 관리가 된다는 뜻
			// 아직 DB에는 저장이 안된상태
			// 만약에 em.persist(member); 여기에서 Db쿼리가 실행더;ㄴ디먄.
			// DB쿼리가 실행이 되야한다.
			System.out.println("=============BEFORE=============");
			em.persist(member);
			System.out.println("=============AFTER=============");
			
			tx.commit();
		} catch (Exception e ){
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		

		
	}
	
}
