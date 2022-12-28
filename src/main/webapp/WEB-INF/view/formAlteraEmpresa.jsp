<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Alterando a Empresa</title>
</head>
<body>

    <c:import url="logout-parcial.jsp"/>

    <form action="${linkEntradaServlet}" method="post">
        Nome: <input type="text" name="nome" value="${empresa.nome}">
        Data de abertura: <input type="text" name="dataAbertura" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>">
        <input type="hidden" name="id" value="${empresa.id}">
        <input type="hidden" name="acao" value="AlteraEmpresa">
        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>