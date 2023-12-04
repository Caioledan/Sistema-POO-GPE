package projeto.poo.gpe.Model;

//A classe Usuario servirá de herança para as subclasses ALuno e Coordenador.
public abstract class Usuario {
    //Atributos da classe
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
                }

            }
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

    public void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        }
    }

    public void setUsuario(String usuario) {
        if (usuario != null) {
            this.usuario = usuario;
        }
    }

    public void setSenha(String senha) {
        if (senha != null){
            this.senha = senha;
        }
    }
}
