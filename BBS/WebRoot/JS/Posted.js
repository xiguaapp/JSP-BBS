function isNull(){
	var _tittle=document.getElementById("tittle").value;
	var _tinfo=document.getElementById("tinfo").value;
	if(_tittle.trim()==""){
		alert("标题不能为空！");
		return false;
	}
	if(_tinfo.trim()==""){
		alert("内容不能为空！");
		return false;
	}
	return true;
}