function isNull(){
	var _name=document.getElementById("name").value;
	var _pwd=document.getElementById("pwd").value;
	if(_name.trim()==""){
		alert("用户名不能为空");
		return false;
		
	}
	if(_pwd.trim()==""){
		alert("密码不能为空");
		return false;
	}
	return true;
}