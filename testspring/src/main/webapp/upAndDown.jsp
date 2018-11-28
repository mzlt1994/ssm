<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\28 0028
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="<c:url context="${pageContext.request.contextPath}/upAndLoad" value="/upLoad"/>" method="post" enctype="multipart/form-data">
        文件名：<input type="file" name="filename"/>
        <input type="submit" value="上传"/>
    </form>>
    <a href="<c:url context="${pageContext.request.contextPath}/upAndLoad" value="/download"/>?filename=lcy.txt">下载</a>
</body>
</html>
