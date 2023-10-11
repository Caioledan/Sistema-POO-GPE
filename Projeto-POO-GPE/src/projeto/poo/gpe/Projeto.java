package projeto.poo.gpe;

//Importações para usos futuros.
import java.text.ParseException;
import java.util.ArrayList;

//A classe projeto irá guardar todas as informações de determinado projeto, tais como as atividades, os alunos e o coordenador.
public class Projeto {
    private String nome;
    private Coordenador coordenador;
    private String instituicao;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Atividade> atividades = new ArrayList<>();

    //O método construtor da classe verificará se os dados são válidos.
    public Projeto(String nome, Coordenador coordenador, String instituicao) {
        if (!nome.isEmpty()) {
            this.nome = nome;
            this.coordenador = coordenador;
            if (!instituicao.isEmpty()) {
                this.instituicao = instituicao;
            } else {
                System.out.println("Dados inválidos");

            }
        } else {
            System.out.println("Dados inválidos");

        }

    }

    //O método adicionar atividades utilizará o ParseException para alocar data.
    // Depois que criada, a atividade será adicionada no ArrayList Atividades.
    //Porém o método não foi implementado completamente como sistema.
    public void AdicionarAtividade(String nome, String data_final) throws ParseException {
        Atividade nova = new Atividade(nome, data_final);
        atividades.add(nova);
        System.out.println("Atividade "+ nome+" foi criada com sucesso. A data de entrega e: " + data_final);
    }

    //Do mesmo modo, quando um aluno é cadastrado ele será guardado no ArrayList Alunos.
    public void CadastrarAluno(String nome, String usuario, String senha, String instituicao) {
        Aluno novo = new Aluno(nome, usuario, senha, instituicao);
        alunos.add(novo);
    }


    //Métodos getter e setters abaixo.
    public void getAtividades() {
        for (int i = 0; i < atividades.size(); i++){
            System.out.println("Nome: "+ atividades.get(i).getNome()+ " | Data: "+atividades.get(i).getData_final());
        }
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

    public void getAlunos(){
        for (int i = 0; i<alunos.size(); i++){
            System.out.println("Nome: "+ alunos.get(i).getNome()+ " | Usuario: "+ alunos.get(i).getUsuario() + " | Senha: "+ alunos.get(i).getSenha()+ " | Instituicao: "+alunos.get(i).getInstituicao());
        }
    }

    public int getQuantAlunos(){
        return alunos.size();
    }



}

