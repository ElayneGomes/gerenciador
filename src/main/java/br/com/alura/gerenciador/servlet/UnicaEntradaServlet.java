package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.acao.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UnicaEntradaServlet", value = "/entrada")
public class UnicaEntradaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramAcao = request.getParameter("acao");

        HttpSession session = request.getSession();
        boolean usuarioNaoEstaLogado = (session.getAttribute("usuarioLogado") == null);
        boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));

        if (ehUmaAcaoProtegida && usuarioNaoEstaLogado) {
            response.sendRedirect("entrada?acao=LoginForm");
            return;
        }

        String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
        String nome;

        try {
            Class<?> classe = Class.forName(nomeDaClasse);// Carrega a classe com o nome
            Acao acao = (Acao) classe.newInstance();
            nome = acao.executa(request, response);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new ServletException(e);
        }

        String[] tipoEEndereco = nome.split(":");
        if (tipoEEndereco[0].equals("forward")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect(tipoEEndereco[1]);
        }

    }

}
