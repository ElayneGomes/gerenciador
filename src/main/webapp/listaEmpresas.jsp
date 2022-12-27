<%@ page import="br.com.alura.gerenciador.Empresa" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Lista de Empresas</title>
</head>
<body>

    <c:if test="${not empty empresa}">
        <h4>Empresa ${empresa} cadastrada com sucesso!</h4>
    </c:if>

    <h1>Lista de Empresas:</h1>

    <ul>
        <c:forEach items="${listaDeEmpresas}" var="empresa">
            <li>${empresa.nome} -
                <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />
            </li>
        </c:forEach>
    </ul>
</body>
</html>
