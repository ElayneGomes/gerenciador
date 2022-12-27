package br.com.alura.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> listaDeEmpresas = new ArrayList();
    public void adiciona(Empresa empresa) {
        listaDeEmpresas.add(empresa);
    }

    public static List<Empresa> getListaDeEmpresas() {
        return listaDeEmpresas;
    }
}
