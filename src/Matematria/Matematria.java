package Matematria;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Matematria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolhaMenu;

        do {
            System.out.println("Bem-vindo ao Jogo RPG Matematria!");
            System.out.println("1. Jogar");
            System.out.println("2. Informações");
            System.out.println("3. Créditos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção (1/2/3/4): ");
            escolhaMenu = scanner.nextInt();

            if (escolhaMenu == 1) {
                iniciaJogo();
            } else if (escolhaMenu == 2) {
                exibeInformacoes();
            } else if (escolhaMenu == 3) {
                exibeCreditos();
            } else if (escolhaMenu == 4) {
                System.out.println("Obrigado por jogar!");
                System.exit(0);
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (escolhaMenu != 4);
    }

    public static void iniciaJogo() {
        Scanner scanner = new Scanner(System.in);
        String nomePersonagem;
        System.out.println("Qual o seu nome ?");
        nomePersonagem = scanner.nextLine();

        ArrayList<String> eventosAleatorios = new ArrayList<>();
        eventosAleatorios.add("Evento Aleatório 1");
        eventosAleatorios.add("Evento Aleatório 2");
        eventosAleatorios.add("Evento Aleatório 3");
        eventosAleatorios.add("Evento Aleatório 4");
        eventosAleatorios.add("Evento Aleatório 5");
        eventosAleatorios.add("Evento Aleatório 6");
        eventosAleatorios.add("Evento Aleatório 7");
        eventosAleatorios.add("Evento Aleatório 8");
        eventosAleatorios.add("Evento Aleatório 9");
        eventosAleatorios.add("Evento Aleatório 10");

        Random random = new Random();

        String eventoAleatorioEscolhido1 = eventosAleatorios.get(random.nextInt(eventosAleatorios.size()));

        String eventoAleatorioEscolhido2;
        do {
            eventoAleatorioEscolhido2 = eventosAleatorios.get(random.nextInt(eventosAleatorios.size()));
        } while (eventoAleatorioEscolhido2.equals(eventoAleatorioEscolhido1));

        String eventoAleatorioEscolhido3;
        do {
            eventoAleatorioEscolhido3 = eventosAleatorios.get(random.nextInt(eventosAleatorios.size()));
        } while (eventoAleatorioEscolhido3.equals(eventoAleatorioEscolhido1) || eventoAleatorioEscolhido3.equals(eventoAleatorioEscolhido2));

        System.out.println("Capítulo 1: A Abdução Matemática - " + eventoAleatorioEscolhido1);
        System.out.println("Próximo desafio - " + eventoAleatorioEscolhido2);
        System.out.println("Outro evento - " + eventoAleatorioEscolhido3);

        System.out.println("Você resolveu o primeiro desafio matemático e escapou da Cápsula.");
        // Adicione mais descrições e diálogos para o Capítulo 1 aqui

        System.out.println("Capítulo 2: Aliados Inesperados");
        // Adicione descrições e diálogos para o Capítulo 2 aqui

        System.out.println("Capítulo 3: A Busca pela Verdade");
        // Adicione descrições e diálogos para o Capítulo 3 aqui

        System.out.println("Capítulo 4: A Batalha pela Verdade");
        // Adicione descrições e diálogos para o Capítulo 4 aqui

        System.out.println("Escolha o destino do personagem: ");
        System.out.println("1. Voltar para a Terra");
        System.out.println("2. Ficar em Matematria");
        int escolhaFinal = scanner.nextInt();

        if (escolhaFinal == 1) {
            System.out.println("Você decide voltar para casa, deixando Matematria.");
            // Adicione mais descrições e diálogos para o final "Voltando para a Terra" aqui
        } else if (escolhaFinal == 2) {
            System.out.println("Você decide ficar em Matematria com seus aliados Matiarcs.");
            // Adicione mais descrições e diálogos para o final "Ficar em Matematria" aqui
        }

        System.out.println("Fim do jogo. Obrigado por jogar!");
    
    }

    public static void exibeInformacoes() {
        System.out.println("Informações do Jogo RPG Matematria:");
        // Adicione informações sobre o jogo aqui
    }

    public static void exibeCreditos() {
        System.out.println("Créditos do Jogo RPG Matematria:");
        // Adicione os créditos do jogo aqui
    }
}
