<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Nova Empresa</title>
</head>
<body>
    <form action="${linkServletAlteraEmpresa}" method="post">
        Nome: <input type="text" name="nome" value="${empresa.nome}">
        Data de abertura: <input type="text" name="dataAbertura" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>">
        <input type="hidden" name="id" value="${empresa.id}">
        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>