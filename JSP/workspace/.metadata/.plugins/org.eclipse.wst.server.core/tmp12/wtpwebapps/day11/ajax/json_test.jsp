<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		let xhr = new XMLHttpRequest();
		/* data.json은 JSON 형식으로 데이터 작성한 file이다*/
		xhr.open("GET", "data.json", true);
		xhr.send();
		xhr.onreadystatechange = function(){
			if( xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200){
				alert(xhr.responseText);
// 				object안에다가  xhr.responseText를 json형식으로 파싱(잘르다)해서 가져온다
				let obj = JSON.parse(xhr.responseText);
				
				alert(obj.result);
				alert(obj.count);
			}
		}
	
	</script>
</body>
</html>