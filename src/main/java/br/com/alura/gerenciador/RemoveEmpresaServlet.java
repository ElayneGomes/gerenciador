package br.com.alura.gerenciador;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RemoveEmpresaServlet", value = "/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        System.out.println(id);

        response.getWriter().append("Served at: ").append(request.getContextPath());

        Banco banco = new Banco();
        banco.removeEmpresa(id);

        response.sendRedirect("listaEmpresas");

    }

}