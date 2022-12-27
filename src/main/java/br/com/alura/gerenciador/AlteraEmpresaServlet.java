package br.com.alura.gerenciador;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "AlteraEmpresaServlet", value = "/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Alterando o cadastrando da empresa");

        String nomeEmpresa = request.getParameter("nome");
        String paramDataAbertura = request.getParameter("dataAbertura");
        String parameterId = request.getParameter("id");
        Integer id = Integer.valueOf(parameterId);

        Date dataAbertura = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(paramDataAbertura);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Banco banco = new Banco();
        Empresa empresa = banco.buscaEmpresaId(id);
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);

        response.sendRedirect("listaEmpresas");
    }
}
