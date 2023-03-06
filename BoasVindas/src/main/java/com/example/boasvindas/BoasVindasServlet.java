package com.example.boasvindas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/BoasVindas")
public class BoasVindasServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String saudacao;
        int hora = LocalDateTime.now().getHour();
        if (hora > 5 && hora < 12)
            saudacao = "Bom dia";
        else if (hora >= 12 && hora < 18)
            saudacao = "Boa tarde";
        else
            saudacao = "Boa noite";
        saudacao = String.format(saudacao + ", " + nome);
        req.setAttribute("saudacao", saudacao);
        resp.setHeader("saudacao", saudacao);
        req.getRequestDispatcher("/BoasVindas.jsp").forward(req, resp);
    }
}
