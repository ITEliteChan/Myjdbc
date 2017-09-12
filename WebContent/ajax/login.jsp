<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
</head>
<body>
<form action="" name="f1" id ="form1">
<table>
<tr>
<td>用户名</td>
<td><input type="text" id="usernameid" name="username" value="zhangsan"></td>
</tr>

<tr>
<td>密码</td>
<td><input  type="password" id="passwordid" name="password" value="123"></td>
</tr>
<tr>
<td colspan="2"><input type="button" id="b1" value="提交"></td>
</tr>
</table>
</form>
<div id="div1" style="width:400px;height:200px;background-color: gray;"></div>
<script type="text/javascript">
/*load(url,forda)
 * 
 */
 $(document).ready(function(){//页面加载后执行一次下面的方法
	 $("#b1").click();
 })
 
 
$("#b1").click(function(){
	$("#div1").load("server.jsp",{username:$("#usernameid").val(),password:$("#passwordid").val()},function(data,textStaus,xmlRequest){
		
	})
})

</script>

</body>
</html>