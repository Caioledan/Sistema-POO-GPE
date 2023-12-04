package projeto.poo.gpe.Model;

import java.util.ArrayList;

public class Aluno extends Usuario {
    //Essa é uma classe aluno que servirá para termos um ArrayList de alunos em um projeto.
    //Ou seja, será um objeto criado para termos o controle de alunos em determinado projeto.

    private final ArrayList<Aluno> alunos = new ArrayList<>();

    //Método construtor abaixo:
    public Aluno(String nome, String usuario, String senha, String instituicao) {
        super(nome,usuario,senha,instituicao);
        alunos.add(this);
    }

    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }
}