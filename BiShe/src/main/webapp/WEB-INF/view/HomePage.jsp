<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/HomePage.css" />

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/group.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.3.2.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.featureList-1.0.0.js"></script>


<script language="javascript">
	$(document).ready(function() {

		$.featureList($("#tabs li a"), $("#output li"), {
			start_item : 0
		});
	});
</script>

<title>首页</title>

</head>
<body>
	<div class="top">
		<div class="user">
			<br /> <span style="font-size: 30px; color: white;"> <font
				face="Corbel">${loginuser.username}</font>
			</span>
			<div>
				<img alt="" src="images/home.png" width="64px" height="44px">
				&nbsp;&nbsp;&nbsp;&nbsp;<a href="/BiShe/logout">退出登录</a>
			</div>
		</div>
		<div class="sharing">
			<span style="font-size: 100px; color: #333333;"> <font
				face="Hobo Std">SHARING</font>
			</span>
		</div>
	</div>

	<div class="blank"></div>
	<div class="group">
		<%-- <%
			User user = (User) session.getAttribute("loginuser");
			System.out.println(user.getUsername());
		%> --%>

		<div id="content">
			<div id="feature_list">
				<ul id="tabs">

					<c:forEach items="${group}" var="item">
						<li><a onclick="">
								<h3>${item.groupname}</h3>
						</a></li>
					</c:forEach>
				</ul>
				<ul id="output">
					<div class="message">


						<table border="0px" width=100% height=180px>
							<tr>
								<td style="background-color: #333333; border: 0px;"><textarea
										cols="74px" rows="6px" id="text1"
										style="background-color: #2a2a2a; color: white; border: 1px solid #2a2a2a; font-size: 16px"></textarea><br />
									<br />

									<div style="float: right">
										<input type="button" value="发表"
											style="background-color: #419502; border-radius: 5px; border: 1px solid #333333; font-size: 16px; color: #2a2a2a;"
											onclick="" /> <br /> <br />
									</div></td>
							</tr>
						</table>
						<div id="showdata" style="width: 100%; height: 100px; border:1px solid red;">
							<c:forEach items="${group}" var="item">
								<li><a onclick="">
										<h3>${item.groupname}</h3>
								</a></li>
							</c:forEach>
						</div>
					</div>
					<div class="resource">AAAAAAAAAA</div>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>