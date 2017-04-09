<%@ page language="java"import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <title>MyHtml.html</title>
	<base href="<%=basePath%>">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
    <!-- 配置文件 -->
    <script type="text/javascript" src="../ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="../ueditor.all.js"></script>
    <script type="text/javascript" src="../lang/zh-cn/zh-cn.js"></script>

  </head>
  
  <body>
  <form action="mainlist/createorupdate" method="post">
  	<c:if test="${id!=null}"><h1 style="color: blue;">编辑文章</h1></c:if>
	<c:if test="${id==null}"><h1 style="color: blue;">添加文章</h1></c:if><br>
	<span style="color: red">${message }</span><br>
	文章标题<h1><input name="title" value="${text.title }"></h1>
	文章封面url<input name="url" value="${text.url }"><br>
   	 文章内容<textarea rows="40" cols="80" id="center" name="detaile" >${text.detaile }</textarea>
   	 <input type="hidden" name="createtime" value="${text.createtime }">
   	 <input type="hidden" name="id" value="${text.id }">
    
    <!-- 实例化编辑器 -->
    <script type="text/javascript">
        var ue = UE.getEditor(document.getElementById("center"));
    </script>
	<input type="submit" value="提交">
	</form>
	<a href="mainlist/textlist">进入主列表页面</a>

  </body>
</html>
