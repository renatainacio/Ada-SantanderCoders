<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Peso Ideal</title>
</head>
<body>
<h1><%= "Cálculo de Peso Ideal" %>
</h1>
<br/>
<form name="pesoIdealForm" action="CalculadoraPesoIdeal" method="GET">
    <table>
        <tr>
            <td>Informe o sexo (F ou M) :</td>
            <td><input type="text" name="sexo"/></td>
        </tr>
        <tr>
            <td>Informe a altura (m) :</td>
            <td><input type="text" name="altura"/></td>
        </tr>
        <th><input type="submit" value="Enviar" name="find"/></th>
        <th><input type="reset" value="Limpar" name="reset" /></th>
    </table>
    <h3>O peso ideal é ${pesoIdeal}</h3>
</form>
</body>
</html>