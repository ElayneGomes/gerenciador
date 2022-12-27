<%
    String nomeEmpresa = (String) request.getAttribute("empresa");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Nova Empresa</title>
</head>
<body>
    <h1>Empresa <% out.println(nomeEmpresa); %> cadastrada com sucesso!</h1>
</body>
</html>