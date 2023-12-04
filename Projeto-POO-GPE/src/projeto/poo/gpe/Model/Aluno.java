package projeto.poo.gpe.Model;

import java.util.ArrayList;

public class Aluno extends Usuario {
    //Atributos da classe
    private final ArrayList<Aluno> alunos = new ArrayList<>();

    //Método construtor abaixo:
    public Aluno(String nome, String usuario, String senha, String instituicao) {
        super(nome,usuario,senha,instituicao);
        alunos.add(this);
    }

    //Metodo para retornar o ArrayList de alunos
    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }
}