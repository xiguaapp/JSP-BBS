function isNull(){
	var _name=document.getElementById("name").value;
	var _pwd=document.getElementById("pwd").value;
	var _repwd=document.getElementById("rpwd").value;
	var _sex=document.getElementsByName("sex");
	var _email=document.getElementById("email").value;
	if(_name.trim()==""){
		alert("用户不能为空")
		return false;
	}
	if(_pwd.trim()==""){
		alert("密码不能为空")
		return false;
	}
	if(_repwd.trim()==""){
		alert("确认密码不能为空")
		return false;
	}
	if(_pwd!=_repwd){
		alert("确认密码！")
		return false;
	}
	if(!_sex[0].checked&&!_sex[1].checked){
		alert("性别不能为空")
		return false;
	}if(_email.trim()==""){
		alert("邮箱不能为空")
		return false;
	}
	
	 if(_email!=""){
		    var strRegex = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/;
		    if(!strRegex.test(_email)){
		    	alert("邮箱格式错误！")
		      return false;
		    }
		  }
		
	return true;
}