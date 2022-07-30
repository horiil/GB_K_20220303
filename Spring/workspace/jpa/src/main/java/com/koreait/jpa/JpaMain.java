package com.koreait.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		
		// Transaction 처리를 해줘야 한다.
		// Transaction : 데이터베이스의 상태를 변화시키기 위해 수행하는 작업 단위
		EntityTransaction tx = em.getTransaction();
		// Transaction을 열어줌
		tx.begin();
		
		try {
			// JPQL
			// JPA는 쿼리르 ㄹ짤대 Table을 대상으로 쿼리를 작성하지 않고,
			// Member 객체를 통해서 쿼리를 작성한다고 보면 된다.
			List<Member> result = em.createQuery("select m from Member as m", Member.class)
					.setFirstResult(5)	// 5번부터
					.setMaxResults(10)	// 10개를 가지고와
					.getResultList();
				
			
			for(Member member : result ) {
				System.out.println("member.name = " + member.getName());
			}
			
			
			
			
			
			
			
			
			
			// 회원조회
			/*
			Member findmember = em.find(Member.class, 1L);	//Member라는 class를 조회해서 1L이라는 값을 가져올거야 라는 코드이다.
			System.out.println( "id : " + findmember.getId());
			System.out.println( "name : " + findmember.getName());
			*/
			
			// 회원 삭제
			// em.remove(findmember);		//delete 문이 날아간다.
			
			// 회원 수정
			// findmember.setName("HelloJPAUser");		// update 문이 날아간다.
			
			
			// 회원 등록
			/*
			Member mem = new Member();
			
			mem.setId(2L);
			mem.setName("UserB");
			
			// persist : db에 저장하라는 뜻
			em.persist(mem);
			*/
			
			
			// Transaction 저장. 닫음
			tx.commit();
		} catch (Exception e ){
			tx.rollback();
		} finally {
			// em. emf를 반드시 닫아줘야 한다.
			em.close();
			emf.close();
		}
		

		
	}
}
	