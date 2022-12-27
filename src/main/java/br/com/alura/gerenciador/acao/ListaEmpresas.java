package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListaEmpresas {

    public String executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Listando as Empresas");

        Banco banco = new Banco();
        List<Empresa> listaDeEmpresas = banco.getEmpresas();
        request.setAttribute("empresas", listaDeEmpresas);

        return "forward:listaEmpresas.jsp";

    }

}
