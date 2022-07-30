package com.koreait.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JpqlMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		// Transaction : 데이터베이스의 상태를 변화시키기 위해 수행하는 작업 단위
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			Team team = new Team();
			team.setName("teamA");
			em.persist(team);
			
			Member member = new Member();
			member.setUsername("member1");
			member.setAge(10);
			member.changeTeam(team);
			em.persist(member);
			
			// 서브쿼리
			String jpql = "select m from Member m where m.age > (select avg(m2.age) from Member m2)";
			List<Member> resultList = em.createQuery(jpql,Member.class)
										.getResultList();
			
			
			/*
			//left outer join
			//where m.username = :username
			String jpql = "select m from Member m left outer join m.team t ";
			List<Member> resultList = em.createQuery(jpql,Member.class)
										.getResultList();
			*/
			
			/*
			// inner 조인
			String jpql = "select m from Member m inner join m.team t";
			List<Member> resultList = em.createQuery(jpql, Member.class)
										.getResultList();
			*/
			
			/*
			for(int i = 0; i<100; i++) {
				Member member = new Member();
				member.setUsername("member1");
				member.setAge(i);
				em.persist(member);
			}
			
			// 페이징 처리
			// order by 가 들어가야한다.
			String jpql = "select m from Member m order by m.username desc";
			List<Member> resultList = em.createQuery(jpql, Member.class)
										.setFirstResult(10)
										.setMaxResults(20)
										.getResultList();
			
			System.out.println("result.size : " + resultList.size());
			for( Member mem : resultList) {
				System.out.println("member : " + mem.toString());
			}
			*/
			
			/*
			// new 명령어 조회 - 제일 좋은 방법
			List<MemberDTO> result = em.createQuery("select new com.koreait.jpql.MemberDTO(m.username, m.age) from Member m")
									   .getResultList();
			MemberDTO mem = result.get(0);
			System.out.println( "member username : " + mem.getUsername() );
			System.out.println( "member age : " + mem.getAge() );
			*/
			
			
			/*
			// Object[] 타입 조회
			List<Object[]> resultList = em.createQuery("select m.username, m.age from Member m")
						  				  .getResultList();
			// 타입을 지정하기 못하니까 object 받아온다.
			Object[] result = resultList.get(0);
			System.out.println("username : " + result[0]);
			System.out.println("age : " + result[1]);
			*/
			
			
			/*
			// Query 타입으로 조회
			List resultList = em.createQuery("select m.username, m.age from Member m")
						  		.getResultList();
			// 타입을 지정하기 못하니까 object 받아온다.
			Object o = resultList.get(0);
			Object[] result = (Object[])o;
			System.out.println("username : " + result[0]);
			System.out.println("age : " + result[1]);
			*/
			
 			
			
			/*
			// 스칼라 타입
			em.createQuery("select m.username, m.age from Member m")
			  .getResultList();
			*/
			
			
			/*
			// 엔티티 프로젝션
//			List<Team> result = em.createQuery("select m.team from Member m", Team.class)
//								  .getResultList();
			List<Team> result = em.createQuery("select t from Member m join m.team t", Team.class)
								  .getResultList();
			*/
			
			
			/*
			// 엔티티 프로젝션
			List<Member> result = em.createQuery("select m from Member m", Member.class)
									.getResultList();
			*/
			
			
			/*
			// 파라미터 - 위치기반(쓰지말것)
			Member result =  em.createQuery("select m from Member m where m.username = ?1", Member.class)
							   .setParameter(1, "member1")
							   .getSingleResult();
		
			System.out.println("resutl : " + result.getUsername());
			System.out.println("resutl : " + result.getAge());
			*/
			
//			TypedQuery<Member> query
//				= em.createQuery("select m from Member m where m.username = ?1", Member.class);
//				query.setParameter(1, "member1");
//			
//			Member result = query.getSingleResult();
			
			/*
			// 파라미터 - 이름기준
			TypedQuery<Member> query
				= em.createQuery("select m from Member m where m.username = :username", Member.class);
			query.setParameter("username", "member1");
			
			Member result = query.getSingleResult();
			System.out.println("resutl : " + result.getUsername());
			System.out.println("resutl : " + result.getAge());
			*/
			
			
			
			/*
			// 타입정보가 명확할때
			TypedQuery<Member> query =
					em.createQuery("select m from Member m",Member.class);
			
			//List<Member> resutList = query.getResultList();
			
			Member result = query.getSingleResult();
			
			System.out.println("result : " + result);
			
//			for( Member member1 : resutList ) {
//				System.out.println("member1 = " + member1.getUsername());
//				System.out.println("member1 = " + member1.getAge());
//			}
			*/
			
			tx.commit();
		} catch( Exception e ) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		
	}

}









