<%--
  Created by IntelliJ IDEA.
  User: JJong
  Date: 2021-07-27
  Time: 오후 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    =====${loginYear}=====<br>
    <form action="LoginPrc.do" method="post">
        <label for="userId">UserID:</label><input type="text" id="userId" name="userId"><br>
        <label for="userPw">UserPW:</label><input type="password" id="userPw" name="userPasswd"><br>
        <button type="submit" value="로그인">로그인</button>
        <button type="reset" value="다시입력">다시입력</button>
    </form>
</body>
</html>
