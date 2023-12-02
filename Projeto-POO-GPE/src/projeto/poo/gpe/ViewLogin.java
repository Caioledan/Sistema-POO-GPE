package projeto.poo.gpe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewLogin {
    Scanner scan = new Scanner(System.in);
    int resposta, user;


    public void Login(){
        System.out.println("Você gostaria de\n1 - Fazer Login\n2 - Se Cadastrar\nOutro - Encerrar programa\nInsira o número: ");
        try{
            resposta = scan.nextInt();
        }
        catch (InputMismatchException exceptionResp){
            System.out.println("Erro! Não foi digitado um número!\nPrograma finalizado!");
            System.exit(0);
        }
        if (resposta == 1){
            System.out.println("Que tipo de usuário você é?\n1 - Coordenador\n2 - Servidor\n3 - Aluno\n4 - Membro Externo\nInsira o número: ");
            try{
                user = scan.nextInt();
            }
            catch (InputMismatchException exceptionUser){
                System.out.println("Erro! Não foi digitado um número!\nPrograma finalizado!");
                System.exit(0);
            }
            if (user == 1){
                System.out.println("Insira seu usuário: ");
                String usuario = scan.nextLine();
                System.out.println("Insira sua senha: ");
            }

        }
        else if (resposta == 2){
            
        }
        else{
            System.out.println("Programa encerrado!");
        }






    }
}
