package projeto.poo.gpe.Model;

import java.util.ArrayList;

public class MembroExterno extends Usuario {
    //Atributos da classe
    ArrayList<MembroExterno> membros = new ArrayList<>();

    //Método construtor da classe
    public MembroExterno(String nome, String usuario, String senha, String instituicao) {
        super(nome, usuario, senha, instituicao);
        membros.add(this);
    }
}

//A classe não foi utilizada no sistema final por diversos motivos