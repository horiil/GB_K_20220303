package com.koreait.Springtest3.basic;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Springtest3Controller {
	private final MemberRepository memberRepository;

	@GetMapping("/")
	public String member() {
		return "member";
	}
	
	
	@PostConstruct
	public void init() {
		memberRepository.save(new Member(1, "memberA", 01012345670));
		memberRepository.save(new Member(2, "memberB", 01012345670));
		memberRepository.save(new Member(1, "memberC", 01012345670));
		memberRepository.save(new Member(1, "memberD", 01012345670));
		memberRepository.save(new Member(2, "memberE", 01012345670));
		memberRepository.save(new Member(2, "memberF", 01012345670));
	}
	
}
