<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Nova Empresa</title>
</head>
<body>

    <c:import url="logout-parcial.jsp"/>

    <form action="${linkEntradaServlet}" method="post">
        Nome: <input type="text" name="nome">
        Data de abertura: <input type="text" name="dataAbertura">
        <input type="hidden" name="acao" value="NovaEmpresa">
        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>