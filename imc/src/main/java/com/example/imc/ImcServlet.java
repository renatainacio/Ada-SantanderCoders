package com.example.imc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/CalculadoraIMC")
public class ImcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double peso = Double.parseDouble(req.getParameter("peso"));
        Double altura = Double.parseDouble(req.getParameter("altura"));
        Double imc = peso/(altura * altura);
        req.setAttribute("imc", String.format("%.2f", imc));
        resp.setHeader("imc", String.format("%.2f", imc));
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
