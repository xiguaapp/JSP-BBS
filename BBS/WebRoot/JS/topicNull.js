function isNull(){
	var _message=document.getElementById("message");
	if(_message.trim()==""){
		alert("消息不能为空");
		return false;
	}
	return true;
}