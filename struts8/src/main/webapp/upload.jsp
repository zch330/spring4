<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/26 0026
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file" size="80"> <br>
    <input type="submit" value="文件上传">
</form>
</body>
</html>
