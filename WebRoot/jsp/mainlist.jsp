<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mainlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="">
    <c:forEach items="${list}" var="text">
    	<table width="500" border="5" cellspacing="0" cellpadding="0" height="208">
    	<tr>
    	<td align="left">
    	<img src="${text.url}" width="200" height="200"></td>
    	<td><table width="300" border="5" cellspacing="0" cellpadding="0" height="208">
    	<tr align="center"><td><a href="mainlist/edite?id=${text.id}" >${text.title}</a></td></tr>
    	<tr align="center"><td><fmt:formatDate value="${text.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td></tr></table> 	
    	</td>
    	</tr>	
    	</table>
    </c:forEach>
    </form>
  </body>
</html>
