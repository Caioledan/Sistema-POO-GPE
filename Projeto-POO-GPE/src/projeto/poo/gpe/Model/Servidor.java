package projeto.poo.gpe.Model;

import java.util.ArrayList;

public class Servidor extends Usuario {


    private ArrayList<Servidor> servidores = new ArrayList<>();
    public Servidor(String nome, String usuario, String senha, String instituicao) {
        super(nome, usuario, senha, instituicao);
        servidores.add(this);
    }

    public ArrayList<Servidor> getServidores() {
        return servidores;
    }



}
