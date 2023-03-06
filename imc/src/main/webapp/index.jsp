<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cálculo de IMC</title>
</head>
<body>
<h1><%= "Calculadora de IMC" %>
</h1>
<br/>
<form name="imcForm" action="CalculadoraIMC" method="GET">
    <table>
        <tr>
            <td>Seu peso (kg) :</td>
            <td><input type="text" name="peso"/></td>
        </tr>
        <tr>
            <td>Sua altura (m) :</td>
            <td><input type="text" name="altura"/></td>
        </tr>
        <th><input type="submit" value="Enviar" name="find"/></th>
        <th><input type="reset" value="Limpar" name="reset" /></th>
    </table>
    <h3>O IMC é: ${imc}</h3>
</form>
</body>
</html>