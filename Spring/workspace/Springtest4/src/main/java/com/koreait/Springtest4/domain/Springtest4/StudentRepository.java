package com.koreait.Springtest4.domain.Springtest4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class StudentRepository {
	private static final Map<Long, Student> store = new HashMap<>();
	private static Long sequence = 1L;
	
	
	// 저장 메서드
	public Student save(Student student) {
		// 학번 sequence
		student.setStudentId(++sequence);
		store.put(student.getStudentId(), student);
		return student;
	}
	
	// id로 찾기
	public Student findById(Long studentId) {
		return store.get(studentId);
	}
	
	// 전체 검색
	public List<Student> findAll(){
		return new ArrayList<Student>(store.values());
	}
	
	// 수정
	public void update(Long studentId, Student updateParam) {
		Student findItem = findById(studentId);
		findItem.setStudentId(updateParam.getStudentId());
		findItem.setStudentName(updateParam.getStudentName());
		findItem.setAge(updateParam.getAge());
		findItem.setSubject(updateParam.getSubject());
		findItem.setPhone(updateParam.getPhone());
		findItem.setAddr(updateParam.getAddr());
	}
}
