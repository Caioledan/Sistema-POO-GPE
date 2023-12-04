package projeto.poo.gpe.Controller;

import projeto.poo.gpe.Model.MembroExterno;
import projeto.poo.gpe.Model.Aluno;
import projeto.poo.gpe.Model.Servidor;

public class ControllerUsuario {
    public void CadastrarAluno(String nome, String usuario, String senha, String instituicao){
        Aluno aluno = new Aluno(nome,usuario,senha,instituicao);
    }

    public void CadastrarMembroExterno(String nome, String usuario, String senha, String instituicao){
        MembroExterno membro = new MembroExterno(nome,usuario,senha,instituicao);
    }

    public void CadastrarServidor(String nome, String usuario, String senha, String instituicao){
        Servidor server = new Servidor(nome,usuario,senha,instituicao);
    }


}
