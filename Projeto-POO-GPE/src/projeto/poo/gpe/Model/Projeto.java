package projeto.poo.gpe.Model;

import java.text.ParseException;
import java.util.ArrayList;

//A classe projeto irá guardar todas as informações de determinado projeto, tais como as atividades, os alunos e o coordenador.
public class Projeto {
    //Atributos da classe
    private String nome;
    private Coordenador coordenador;
    private String instituicao;
    private ArrayList<Aluno> alunosMatriculados = new ArrayList<>();
    private ArrayList<Atividade> atividades = new ArrayList<>();
    private static final ArrayList<Projeto> projetos = new ArrayList<>();
    private static final ArrayList<String> mensagens = new ArrayList<>();

    //O método construtor da classe verificará se os dados são válidos.
    public Projeto(String nome, Coordenador coord, String instituicao) {
        if(nome != null && coord != null && instituicao != null){
            this.nome = nome;
            this.instituicao = instituicao;
            this.coordenador = coord;
            }
    }

    // Depois que criada, a atividade será adicionada no ArrayList Atividades.
    public void AdicionarAtividade(String nome, String data_final) throws ParseException {
        Atividade nova = new Atividade(nome,data_final);
        atividades.add(nova);
    }

    //Método para adicionar uma mensagem no projeto
    public void AdicionarMensagem(String mensagem){
        mensagens.add(mensagem);
    }

    //Método pra matricular aluno no projeto
    public void MatricularAluno(Aluno aluno){
        alunosMatriculados.add(aluno);
    }


    //Métodos getter abaixo.
    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public String getNome() {
        return nome;
    }

    public String getCoordenador() {
        return this.coordenador.getNome();
    }

    public String getInstituicao() {
        return instituicao;
    }

    public ArrayList<Aluno> getAlunos(){
        return alunosMatriculados;
    }

    public int getQuantAlunos(){
        return alunosMatriculados.size();
    }

    public static ArrayList<Projeto> getProjetos(){
        return projetos;
    }

    public ArrayList<String> getMensagens(){
        return mensagens;
    }


}