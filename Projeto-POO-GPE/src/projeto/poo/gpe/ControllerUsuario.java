package projeto.poo.gpe;

public class ControllerUsuario {
    public void CadastrarAluno(String nome, String usuario, String senha, String instituicao){
        Aluno aluno = new Aluno(nome,usuario,senha,instituicao);
    }

    public void CadastrarMembroExterno(String nome, String usuario, String senha, String instituicao){
        MembroExterno membro = new MembroExterno(nome,usuario,senha,instituicao);
    }

    public void CadastrarServidor(String nome, String usuario, String senha, String instituicao){
        Servidores server = new Servidores(nome,usuario,senha,instituicao);
    }
}
