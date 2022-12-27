<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <form action="${linkEntradaServlet}" method="post">
        <div>
            Login: <input type="text" name="login">
        </div>
        <div>
            Senha: <input type="password" name="senha">
        </div>
        <input type="hidden" name="acao" value="Login">
        <input type="submit" value="Logar">
    </form>
</body>
</html>