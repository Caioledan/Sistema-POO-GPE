package projeto.poo.gpe;

import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;
//A Classe Coordenador herda os atributos da classe usuário, validando também se pode ser criado.
//Também tem os atributos ArrayList de Coordenadores para verificar quantos Coordenadores foram cadastrados.
public class Coordenador extends Usuario {
    private ArrayList<Projeto> projetos = new ArrayList<>();

    //Método construtor quer irá atribuir os atributos da superclasse Usuario.
    public Coordenador(String nome, String usuario, String senha, String instituicao){
        super(nome,usuario,senha,instituicao);
    }

    //Método que irá criar um projeto para o Coordenador.
    public void CadastrarProjeto(String nome_projeto, Coordenador coordenador, String instituicao){
        Projeto novo = new Projeto(nome_projeto,coordenador,instituicao);
        projetos.add(novo);

    }

    //Método que irá cadastrar uma mensagem no projeto, para ser enviada quando quiser.
    public void EnviarMensagem(String mensagem, Coordenador coordenador, String projeto){
        System.out.println("Coordenador: "+ coordenador.getNome()+"\nProjeto: "+ projeto+"\nMensagem: "+mensagem);

    }

    //Método que mostra as informações do projeto.
    public void VisualizarProjeto(Projeto projeto){
        System.out.println("Nome: "+projeto.getNome()+" | Coordenador: "+projeto.getCoordenador()+" | Instituicao: "+projeto.getInstituicao()+" | Alunos: "+ projeto.getQuantAlunos());
    }

    //Método cancela e exclui um projeto.
    public void CancelarProjeto(String nome){
        for (int i = 0; i <projetos.size(); i++){
            if (projetos.get(i).getNome() == nome){
                projetos.remove(i);
            }
        }

    }

    //Método que mostra o relatório de atividades do projeto.
    public void CriarRelatorio(String atividade, int entregues, int faltantes){
        Relatorio novo = new Relatorio(atividade,entregues,faltantes);
        System.out.println("A atividade "+atividade+"tem "+entregues+" tarefas entregues e "+faltantes+"tarefas não entregues.");
    }

    //Função irá printar os dados dos projetos do coordenador.
    public void getProjetos() {
        for (int i = 0; i < projetos.size(); i++){
            System.out.println("Nome: "+ projetos.get(i).getNome() + " | Coordenador: "+ projetos.get(i).getCoordenador() +" | Instituicao: "+ projetos.get(i).getInstituicao());
        }
    }

}
