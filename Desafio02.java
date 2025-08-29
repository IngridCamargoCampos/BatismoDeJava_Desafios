package DesafiosBatismo;

import java.util.Scanner;

public class Desafio02_DeNovo {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Selecione um dos números abaixo para, cadastrar novos ninjas, exibir lista dos ninjas cadastrados, ou encerrar o programa");
           System.out.println("\n===== Menu Ninja Principal =====");
           System.out.println("[ 1 ] Cadastrar Ninja");
           System.out.println("[ 2 ] Listar Ninjas");
           System.out.println("[ 3 ] Sair");
           System.out.println(" Escolha uma das opções acima: ");

        int escolhaDoUser = caixaDeTexto.nextInt();
        System.out.println("Você digitou o número: " +escolhaDoUser);

        //Reação da Var escolhida
        switch (escolhaDoUser) {
            case 1: //cadastro de ninja
                System.out.println("Perfeito, vamos Cadastrar seu Ninja!");
                System.out.println("\n===== Menu Ninja de Cadastro =====");
                System.out.println("[ 1 ] Para acessar formulário de cadastro");
                System.out.println("[ 2 ] Voltar ao Menu Principal");

                int varCadastroPage = caixaDeTexto.nextInt();
                System.out.println("Você digitou o número: " +varCadastroPage);

                    // Resultado
                    if (varCadastroPage == 1) { // CONCERTAR BUG DAS VARS JUNTAS NO PRINT

                        caixaDeTexto.nextLine(); // ← LIMPA o buffer (remove o ENTER que sobrou)

                        System.out.println("Escreva o nome de seu Ninja: ");
                        String nomeDoNinja = caixaDeTexto.nextLine(); // ← Agora funciona!
                        System.out.println("Nome cadastrado: "+nomeDoNinja);
                        // Nome          Revisar acima Não Entendi


                        System.out.println("Agora escreva sua idade: ");
                        int idadeDoNinja = caixaDeTexto.nextInt();
                        System.out.println("Idade cadastrada: "+idadeDoNinja);
                        // Idade


                        caixaDeTexto.nextLine();

                        System.out.println("Escreva o nome de sua Vila: ");
                        String vilaDoNinja = caixaDeTexto.nextLine();
                        System.out.print("Vila selecionada: "+vilaDoNinja);
                        // Vila

                        System.out.println("---Detalhes do Cadastro---"); // Colocar um ESPAÇO entre SOUT Vila e SOUT Cadastro
                        System.out.println("Nome do Ninja: "+nomeDoNinja);
                        System.out.println("Idade do Ninja: "+idadeDoNinja);
                        System.out.println("O Ninja "+nomeDoNinja+ "é da Vila "+vilaDoNinja+"!");

                        System.out.println("Bem vindo "+nomeDoNinja+"!");
                        //Conclusão

                    } else if (varCadastroPage == 2) {
                        System.out.println("Carregando para o Menu Principal...");
                        // VOLTAR AO MENU PRINCIPAL aprender
                    } else {
                        System.out.println("Opção incorreta, tente novamente os números acima!");
                    }
                break;
            /* case 2:
                // Listar Ninjas
                break;
            case 3:
                System.out.println("Sistema encerrado");
                break;
            default:
                System.out.println("Resposta invalida, tente novamente selecionando um número de de 1 a 3");
   */   }


        caixaDeTexto.close();
    }
}
