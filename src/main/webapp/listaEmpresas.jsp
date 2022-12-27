<%@ page import="br.com.alura.gerenciador.Empresa" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Empresas</title>
</head>
<body>
    <h1>Lista de Empresas:</h1>
    <ul>
        <%
            List<Empresa> listaDeEmpresas = (List<Empresa>) request.getAttribute("listaDeEmpresas");
            for (Empresa empresa : listaDeEmpresas) {
        %>
            <li><%=empresa.getNome()%></li>
        <%
            }
        %>
    </ul>

</body>
</html>
