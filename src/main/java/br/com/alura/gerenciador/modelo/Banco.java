package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {


    private static List<Empresa> listaDeEmpresas = new ArrayList<>();
    private static List<Usuario> listaDeUsuarios = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        Empresa empresa = new Empresa();
        empresa.setId(chaveSequencial++);
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setNome("Caelum");
        listaDeEmpresas.add(empresa);
        listaDeEmpresas.add(empresa2);

        Usuario usuario1 = new Usuario();
        usuario1.setLogin("Fulano");
        usuario1.setSenha("12345");

        Usuario usuario2 = new Usuario();
        usuario2.setLogin("Ciclano");
        usuario2.setSenha("54321");
        listaDeUsuarios.add(usuario1);
        listaDeUsuarios.add(usuario2);
    }

    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        listaDeEmpresas.add(empresa);
    }

    public List<Empresa> getEmpresas(){
        return Banco.listaDeEmpresas;
    }

    public static List<Empresa> getListaDeEmpresas() {
        return listaDeEmpresas;
    }

    public void removeEmpresa(Integer id) {

        Iterator<Empresa> it = listaDeEmpresas.iterator();

        while(it.hasNext()) {
            Empresa emp = it.next();

            if(emp.getId() == id) {
                it.remove();
            }
        }
    }

    public Empresa buscaEmpresaId(Integer id) {
        for (Empresa empresa : listaDeEmpresas) {
            if (empresa.getId().equals(id)) {
                return empresa;
            }
        }
        return null;
    }

    public Usuario existeUsuario(String login, String senha) {
        for (Usuario usuario : listaDeUsuarios) {
            if (usuario.ehIgual(login, senha)) {
                return usuario;
            }
        }
        return null;
    }
}
