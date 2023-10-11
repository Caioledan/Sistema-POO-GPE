package projeto.poo.gpe;
import java.util.ArrayList;

//A classe sistema será uma classe que guardará os coordenadores cadastrados.
public class Sistema {
    private ArrayList<Coordenador> coordenadores = new ArrayList<>();

    //Função que irá cadastrar um Coordenador usando o costrutor da classe Coordenador.
    public void CadastrarCoordenador(String nome, String usuario, String senha, String instituicao){
        Coordenador novo = new Coordenador(nome, usuario, senha, instituicao);
        coordenadores.add(novo);
    }

    //O getter de Coordenadores irá printar todas as informações sobre todos os coordenadores.
    public void getCoordenadores() {
        for (int i = 0; i < coordenadores.size(); i++){
            if (coordenadores.get(i).getNome() != null) {
                System.out.println("Nome: " + coordenadores.get(i).getNome() + "| Usuario: " + coordenadores.get(i).getUsuario() + "| Senha: " + coordenadores.get(i).getSenha() + "| Instituicao: " + coordenadores.get(i).getInstituicao());
            }
        }
    }
    //Esse getter irá procurar um Coordenador pelo nome e irá printar todas as suas informações.
    public void getCoordenadores(String nome){
        for (int i = 0; i < coordenadores.size(); i++){
            if (coordenadores.get(i).getNome() == nome){
                System.out.println("Nome: " + coordenadores.get(i).getNome() + "| Usuario: " + coordenadores.get(i).getUsuario() + "| Senha: " + coordenadores.get(i).getSenha() + "| Instituicao: " + coordenadores.get(i).getInstituicao());
            }
        }
    }

}
