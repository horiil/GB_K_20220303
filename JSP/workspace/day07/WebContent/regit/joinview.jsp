<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입</h3>
	<form action="join.jsp" id="joinForm" method="post">
		아이디		<input type="text" name="userid" id="userid"><br>
		비밀번호	<input type="password" name="userpw" id="userpw"><br>
		이름		<input type="text" name="username" id="username"><br>
		핸드폰 번호	<input type="text" name="userphone" id="userphone"><br>
		<br>
<!-- 		<input type="submit"> -->
		<input type="button" value="회원가입" onclick="sendit()">
	</form>
	
	<script>
		function sendit(){
			// validation check
			// 아이디 "" 체크
			// 비밀번호 "" 체크
			// 비밀번호 8자리 이상 체크 ""
			// 이름 "" 체크
			// 휴대폰 "" 체크
			// form submit()

			//Form태그의 값을 frm에 받아옴
			let frm = document.getElementById("joinForm");	
			let idTag = document.getElementById("userid");
			let pwTag = document.getElementById("userpw");
			let nameTag = frm.username;
			let phoneTag = frm.userphone;
			
			if(idTag.value == ""){
				alert("아이디를 입력하세요!")
				idTag.focus();
				return false;
			}
			
			if(pwTag.value == ""){
				alert("비밀번호를 입력하세요!")
				pwTage.focus();
				return false;
			}
			
			if(pwTag.value.length < 8){
				alert("비밀번호를 8자리 이상으로 입력하세요!")
				pwTage.focus();
				return false;
			}
			
			if(nameTag.value == ""){
				alert("이름를 입력하세요!")
				nameTag.focus();
				return false;
			}
			
			if(phoneTag.value == ""){
				alert("휴대전화 번호를 입력하세요!")
				phoneTage.focus();
				return false;
			}
			// input 태그로 submit을 하는것은 위에 있는 form을 서버로 전송 함
			// button에 이벤트로 submit을 붙여줌  위의  validation check에 걸리지 않으면 서버로 전송
			// form submit()
			frm.submit();
		}
	
	</script>

</body>
</html>