<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/Login.css">
<title>登录页面</title>

<script language="javascript">
	function check() {
		if (document.login.username.value == "") {
			alert("请输入用户名");
			document.login.username.focus();
			return false;
		}
		if (document.login.password.value == "") {
			alert("请输入密码");
			document.login.password.focus();
			return false;
		}
		return true;
	}
</script>

</head>
<body>

	<div class="top">
		<div class="title">
			<br /> <br /> <span style="font-size: 50px; color: green;">
				<font face="Corbel">We</font>
			</span> <span style="font-size: 40px; color: #202020;"> <font
				face="SketchFlow Print">love</font><br />
			</span> <span style="font-size: 70px; color: #202020;"> <font
				face="Hobo Std">Sharing</font>
			</span> <span style="font-size: 40px; color: #202020;"> <font
				face="Hobo Std">· · ·</font>
			</span>
		</div>
	</div>

	<div class="center">
		<div class="login">
			<form name="login" method="post" action="login">
				<table>
					<%--登录信息 --%>
					<tr>
						<td colspan=2><br /> <br /></td>
					</tr>
					<tr>
						<td colspan=2><br /> <br /></td>
					</tr>

	
					<tr>
						<td align=right height=48px><font color="white">用&nbsp;户&nbsp;名&nbsp;：</font></td>
						<td><input type="hidden" name="returl" value=""> <input
							style="border: 0px; border-radius: 4px; width: 180px; height: 23px;"
							type="text" name="username" value=""></td>
					</tr>

					<tr>
						<td align=right height=48px><font color="white">密&nbsp;&nbsp;&nbsp;码&nbsp;：<font></td>
						<td><input
							style="border: 0px; border-radius: 4px; width: 180px; height: 23px;"
							type="password" name="password"></td>
					</tr>

					<tr>
						<td align=center colspan=2 height=32><br /> <input
							style="border: 2px solid #419502; border-radius: 15px; font-size: 22px; color: white; background-color: #419502;"
							type="submit" name="/user/login" value="   登   录   "
							onclick="return check()"> <span style="font-size: 18px;">
								<font><a href="/BiShe/Register.jsp"> 注册</a></font>
						</span></td>
					</tr>

				</table>
			</form>
		</div>
	</div>

	<%
		String error = (String) request.getAttribute("error");
		if (error != "" && error != null) {
			%>
			<script>
			alert("<%=error%>");</script>
			<% 
		}
	%>

</body>
</html>