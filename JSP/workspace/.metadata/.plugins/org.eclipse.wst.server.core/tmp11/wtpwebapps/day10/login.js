/**
 * 
 */

function sendit(){
	// 아이디 ""처리
	// 비밀번호 "" 처리
	
	let chFrm = document.frm;
	
	let userid = chFrm.userid;
	let userpw = chFrm.userpw;
	
	if(!userid.value){
		alert("ID를 입력해 주세요.");
		userid.focus();
		return false;
	}
	
	if(!userpw.value){
		alert("패스워드를 입력해 주세요.");
		userpw.focus();
		return false;
	}
	
	chFrm.submit();
}