package br.com.alura.gerenciador;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MostraEmpresaServlet", value = "/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        Banco banco = new Banco();
        Empresa empresa = banco.buscaEmpresaId(id);

        System.out.println(empresa.getNome());

        request.setAttribute("empresa", empresa);
        RequestDispatcher rd = request.getRequestDispatcher("formAlteraEmpresa.jsp");
        rd.forward(request, response);

//        banco.editaEmpresa(empresa);

    }

}
