<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width-device-width", initial-scale="1">
<link href="abc.css" rel="stylesheet" type="text/css">
<title>고객센터</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</head>
<body>
	<%
		String userID = null;
		if(session.getAttribute("userID")!=null){
			userID = (String)session.getAttribute("userID");
		}
	%>
	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<!-- 내비게이션바 자동접기 -->
			<button type="button" class="navbar-toggle collapsed" 
				data-toggle="collapse" data-target="#bs-exaple-navbar-collapse-1" aria-expanded="false">
				<!-- 화면이 좁아지면 우측으로 이동 -->
				<span class="icon-bar"></span>	
				<span class="icon-bar"></span>	
				<span class="icon-bar"></span>	
			</button>
			<a class="navbar-brand" href="a.jsp">고객센터</a>
		</div>
		
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		
		<ul class="nav navbar-nav">
			<li><a href="?">메인</a></li>
			<li class="active"><a href="a.jsp">게시판</a></li>
		</ul>
		<%
			//로그인 안했을시
			if(userID == null){
		%>
		<!-- 헤더 우측에 나타나는 드랍다운 영역 -->
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" 
					aria-haspopup="true" aria-expanded="false">접속<span class="caret"></span></a>
				<ul class="dropdown-menu">
				<li><a href="?">로그인</a></li>
				<li><a href="?">회원가입</a></li>
			</ul>
		</li>
		</ul>
		
		<%
			//로그인 상태
			}else{
		%>		
		<!-- 헤더우측 드랍다운영역 -->
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">회원관리 <span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a href="?">로그아웃</a></li>
			
			</ul>	
			</li>	
		</ul>
		
		<%
			}
		%>
		</div>
		</nav>
		<!--  고객센터 메인 -->
		<div class="container">
			<div class="row">
				<table class="table table-striped">
		<thead>
			<tr>
				<th style="background-color:#eeeeee; text-align: center;">번호</th>			
				<th style="background-color:#eeeeee; text-align: center;">제목</th>			
				<th style="background-color:#eeeeee; text-align: center;">작성자</th>			
				<th style="background-color:#eeeeee; text-align: center;">날짜</th>			
			</tr>
		</thead>
		<tbody>
			<tr>
				<!-- 예시 -->
				<td>1</td>
				<td>안녕하세요</td>
				<td>김민수</td>
				<td>2022-06-07</td>
			</tr>
		</tbody>
		</table>
		<a href="aa.jsp" class="btn btn-primary pull-right">글쓰기</a>
		
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>