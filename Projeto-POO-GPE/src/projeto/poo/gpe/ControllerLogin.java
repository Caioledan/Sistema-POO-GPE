package projeto.poo.gpe;

import java.util.Map;

public class ControllerLogin {

    Coordenador coord = new Coordenador();

    public void Login(String usuario, String senha){
        if (usuario.equals(coord.getUsuario())){
            System.out.println("Logado com Sucesso!");
        }
        else{
            System.out.println("Credenciais incorretas!");
        }

    }
}
