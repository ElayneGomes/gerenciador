package br.com.alura.gerenciador;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NovaEmpresaServlet", value = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Cadastrando nova empresa");

        String nomeEmpresa = req.getParameter("nome");
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);

        Banco banco = new Banco();
        banco.adiciona(empresa);

        //Chama o JSP
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/novaEmpresa.jsp");
        req.setAttribute("empresa", empresa.getNome());
        requestDispatcher.forward(req, resp);

    }
}