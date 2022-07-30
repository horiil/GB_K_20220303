/**
 * 
 */

// 회원가입 폼 validation check
// 아이디"" 처리
// 아이디 5자리 이상, 16자리 미만
// 비밀번호 ""처리
// 비밀번호 8자리 이상
// 비밀번호, 비밀번호 확인이 같은지 체크
// 이름이 "" 처리
// 휴대폰 번호 "" 처리

function sendit(){
	//잘 넘어오는지 테스트용 문구
//	alert("test");
	
	let frm = document.joinForm;
	let userid = frm.userid;
	let userpw = frm.userpw;
	let userpw_re = frm.userpw_re;
	let username = frm.username;
	let userphone = frm.userphone;
	
	// 아이디 ""값 처리 
	if(!frm.userid.value){
		alert("ID를 입력해주세요");
		frm.userid.focus();
		return false;
	}
	
	if(frm.userid.value.length < 5){
		alert("5자리 이상의 ID를 입력해주세요");
		frm.userid.focus();
		return false;
	} else if (frm.userid.value.length > 15) {
		alert("16자리 미만으로 입력해주세요");
		frm.userid.focus();
		return false;
	}
	
	if(!frm.userpw.value){
		alert("PW를 입력해주세요");
		frm.userpw.focus();
		return false;
	}
	
	if(frm.userpw.value.length < 8){
		alert("8자리 이상의 PW를 입력해주세요");
		frm.userpw.focus();
		return false;
	}
	
	if(!frm.userpw_re.value){
		alert("PW확인을 입력해주세요");
		frm.userpw_re.focus();
		return false;
	}
	
	
	if(frm.userpw_re.value != frm.userpw.value){
		alert("입력된 PW가 일치하지 않습니다. 다시 입력해주세요")
		frm.userpw_re.focus();
		return false;
	}
	
	
	if(!frm.username.value){
		alert("이름을 입력해주세요");
		frm.username.focus();
		return false;
	}
	
	
	
	if(!frm.userphone.value){
		alert("휴대폰 번호를 입력해주세요");
		frm.userphone.focus();
		return false;
	}
	
	frm.submit();
}