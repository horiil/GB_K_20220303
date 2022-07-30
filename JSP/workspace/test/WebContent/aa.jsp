<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width-device-width", initial-scale="1">
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
			<!-- 게시판 글쓰기 영역 -->
	<div class="container">
		<div class="row">
			<form method="post" action="writeAction.jsp">
				<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
					<thead>
						<tr>
							<th colspan="2" style="background-color: #eeeeee"; text-align: center; ">게시판 글쓰기</th>
					<tbody>
						<tr>
							<td><input type="text" class="form-control" placeholder="제목" name="bbstitle" maxlength="50"></td>
						</tr>
						<tr>
							<td><textarea class="form-control" placeholder="내용" name="bbsContent" maxlength="2048" style="height": 350px;></textarea></td>
						</tr>
					</tbody>
				</table>
				<!-- 글쓰기 -->
				<input type="submit" class="button btn-primary pull-right" value="글쓰기">
			</form>
		</div>
	</div>
</body>
</html>