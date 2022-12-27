package br.com.alura.gerenciador.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Gerenciador implements Acao {

    public String executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Iniciando o projeto Gerenciador!!!");

        return "forward:index.jsp";
    }

}
