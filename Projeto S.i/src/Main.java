import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lista de projetos
        ArrayList<Projeto> projetos = new ArrayList<>();

        // Lista de colaboradores
        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== SISTEMA DE GESTÃO DE PROJETOS =====");
            System.out.println("1 - Cadastrar Projeto");
            System.out.println("2 - Listar Projetos");
            System.out.println("3 - Cadastrar Colaborador");
            System.out.println("4 - Listar Colaboradores");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    // Cadastro de projeto
                    System.out.print("Digite o nome do projeto: ");
                    String nomeProjeto = sc.nextLine();

                    System.out.print("Digite o prazo do projeto: ");
                    String prazoProjeto = sc.nextLine();

                    Projeto projeto = new Projeto(nomeProjeto, prazoProjeto);

                    projetos.add(projeto);

                    System.out.println("Projeto cadastrado com sucesso!");

                    break;

                case 2:

                    // Listagem de projetos
                    System.out.println("\n===== LISTA DE PROJETOS =====");

                    if (projetos.isEmpty()) {

                        System.out.println("Nenhum projeto cadastrado.");

                    } else {

                        for (Projeto p : projetos) {

                            System.out.println(p);

                        }

                    }

                    break;

                case 3:

                    // Cadastro de colaborador
                    System.out.print("Digite o nome do colaborador: ");
                    String nomeColaborador = sc.nextLine();

                    System.out.print("Digite a função do colaborador: ");
                    String funcaoColaborador = sc.nextLine();

                    Colaborador colaborador =
                            new Colaborador(nomeColaborador, funcaoColaborador);

                    colaboradores.add(colaborador);

                    System.out.println("Colaborador cadastrado com sucesso!");

                    break;

                case 4:

                    // Listagem de colaboradores
                    System.out.println("\n===== LISTA DE COLABORADORES =====");

                    if (colaboradores.isEmpty()) {

                        System.out.println("Nenhum colaborador cadastrado.");

                    } else {

                        for (Colaborador c : colaboradores) {

                            System.out.println(
                                    "Nome: " + c.getNome()
                                            + " | Função: " + c.getFuncao()
                            );

                        }

                    }

                    break;

                case 5:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        } while (opcao != 5);

        sc.close();

    }

}