package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.modelo.Banco;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveEmpresa {

    public void executa (HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Removendo a empresa");

        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        System.out.println(id);

        response.getWriter().append("Served at: ").append(request.getContextPath());

        Banco banco = new Banco();
        banco.removeEmpresa(id);

        response.sendRedirect("entrada?acao=ListaEmpresas");

    }
}
