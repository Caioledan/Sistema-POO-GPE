package projeto.poo.gpe.Model;

import java.util.ArrayList;

public class Servidor extends Usuario {
    //Atribulo de lista do servidor
    private ArrayList<Servidor> servidores = new ArrayList<>();

    //Construtor da classe
    public Servidor(String nome, String usuario, String senha, String instituicao) {
        super(nome, usuario, senha, instituicao);
        servidores.add(this);
    }

    //Método getter
    public ArrayList<Servidor> getServidores() {
        return servidores;
    }

}
//A classe não foi utilizada no sistema final por diversos motivos