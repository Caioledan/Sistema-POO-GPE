package projeto.poo.gpe.Controller;

import projeto.poo.gpe.Model.*;

import java.text.ParseException;

public class ControllerCoordenador {

    public Coordenador coord = new Coordenador();

    public Servidor server = new Servidor("Pedro","PedroCord","Pedro@1234","UFC");

    public void CadastrarAluno(String nome, String usuario, String senha, String instituicao, String nomeprojeto){
        Aluno aluno = new Aluno(nome,usuario,senha,instituicao);
        for (Projeto projeto : coord.getProjetos()){
            if (nomeprojeto.equals(projeto.getNome())){
                projeto.MatricularAluno(aluno);
            }
        }
    }

    public void CadastrarServidor(String nome, String usuario, String senha, String instituicao){
        Servidor novo = new Servidor(nome,usuario,senha,instituicao);
    }

    public void CadastrarExterno(String nome, String usuario, String senha, String instituicao){
        MembroExterno externo = new MembroExterno("Joao","Geudo","Joao@1234","UECE");
    }

    public void CadastrarProjetos(String nome, String instituicao){
        Projeto projeto = new Projeto(nome,coord, instituicao);
        coord.adicionarProjeto(projeto);
    }

    public void CancelarProjeto(String nome){
        coord.removerProjeto(nome);
    }

    public void CadastrarMensagem(String nome, String msg){
        coord.AdicionarMensagem(nome,msg);
    }


    public String VisualizarMensagens(String nome){
        for (Projeto projeto : coord.getProjetos()){
            if (nome.equals(projeto.getNome())){
                return projeto.getMensagens().toString();
            }
        }
        return "Não acessado";
    }

    public void CadastrarAtividade(String nomeProj, String nomeAtv, String datafinal) throws ParseException {
        coord.AdicionarAtividade(nomeProj,nomeAtv,datafinal);
    }


}
