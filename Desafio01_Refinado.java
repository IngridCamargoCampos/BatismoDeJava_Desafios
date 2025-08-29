package DesafiosBatismo;

import java.util.Scanner;

public class Desafio01_Refinado {
    public static void main(String[] args) {
        // Ninjas com Input e If-Else + (aprender lista n For-While)
        Scanner caixaDeTexto = new Scanner(System.in); // abre a caixa e permite input

        System.out.println("Escreva aqui o nome de seu Ninja: ");
        String nomeNinja1 = caixaDeTexto.nextLine(); // input Nome

        System.out.println("Escreva a idade de seu Ninja: ");
        int idadeNinja1 = caixaDeTexto.nextInt();
        System.out.println("O ninja " +nomeNinja1+ " tem " + idadeNinja1 + " anos de idade");

        // Missões Conf. >>>>>
        System.out.println("Escolha uma das missões a seguir, lembrando de seguir os pré-requisitos de idade, para seu Ninja: ");
        System.out.println(" [1] Ajude Dna.Thereza ao mercado e suas compras. Requisito: Nenhum ");
        System.out.println(" [2] Encontre o Bandido de Jóias. Requisito: +15 anos");
        System.out.println(" [3] Neutralize o Monstro da Floresta. Requisito: +18 anos");

        int missaoEscolhida = caixaDeTexto.nextInt();
        System.out.println("Você digitou o número: " + missaoEscolhida);

        //-------------------------------------------------------------------------------//
        // Switch Cases + If-Else Conf. + AND >>>>>
        switch (missaoEscolhida){
            case 1:
                System.out.println("A missão 1, foi designada ao Ninja " +nomeNinja1);
                break;
            case 2:
                if (idadeNinja1 >= 15){
                    System.out.println("A missão 2, foi designada ao Ninja " +nomeNinja1);
                } else {
                    System.out.println("Inválido!! O ninja " +nomeNinja1+ " somente tem " +idadeNinja1+ " anos, não cumprindo o pré-requisito de +15 anos dessa missão");
                    System.out.println("Para essa idade o ninja " +nomeNinja1+ " somente pode realizar a missão 1");
                }
                break;
            case 3:
                if (idadeNinja1 >= 18) {
                    System.out.println("A missão 3, foi designada ao Ninja " +nomeNinja1);
                } else if (idadeNinja1 < 18 && idadeNinja1 >= 15) {
                    System.out.println(" Inválido!! O ninja " +nomeNinja1+ " somente tem " +idadeNinja1+ " anos, não cumprindo o pré-requisito de +18 anos dessa missão");
                    System.out.println("Para essa idade o Ninja " +nomeNinja1+ " poderá realizar as missões 1 e 2 ");
                    
                } else {
                    System.out.println(" Inválido!! O ninja " +nomeNinja1+ " somente tem " +idadeNinja1+ " anos, não cumprindo o pré-requisito de +18 anos dessa missão");
                    System.out.println("Para essa idade o ninja " +nomeNinja1+ " somente pode realizar a missão 1");
                }
                break;
            default:
                System.out.println("Erro!!! Opção Inválida");
        }


        caixaDeTexto.close();
        //SEMPRE FECHE O SCANNER
    }
}
