package arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// 7.
		ArrayList<Student> st = new ArrayList<>(11);
		
		
		// 8.
		 
		for (int i = 0; i < 10; i++) {
			Student p = new Student("학생"+i, "010-1234-5678"+i, "서울시"+i);
			st.add(p);
		}
// 틀림..
//		for (int i = 0; i < st.size(); i++)
//			st.add(new Student("톰0"		,"미국"				,"010-1234-5678"));
//			st.add(new Student("제리1"	,"United States"	,"011-2234-5678"));
//			st.add(new Student("짱구2"	,"일본"				,"012-3234-5678"));
//			st.add(new Student("짱아3"	,"japan"			,"013-4234-5678"));
//			st.add(new Student("도라에몽4"	,"경기"				,"014-5234-5678"));
//			st.add(new Student("스폰지밥5"	,"비키니시티"			,"015-6234-5678"));
//			st.add(new Student("징징이6"	,"Gikini Bottom"	,"016-7234-5678"));
//			st.add(new Student("푸7"		,"미국 숲속"			,"017-8234-5678"));
//			st.add(new Student("스누피8"	,"경기도"				,"018-9234-5678"));
//			st.add(new Student("라푼젤9"	,"디즈니시티"			,"019-0234-5678"));
		
		// 9.
		System.out.println(st.size());
		System.out.println("________________________________");
		// 10.
		System.out.println(st.get(4));
		System.out.println("________________________________");
		// 11.
		st.remove(4);
		// 12.
		
		for(int i = 0; i<9; i++) {
			Student temp = st.get(i);
			System.out.println(temp.toString());
		}
// 틀림..
//		System.out.println(st.toString());
	}

}
