<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/Register.css" />
<title>注册页面-年级信息交流平台</title>
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

	<div class="bottom">
		<div class="register">
			<form name="register" method="post" action="/BiShe/register">
				<table>

					<tr>
						<td colspan=3 height=48px></td>
					</tr>

					<tr>
						<td align=right height=48px>用&nbsp;&nbsp;户&nbsp;&nbsp;名&nbsp;：</td>
						<td colspan=2><input
							style="border: 0px; border-radius: 4px; width: 180px; height: 23px;"
							type="text" name="username" value=""></td>
					</tr>

					<tr>
						<td align=right height=48px>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;：</td>
						<td colspan=2><input
							style="border: 0px; border-radius: 4px; width: 180px; height: 23px;"
							type="password" name="password" value=""></td>
					</tr>

					<tr>
						<td align=right height=48px>密&nbsp;码&nbsp;确&nbsp;认&nbsp;：</td>
						<td colspan=2><input
							style="border: 0px; border-radius: 4px; width: 180px; height: 23px;"
							type="password" name="confpwd" value=""></td>
					</tr>


					<tr>
						<td align=right height=48px>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;校&nbsp;：</td>
						<td colspan=2><input
							style="border: 0px; border-radius: 4px; width: 180px; height: 23px;"
							type="text" name="schoolname" value=""></td>
					</tr>

					<tr>
						<td align=right height=48px>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱&nbsp;：</td>
						<td colspan=2><input
							style="border: 0px; border-radius: 4px; width: 180px; height: 23px;"
							type="text" name="email" value=""></td>
					</tr>

					<tr>
						<td align=right><input
							style="border: 2px solid #419502; border-radius: 15px; font-size: 20px; color: white; background-color: #419502;"
							type="submit" value=" 提交 " onclick="return Check()"></td>
						<td align=left colspan=2 height=48>
							&nbsp;&nbsp;&nbsp;&nbsp;<input
							style="border: 2px solid #419502; border-radius: 15px; font-size: 20px; color: white; background-color: #419502;"
							name="reset" type="reset" value=" 重填 "> <span
							style="font-size: 18px;">&nbsp; <font><a
									href="/BiShe/Login.jsp">已注册？登录</a></font>
						</span> <%--客户端验证--%> <script language="javascript">
							function Check() {

								if (document.register.schoolname.value == "") {
									window.alert("学校不能为空！");
									window.register.schoolname.focus();
									return false;
								}

								if (document.register.username.value == "") {
									window.alert("用户名不能为空！");
									window.register.username.focus();
									return false;
								}

								if (document.register.password.value == "") {
									window.alert("密码不能为空！");
									window.register.password.focus();
									return false;
								}
								if (document.register.confpwd.value == "") {
									window.alert("请确认您的密码");
									window.register.confpwd.focus();
									return false;
								}

								if (document.register.password.value != document.register.confpwd.value) {
									window.alert("两次输入的密码不同！");
									window.register.password.focus();
									document.register.password.value = "";
									document.register.confpwd.value = "";
									return false;
								}

								var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
								if (!filter.test(document.register.email.value)) {
									window.alert('电子邮件格式不正确');
									window.register.email.focus();
									document.register.email.value = "";
									return false;
								}
								return true;
							}
						</script>

						</td>
					</tr>

					<tr>
						<td colspan=3 height=32px></td>
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