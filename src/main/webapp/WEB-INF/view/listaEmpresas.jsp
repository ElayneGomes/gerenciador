<%@ page import="java.util.List, br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Empresas</title>
</head>
<body>

    <c:import url="logout-parcial.jsp"/>
    <br>
    <br>
    <br>

    <c:if test="${not empty empresa}">
        Empresa ${empresa} cadastrada com sucesso!
    </c:if>

    Lista de empresas: <br />

    <ul>
        <c:forEach items="${empresas}" var="empresa">

            <li>
                    ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
                <a href="/gerenciador/entrada?acao=MostaEmpresa&id=${empresa.id}">edita</a>
                <a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">remove</a>
            </li>
        </c:forEach>
    </ul>

</body>
</html>
