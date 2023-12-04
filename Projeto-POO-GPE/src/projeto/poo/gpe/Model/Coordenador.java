package projeto.poo.gpe.Model;

import java.text.ParseException;
import java.util.ArrayList;
//A Classe Coordenador herda os atributos da classe usuário, validando também se pode ser criado.
//Também tem os atributos ArrayList de Coordenadores para verificar quantos Coordenadores foram cadastrados.
public class Coordenador extends Usuario {

    //Atributos da classe
    private final ArrayList<Projeto> projetos = new ArrayList<>();

    private final ArrayList<Coordenador> coordenadores = new ArrayList<>();

    //Método construtor quer irá atribuir os atributos da superclasse Usuario.
    public Coordenador(){
        super("Caio", "CaioLemos","Caio@1234","UFC");
    }

    //Método cancela e exclui um projeto.
    public void CancelarProjeto(String nome){
        for (int i = 0; i <projetos.size(); i++){
            if (projetos.get(i).getNome() == nome){
                projetos.remove(i);
            }
        }
    }

    //Funçaõ que cria um projeto no sistema
    public void adicionarProjeto(Projeto projeto){
        projetos.add(projeto);
    }

    //Função que remove um projeto do sistema
    public void removerProjeto(String nome){
        for (int i = projetos.size() - 1; i >= 0; i--){
            Projeto projeto = projetos.get(i);
            if (nome.equals(projeto.getNome())){
                projetos.remove(i);
            }
        }
    }

    //Função que cadastra uma mensagem no projeto
    public void AdicionarMensagem(String nomeProjeto, String mensagem){
        for (int i = projetos.size() - 1; i >= 0; i--){
            Projeto projeto = projetos.get(i);
            if (nomeProjeto.equals(projeto.getNome())){
                projeto.AdicionarMensagem(mensagem);
            }
        }
    }

    //Função que adiciona atividade em um projedo
    public void AdicionarAtividade(String nomeProjeto, String nomeAtividade, String datafinal) throws ParseException {
        for (Projeto projeto : projetos){
            if (nomeProjeto.equals(projeto.getNome())){
                projeto.AdicionarAtividade(nomeAtividade,datafinal);
            }
        }
    }

    //Funções getters
    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public ArrayList<Coordenador> getCoordenadores(){
        return coordenadores;
    }
}