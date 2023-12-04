package projeto.poo.gpe.Controller;

import projeto.poo.gpe.Model.*;

import java.text.ParseException;

public class ControllerCoordenador {
    //Atributos da classe
    public Coordenador coord = new Coordenador();

    public Servidor server = new Servidor("Pedro","PedroCord","Pedro@1234","UFC");

    //Método para cadastrar aluno dentro de um projeto
    public void CadastrarAluno(String nome, String usuario, String senha, String instituicao, String nomeprojeto){
        Aluno aluno = new Aluno(nome,usuario,senha,instituicao);
        for (Projeto projeto : coord.getProjetos()){
            if (nomeprojeto.equals(projeto.getNome())){
                projeto.MatricularAluno(aluno);
            }
        }
    }

    //Método que cadastra um servidor (Não utilizado)
    public void CadastrarServidor(String nome, String usuario, String senha, String instituicao){
        Servidor novo = new Servidor(nome,usuario,senha,instituicao);
    }

    //Método que cadastrar um membro externo (Não utilizado)
    public void CadastrarExterno(String nome, String usuario, String senha, String instituicao){
        MembroExterno externo = new MembroExterno("Joao","Geudo","Joao@1234","UECE");
    }

    //Método que cadastra um projeto
    public void CadastrarProjetos(String nome, String instituicao){
        Projeto projeto = new Projeto(nome,coord, instituicao);
        coord.adicionarProjeto(projeto);
    }

    //Método que deleta um projeto
    public void CancelarProjeto(String nome){
        coord.removerProjeto(nome);
    }

    //Método que cadastra mensagem no projeto selecionado
    public void CadastrarMensagem(String nome, String msg){
        coord.AdicionarMensagem(nome,msg);
    }

    //Método para visualizar mensagens, em formato de array, do projeto
    public String VisualizarMensagens(String nome){
        for (Projeto projeto : coord.getProjetos()){
            if (nome.equals(projeto.getNome())){
                return projeto.getMensagens().toString();
            }
        }
        return "Não acessado";
    }

    //Método que cadastra atividade no projeto selecionado
    public void CadastrarAtividade(String nomeProj, String nomeAtv, String datafinal) throws ParseException {
        coord.AdicionarAtividade(nomeProj,nomeAtv,datafinal);
    }
}
