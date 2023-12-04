package projeto.poo.gpe.Model;

import java.util.ArrayList;

public class MembroExterno extends Usuario {

    ArrayList<MembroExterno> membros = new ArrayList<>();
    public MembroExterno(String nome, String usuario, String senha, String instituicao) {
        super(nome, usuario, senha, instituicao);
        membros.add(this);
    }
}
