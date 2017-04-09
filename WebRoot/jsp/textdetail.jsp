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
    
    <title>My JSP 'listdetail.jsp' starting page</title>
    
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
	
    <form action="mainlist/tocreateorupdate" method="post">
    	<table width="800" height="2000" border="5" cellspacing="0" cellpadding="0">
    		<tr><td align="center">${text.title }</td></tr>
    		<tr><td align="left"><fmt:formatDate value="${text.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td></tr>
    		<tr><td><img src="${text.url}" width="800" height="800"></td></tr>
    		<tr><td><table width="800" height="1000" border="5" cellspacing="0" cellpadding="0">
    		<tr><td><div style="width: 800;height: 900">
    		 <span>${text.detaile }</span>
				</div>
    		</td></tr>
    		</table></td></tr>
    	</table> 
    	<input type="hidden" name="id" value="${text.id }">
    	<input type="submit" value="编辑">
    	<a href="mainlist/tocreateorupdate">新建</a>

    </form>
  </body>
</html>
