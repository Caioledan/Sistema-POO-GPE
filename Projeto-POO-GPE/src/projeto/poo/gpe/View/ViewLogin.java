package projeto.poo.gpe.View;

import projeto.poo.gpe.Controller.ControllerAluno;
import projeto.poo.gpe.Controller.ControllerCoordenador;
import projeto.poo.gpe.Controller.ControllerServidor;
import projeto.poo.gpe.Model.Aluno;
import projeto.poo.gpe.Model.Atividade;
import projeto.poo.gpe.Model.Projeto;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewLogin {
    Scanner scan = new Scanner(System.in);

    ControllerCoordenador coord = new ControllerCoordenador();

    int resposta, user;

    public void Login() throws ParseException {
        do {
            System.out.println("Você gostaria de\n1 - Fazer Login\nOutro - Encerrar programa\nInsira o número: ");
            try {
                resposta = scan.nextInt();
            } catch (InputMismatchException exceptionResp) {
                System.out.println("Erro! Não foi digitado um número!\nPrograma finalizado!");
                System.exit(0);
            }
            if (resposta == 1) {
                do {
                    System.out.println("Que tipo de usuário você é?\n1 - Coordenador\n2 - Aluno\nOutro - Voltar\nInsira o número: ");
                    try {
                        user = scan.nextInt();
                        scan.nextLine();
                    } catch (InputMismatchException exceptionUser) {
                        System.out.println("Erro! Não foi digitado um número!\nPrograma finalizado!");
                        System.exit(0);
                    }
                    if (user == 1) {
                        System.out.println("Digite seu Usuário: ");
                        String usuario = scan.nextLine();
                        System.out.println("Digite sua Senha: ");
                        String senha = scan.nextLine();
                        if (usuario.equals(coord.coord.getUsuario()) && senha.equals(coord.coord.getSenha())) {
                            int action = 0;
                            do {
                                System.out.println("Logado como Coordenador, o que deseja fazer: \n1 - Cadastrar Aluno\n2 - Cadastrar Servidor\n3 - Cadastrar membro externo\n4 - Cadastrar Projeto\n5 - Visualizar Projetos\n6 - Cancelar Projeto\n7 - Enviar Mensagem\n8 - Visualizar Mensagens\n9 - Cadastrar Atividade\n10 - Visualizar Atividades\n11 - Ver alunos\\nOutro numero - Parar Programa\nInsira o número: ");
                                while (true) {
                                    try {
                                        action = scan.nextInt();
                                        scan.nextLine();
                                        break;
                                    } catch (InputMismatchException exception1) {
                                        System.out.println("Erro! Não foi digitado um número!\nInsira o numero:");
                                        scan.next();
                                    }
                                }
                                if (action == 1) {
                                    System.out.println("Nome do aluno:");
                                    String nomealuno = scan.nextLine();
                                    System.out.println("Usuario do aluno:");
                                    String usuarioaluno = scan.nextLine();
                                    System.out.println("Senha do aluno:");
                                    String senhaaluno = scan.nextLine();
                                    System.out.println("Instituicao do aluno:");
                                    String instituicaoaluno = scan.nextLine();
                                    System.out.println("Projeto do Aluno: ");
                                    String nomeprojeto = scan.nextLine();
                                    coord.CadastrarAluno(nomealuno, usuarioaluno, senhaaluno, instituicaoaluno, nomeprojeto);
                                    System.out.println("Aluno cadastrado com sucesso!");
                                } else if (action == 2) {
                                    System.out.println("Nome do Servidor:");
                                    String nome = scan.nextLine();
                                    System.out.println("Usuario do Servidor:");
                                    String user = scan.nextLine();
                                    System.out.println("Senha do Servidor:");
                                    String senhaServer = scan.nextLine();
                                    System.out.println("Instituicao do Servidor: ");
                                    String instituicao = scan.nextLine();
                                    coord.CadastrarServidor(nome, user, senhaServer, instituicao);
                                    System.out.println("Servidor cadastrado com sucesso!");
                                } else if (action == 3) {
                                    System.out.println("Nome do Membro:");
                                    String nome = scan.nextLine();
                                    System.out.println("Usuario do Membro:");
                                    String user = scan.nextLine();
                                    System.out.println("Senha do Membro:");
                                    String senhaExterno = scan.nextLine();
                                    System.out.println("Instituicao do Membro: ");
                                    String instituicao = scan.nextLine();
                                    coord.CadastrarExterno(nome, user, senhaExterno, instituicao);
                                    System.out.println("Membro externo cadastrado com sucesso!");
                                } else if (action == 4) {
                                    System.out.println("Nome do projeto: ");
                                    String nomeprojeto = scan.nextLine();
                                    System.out.println("Instituicao do projeto: ");
                                    String instituicaoprojeto = scan.nextLine();
                                    coord.CadastrarProjetos(nomeprojeto, instituicaoprojeto);
                                    System.out.println("Projeto cadastrado com sucesso!");
                                } else if (action == 5) {
                                    for (Projeto projeto : coord.coord.getProjetos()) {
                                        System.out.println("Nome: " + projeto.getNome() + "\nCoordenador do projeto: " + projeto.getCoordenador() + "\nInstituicao: " + projeto.getInstituicao() + "\n--------------------");
                                    }
                                } else if (action == 6) {
                                    System.out.println("Insira o nome do projeto: ");
                                    String nome = scan.nextLine();
                                    coord.CancelarProjeto(nome);
                                } else if (action == 7) {
                                    System.out.println("Projeto no qual deseja cadastrar: ");
                                    String nome = scan.nextLine();
                                    System.out.println("Mensagem deseja cadastrar:");
                                    String msg = scan.nextLine();
                                    coord.CadastrarMensagem(nome, msg);
                                } else if (action == 8) {
                                    System.out.println("Nome do projeto: ");
                                    String nome = scan.nextLine();
                                    System.out.println(coord.VisualizarMensagens(nome));
                                } else if (action == 9) {
                                    System.out.println("Nome do projeto que deseja cadastrar a atividade");
                                    String nomeProj = scan.nextLine();
                                    System.out.println("Nome da atividade:");
                                    String nomeAtv = scan.nextLine();
                                    System.out.println("Data final da atividade (dd/mm/yyyy hh:mm):");
                                    String data = scan.nextLine();
                                    coord.CadastrarAtividade(nomeProj, nomeAtv, data);
                                } else if (action == 10) {
                                    System.out.println("Nome do projeto que deseja acessar: ");
                                    String nome = scan.nextLine();
                                    for (Projeto projeto : coord.coord.getProjetos()) {
                                        if (nome.equals(projeto.getNome())) {
                                            for (Atividade atv : projeto.getAtividades()) {
                                                System.out.println("Nome da Atividade: " + atv.getNome() + "\nData final da atividade: " + atv.getData_final() + "\n------------------------------------");
                                            }
                                        }
                                    }
                                } else if (action == 11) {
                                    for (Projeto projeto : coord.coord.getProjetos()) {
                                        System.out.println("Projeto: " + projeto.getNome() + "\nAlunos:");
                                        for (Aluno aluno : projeto.getAlunos()) {
                                            System.out.println(aluno.getNome());
                                        }
                                        System.out.println("---------------------------------");
                                    }
                                } else {
                                    System.out.println("Saindo do programa com sucesso!");
                                    break;
                                }
                            }
                            while (true);
                        }

                    }
                    else if (user == 2) {
                        System.out.println("Digite seu Usuário: ");
                        String usuario = scan.nextLine();
                        System.out.println("Digite sua Senha: ");
                        String senha = scan.nextLine();
                        for (Projeto projeto : coord.coord.getProjetos()) {
                            for (Aluno aluno : projeto.getAlunos()) {
                                if (usuario.equals(aluno.getUsuario())) {
                                    int action = 0;
                                    do {
                                        System.out.println("Logado como Aluno, escolha o que deseja fazer:\n1 - Visualizar Projetos participantes\n2 - Visualizar Atividades pendentes\n3 - Visualizar mensagens\nOutro - Sair do sistema");
                                        while (true) {
                                            try {
                                                action = scan.nextInt();
                                                scan.nextLine();
                                                break;
                                            } catch (InputMismatchException exception1) {
                                                System.out.println("Erro! Não foi digitado um número!\nInsira o numero:");
                                                scan.next();
                                            }
                                        }
                                        if (action == 1) {
                                            System.out.println("Projetos participantes: ");
                                            for (Projeto proj : coord.coord.getProjetos()) {
                                                for (Aluno alun : projeto.getAlunos()) {
                                                    if (usuario.equals(alun.getUsuario())) {
                                                        System.out.println(proj.getNome());
                                                    }
                                                }
                                            }
                                        } else if (action == 2) {
                                            System.out.println("Atividades pendentes:");
                                            for (Projeto proj : coord.coord.getProjetos()) {
                                                for (Aluno alun : projeto.getAlunos()) {
                                                    if (usuario.equals(alun.getUsuario())) {
                                                        for (Atividade atv : projeto.getAtividades()) {
                                                            System.out.println(atv.getNome());
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (action == 3) {
                                            for (Projeto proj : coord.coord.getProjetos()) {
                                                for (Aluno alun : projeto.getAlunos()) {
                                                    if (usuario.equals(alun.getUsuario())) {
                                                        System.out.println(projeto.getMensagens().toString());
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            break;
                                        }
                                    } while (true);
                                }
                            }
                        }

                    }
                } while (true);
            }
            else {
                break;
            }
        } while (true);
    }
}