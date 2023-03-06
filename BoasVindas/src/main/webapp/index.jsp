<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Boas-Vindas!</title>
</head>
<body>
<h1><%= "Olá!" %>
</h1>
<br/>
<form name="dadosPessoaisForm" action="BoasVindas" method="POST">
    <table>
        <tr>
            <td>Informe seu nome :</td>
            <td><input type="text" name="nome"/></td>
        </tr>
        <tr>
            <td>Informe seu email :</td>
            <td><input type="email" name="email"/></td>
        </tr>
        <th><input type="submit" value="Enviar" name="find"/></th>
        <th><input type="reset" value="Limpar" name="reset" /></th>
    </table>
</form>
</body>
</html>