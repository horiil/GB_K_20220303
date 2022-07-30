package com.koreait.Springtest3.basic;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

	private static final Map<Long, Member> st = new HashMap<>();
	private static Long sequence = 1L;
	
	public Member save(Member member) {
		member.setNumber(++sequence);
		st.put(member.getNumber(), member);
		return member;
	}
}
