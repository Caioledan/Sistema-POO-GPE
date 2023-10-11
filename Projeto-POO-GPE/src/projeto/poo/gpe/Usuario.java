package projeto.poo.gpe;

//A classe Usuario servirá de herança para as subclasses ALuno e Coordenador.
public class Usuario {
    private String nome;
    private String usuario;
    private String senha;
    private String instituicao;

    //O método construtor terá validação de todos os atributos.
    public Usuario(String nome, String usuario, String senha, String instituicao) {
        if (!nome.isEmpty()){
            if (ValidarSenha(senha)){
                if (!usuario.isEmpty()){
                    if (!instituicao.isEmpty()){
                        this.senha = senha;
                        this.nome = nome;
                        this.usuario = usuario;
                        this.instituicao = instituicao;
                    }
                    else {
                        System.out.println("Instituicao invalida, repita o processo de criacao de usuario.");

                    }
                }
                else {
                    System.out.println("Usuario invalido, repita o processo de criacao de usuario.");

                }

            }
            else {
                System.out.println("Senha invalida, repita o processo de criacao de usuario.");


            }
        }
        else {
            System.out.println("Nome invalido, repita o processo de criacao de usuario");

        }
    }

    //Método que irá verificar se a senha é válida (Pelo menos uma letra maiúscula e um número):
    public boolean ValidarSenha(String senha){
        for (int i = 0; i < senha.length(); i++){
            if (Character.isUpperCase(senha.charAt(i))){
                for (int u = 0; u < senha.length(); u++ ){
                    if (Character.isDigit(senha.charAt(u))){
                        return true;
                    }
                }

            }


        }
        return false;
    }

    //Métodos getter e setter:
    public String getNome() {
        return nome;
    }


    public String getUsuario() {
        return usuario;
    }


    public String getSenha() {
        return senha;
    }


    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}
