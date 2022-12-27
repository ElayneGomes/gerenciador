package br.com.alura.gerenciador;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "NovaEmpresaServlet", value = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Cadastrando nova empresa");

        String nomeEmpresa = req.getParameter("nome");
        String paramDataAbertura = req.getParameter("dataAbertura");

        Date dataAbertura = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(paramDataAbertura);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);

        Banco banco = new Banco();
        banco.adiciona(empresa);

//        //Chama o JSP
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/listaEmpresas");
//        req.setAttribute("empresa", empresa.getNome());
//        requestDispatcher.forward(req, resp);

        req.setAttribute("empresa", empresa.getNome());
        resp.sendRedirect("listaEmpresas");

    }
}