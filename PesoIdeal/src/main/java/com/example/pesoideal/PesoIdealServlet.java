package com.example.pesoideal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/CalculadoraPesoIdeal")
public class PesoIdealServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double altura = Double.parseDouble(req.getParameter("altura"));
        String sexo = req.getParameter("sexo");
        Double pesoIdeal = 0.0;
        if (sexo.equals("M"))
            pesoIdeal = (72.7 * altura) - 58;
        else if (sexo.equals("F"))
            pesoIdeal = (62.1 * altura) - 44.7;
        req.setAttribute("pesoIdeal", String.format("%.2f", pesoIdeal));
        resp.setHeader("pesoIdeal", String.format("%.2f", pesoIdeal));
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}