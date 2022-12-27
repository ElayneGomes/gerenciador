<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Nova Empresa</title>
</head>
<body>
    <c:if test="${not empty empresa}">
        <h4>Empresa ${empresa} cadastrada com sucesso!</h4>
    </c:if>

    <c:if test="${empty empresa}">
        <h4>Nenhuma empresa cadastrada!</h4>
    </c:if>
</body>
</html>