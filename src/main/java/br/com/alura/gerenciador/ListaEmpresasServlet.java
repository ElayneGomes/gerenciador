package br.com.alura.gerenciador;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListaEmpresasServlet", value = "/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Banco banco = new Banco();
        List<Empresa> listaDeEmpresas = banco.getEmpresas();
        request.setAttribute("empresas", listaDeEmpresas);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listaEmpresas.jsp");
        requestDispatcher.forward(request, response);

    }

}
