/**
 * 
 */
$("#memberId").on("blur", function(){checkId($(this).val());});


function checkId(memberId){
	
	if(!memberId){
		$("#result").text("아이디를 입력해주세요.");
		return;
	}
	
	/*$.ajax({
		url: "/member/checkId.me'',
		data: {"memberId": memberId},
		success: function(result){
			let msg;
			if(result == "true"){
				msg = "사용 가능한 아이디입니다.";
			} else {
				msg = "중복된 아이디입니다.";
			}
			
			$("#result").text(msg);
		},
		error: function(a, b, c){
			console.log(a,b,c);
		}
	});*/
}