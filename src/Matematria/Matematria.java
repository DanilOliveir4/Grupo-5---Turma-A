package Matematria;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Matematria {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
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
        System.out.println("Vejam só, o azarado da vez acaba de fazer sua aparição. Qual seria o nome do nosso próximo aspirante a herói?");
        System.out.print("Nome: ");
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

        System.out.println("Espero que você realize o que muitos não conseguiram, Senhor. " + nomePersonagem + " A aventura que se aproxima será verdadeiramente exaustiva, tanto física quanto mentalmente,");
        System.out.println("Parece que, desta vez, não ficarei desapontado com outro candidato. Você está pronto?");
        System.out.println("1- Acho que sim.");
        System.out.println("2- Espero corresponder as suas expectativas!");
        System.out.println("3- Obrigado mas vou dobrar e passar pro próximo.");
        int escolha1;
        do {
            System.out.println("Digite de 1 a 3 e faça sua escolha");
            escolha1 = scanner.nextInt();

            if (escolha1 < 1 || escolha1 > 3) {
                System.out.println("Digite 1, 2 ou 3, como se o destino estivesse em suas mãos... Esperava mais de você. Vamos mais uma chance.");
            }

        } while (escolha1 < 1 || escolha1 > 3);
        if (escolha1 == 1) {
            System.out.println(nomePersonagem + ": Acho que sim.");
            System.out.println("Espero que a certeza venha logo porque nao há mais volta.");
        } else if (escolha1 == 2) {
            System.out.println(nomePersonagem + ": Espero corresponder as suas expectativas!");
            System.out.println("Ótimo, tenho plena confiança de que você terá um desempenho excepcional!");
        } else if (escolha1 == 3) {
            System.out.println(nomePersonagem + ": Obrigado mas vou dobrar e passar pro próximo.");
            System.out.println("Ah, temos um com senso de humor! No entanto, a partir de agora, não haverá mais volta. Veremos se ainda encontrará tempo para piadas quando estiver preso dentro");
            System.out.println("de uma Cápsula da Matemática.");
        }
        System.out.println("Sua jornada se inicia agora, que Newton o guie em sua busca.");
        System.out.println("");
        System.out.println("**-** Capítulo 1: A Abdução Matemática **-** ");
        System.out.println("");
        System.out.println("O despertar foi abrupto e confuso. Você se encontra deitado em um ambiente estranho e futurista, cercado por paredes metálicas que emanam um brilho frio e azul. Confuso ");
        System.out.println("e desorientado, você se levanta e olha ao redor, tentando entender onde está. Nada parece familiar. Não há sinal de sua casa, cidade ou planeta Terra. Sua mente começa a girar");
        System.out.println(", e o pânico começa a se instalar. O que diabos aconteceu? É quando uma voz ressoa, vinda de algum lugar invisível. Uma voz que parece ser feita de pura matemática, clara e precisa");
        System.out.println(", mas ao mesmo tempo, estranhamente reconfortante. A voz diz: \"Bem-vindo a Matematria, visitante da Terra.\"");
        System.out.println("Após escuta-lo sua curiosidade supera o medo e determinadamente diz:");
        System.out.println("1- Quem está aí? Onde você está?");
        System.out.println("2- Onde eu estou que lugar é esse?");
        int escolha2;
        do {
            System.out.println("Digite 1 ou 2 para sua escolha.");
            escolha2 = scanner.nextInt();
            if (escolha2 < 1 || escolha2 > 2) {
                System.out.println("Ficou sem palavras, lhe darei mas um tempo para pensar.");

            }

        } while (escolha2 < 1 || escolha2 > 2);
        if (escolha2 == 1) {
            System.out.println(nomePersonagem + ": Quem está aí? Onde você está?");
            System.out.println("(A voz ressoa novamente) Não posso ser visto, sou a própria essência de Matematria. Bem-vindo a Matematria, visitante da Terra. Você é um desafio e um enigma para nós.");
        } else if (escolha2 == 2) {
            System.out.println(nomePersonagem + ": Onde eu estou que lugar é esse?");
            System.out.println("Voz de Matematria: (Com sua voz matemática e enigmática) Onde você está, visitante da Terra? Você está em Matematria, um mundo regido por equações e geometria, onde as coordenadas da realidade");
            System.out.println("são traçadas com precisão. Aqui, a percepção do espaço e do tempo é moldada pela matemática que domina nosso universo. Você agora habita um espaço interdimensional, onde desafios matemáticos");
            System.out.println("aguardam sua resolução. É aqui que sua jornada começa.");
        }
        System.out.println("A sede de sua curiosidade cresce, levando-o a perguntar novamente.");
        System.out.println("1- Mas por que estou aqui?");
        System.out.println("2- O que vocês querem de mim?");
        int escolha3;

        do {
            escolha3 = scanner.nextInt();
            if (escolha3 < 1 || escolha3 > 2) {
                System.out.println("Voz de Matematria: Não Entendi, fale novamente.");
            }
        } while (escolha3 < 1 || escolha3 > 2);

        if (escolha3 == 1 || escolha3 == 2) {
            System.out.println("Voz de Matematria: (Com calma) Você está aqui para participar de nossos desafios matemáticos. É a única maneira de retornar à Terra. Prove sua inteligência e habilidade, "
                    + "e talvez você ganhe sua liberdade.");
        }
        System.out.println("Está pronto para o início dos desafios?");
        System.out.println("1- Sim.");
        System.out.println("2- Com toda certeza!");
        System.out.println("3- Não me resta alternativa.");
        int escolha4;
        do {
            escolha4 = scanner.nextInt();
            if (escolha4 < 1 || escolha4 > 3) {
                System.out.println("Voz de Matematria: Porfavor fale novamente e com mais calma agora.");
            }
        } while (escolha4 < 1 || escolha4 > 3);
        if (escolha4 >= 1 || escolha4 <= 3) {
            System.out.println(nomePersonagem + ": Estou pronto para os desafios. O que devo fazer primeiro?");
        }
        System.out.println("Voz de Matematria: (Com satisfação) Muito bem, visitante. Siga as pistas e resolva os enigmas. Ganhe o respeito dos Matiarcs, e você encontrará aliados nesta jornada. Boa sorte.");
        System.out.println("");
        System.out.println("Antes que você tenha tempo para processar isso completamente, o chão abaixo de você começa a se mover. Uma abertura se forma, e você é rapidamente engolido");
        System.out.println("por ela. Você cai em um novo ambiente, desta vez uma sala feita de blocos flutuantes que parecem desafiar todas as leis da física.");
        System.out.println("Na parede, surgem números e equações, dançando em um balé matemático. Você percebe que está em uma sala de quebra-cabeça, uma das infames \"Cápsulas da Matemática\"");
        System.out.println("de Matematria. As paredes começam a se aproximar, e a única saída parece ser resolver o enigma matemático à sua frente. Você analisa o enigma matemático a sua frente");
        System.out.println("voando um pouco acima da sua cabeça está a seguinte equação (x^2 + 4x - 21 = 0), você percebe que conhece isso.");
        System.out.println("UMA EQUAÇÃO DE 2º GRAU");
        System.out.println("Començando a lembrar do que aprendeu parte para a resolução do problema, separando primeiro os coeficientes A: sempre acompanhado do x^2; B: sempre acompanhando do x;");
        System.out.println("e C: sempre o número que está sozinho");
        System.out.println("Voz de Matematria: (Com satisfação) Percebo que você tem um talento nato para isso.");
        System.out.println("Ao ouvir isso " + nomePersonagem + " Esboça um leve sorriso.");
        System.out.println("Voz de Matematria: Lhe darei um dica de como resolver qualquer equação de 2º grau, (Δ = b² - 4ac ,  x = - b +- √Δ / 2a) Bhaskara, (x^2 - 5x + 6 = 0 ,  x1 + x2 = 5\n"
                + "x1 * x2 = 6) Soma e produto");
        System.out.println("Voz de Matematria: Use-a com sabedoria, e você superará todos os desafios. Agora, a bola está no seu campo. Apresse-se, o tempo está se esgotando..");
        System.out.println("Com as mãos trêmulas, você começa a trabalhar na equação, tentando encontrar uma solução que permitirá que você escape desta sala misteriosa.");
        System.out.println("Horas se passam, e o suor se acumula em sua testa enquanto você luta com os números. Finalmente, uma solução surge em sua mente.");
        System.out.println("Digite a sua resposta: ");
        int escolha5;
        int escolha6;
        escolha5 = scanner.nextInt();
        escolha6 = scanner.nextInt();
        if (escolha5 == -7 && escolha6 == 3) {
            System.out.println("Com um gesto rápido, você resolve o problema matemático. As paredes se afastam, e você está livre da primeira cápsula.");
        } else {
            gameOver(); // Chame o método de "Game Over" quando o jogador errar.
            return; // Saia da função atual para evitar que o jogo continue após o erro. 
        }
        System.out.println("Respirando fundo, você percebe que esta é apenas a primeira de muitas provações que o esperam em Matematria. Os Matiarcs o observam,");
        System.out.println("sua atitude parecendo misturar curiosidade e respeito. Você percebe que precisará usar toda a sua inteligência e coragem para desvendar os");
        System.out.println("segredos deste planeta alienígena e encontrar uma maneira de voltar para casa. A jornada está apenas começando, e o enigma de Matematria está esperando para ser desvendado.");

        // Adicione mais descrições e diálogos para o Capítulo 1 aqui
        System.out.println("Capítulo 2: Aliados Inesperados");
        System.out.println("Voz de Matematria: Muito bem, você chegou ao Capítulo 2, esteja preparado!");
        System.out.println("");
        System.out.println("Neste capítulo, você continua a enfrentar desafios matemáticos em Matematria, incluindo um desafio de resolução de equações de segundo grau.");
        System.out.println("Voce está preparado?");
        System.out.println("1- Sim.");
        System.out.println("2- Não");
        int opcao1;
         do {
            opcao1 = scanner.nextInt();
             
            if (opcao1 < 1 ||  opcao1> 2) {
                System.out.println("Voz de Matematria: Porfavor fale novamente e com mais calma agora.");
            }
        
         } while (opcao1 < 1 || opcao1 > 2); { 
         System.out.println("avante");
         }
          if (  opcao1 >= 1 ||  opcao1 <= 2) {
             System.out.println("Não tem mais volta. Siga em frente HAHAHA");
         } 
         System.out.println("Enquanto você avança em Matematria, cada cápsula que enfrenta apresenta novos desafios matemáticos."); 
         System.out.println("Siga em frente e logo encontrarar uma caverna para que possa descansar");
         System.out.println(" O planeta é repleto de surpresas, e você começa a entender que resolver enigmas é a única maneira de ganhar o respeito dos Matiarcs e encontrar uma saída.");
         System.out.println();
         System.out.println( " BARAULHO DE CHUVA: shuaaaa shuaaaaa shuaaaa ");
         System.out.println("É melhor você se apressar para evitar ser atingido ");
         System.out.println("Voz de Matematria: Você chegou na caverna, pode descansar");
         System.out.println("BOOOOM!");
         System.out.println( "Fique parado ai mesmo" + nomePersonagem);
         System.out.println("Estas são as cápsulas mágicas, não deixe de abri-las.");
         System.out.println("Em uma das cápsulas, você se depara com um desafio de resolução de equações de segundo grau.");
         System.out.println("As formas flutuam no ar, e você precisa calcular ângulos e proporções para encaixá-las corretamente.");
         System.out.println("com dedicação e lógica, você domina o desafio e segue em frente.");
         System.out.println("Mão há necessidade de ficar ansioso para resolver essa equação, mas lembre-se de que Matemátria depende de você.");
         System.out.println("vamos la" + nomePersonagem + "voce já se lembra de como resolver equações de 2 grau né? é preciso de muito foco!");
         System.out.println("chegou sua hora, agora dependem de você, abra a cápsula e resolva a conta ");
         System.out.println("Fiiiiiiinnnnnuuum: Som de cápsula se abrindo");
         System.out.println(nomePersonagem + ", Resolva a seguinte equação: -x² -4x +5 = 0"); 
         System.out.println("Digite a sua resposta: ");
         int opcao2;
         int opcao3;
         opcao2 = scanner.nextInt();
         opcao3 = scanner.nextInt();
          if (opcao2 == -5 && opcao3 ==  1) {
            System.out.println(" Muito bem. Com um movimento ágil, você soluciona o problema matemático contido na cápsula e resolve o quebra-cabeça.");
        } else {
            gameOver(); // Chame o método de "Game Over" quando o jogador errar.
            return; // Saia da função atual para evitar que o jogo continue após o erro. 
        }
        System.out.println("Perceba, não foi tão complicado quanto parecia alcançar isso. parabens!");
        System.out.println("Conforme você avança, você faz uma descoberta notável. ");
        System.out.println("Alguns Matiarcs parecem mais amigáveis e dispostos a ajudar do que outros");
        System.out.println("Você vai cria laços com um grupo deles que demonstra interesse genuíno em ajudá-lo a compreender o planeta e sua cultura");
        System.out.println("Eles trocam informações sobre os obstáculos matemáticos que você precisa e fornece conselhos preciosos.");
        System.out.println("Voz de matematria: Use com sabedoria essas informações! ");
        System.out.println("Bom, chega de esperar, está na hora de conhecer os martiarcs");
        System.out.println("Martiarcs: Saudações,habitante da Terra! Estamos muito satisfeitos por fazer a sua acolhida e estamos ansiosos para contar com a sua participação em novos desafios que estão por vir.");
        System.out.println("");
        System.out.println("Martiarcs: " + nomePersonagem + " Podemos contaar com você?");
         System.out.println("1- Sim.");
         System.out.println("2- Claro");
         int opcao4;
         do {
            opcao4 = scanner.nextInt();
             
            if (opcao4 < 1 ||  opcao4> 2) {
                System.out.println("Voz de Matematria: Porfavor fale novamente e com mais calma agora.");
            }
        
         } while (opcao4 < 1 || opcao4 > 2);
          if ( escolha4 >= 1 || escolha4 <= 2) {
             System.out.println("Martiarcs: Maravilha, ficaremos felizes de ter um forte guerreiro como você ao nosso lado!");
         } 
         System.out.println("Muito bem " + nomePersonagem + " agora você não está mais sozinho");
         System.out.println(" Com a ajuda de seus novos aliados,os Matiarcs, você inicia uma jornada para desvendar a linguagem e os diferentes símbolos da Matematria.");
         System.out.println(" Essa compreensão mais profunda revela informações sobre a história do planeta e uma conspiração que ameaça tanto Matematria quanto a Terra.");
         System.out.println("----------- ---------------- ----------");
         System.out.println("A Conspiração do Tetraedron Matemático:");
         System.out.println("Dentro de Matematria, há um artefato matemático conhecido como o \"Tetraedron Matemático\".");
         System.out.println("Este tetraedro possui propriedades geométricas únicas que permitem a manipulação de equações de segundo grau em um nível cósmico");
         System.out.println("Com o Tetraedron Matemático, alguém poderia controlar não apenas a matemática em Matematria, mas também em outros planetas, dominando os princípios matemáticos subjacentes ao universo.");
         System.out.println("Uma conspiração começa quando um grupo dissidente dos Matiarcs, conhecidos como os \"Revolucionários das Equações\", descobre a existência do Tetraedron Matemático.");
         System.out.println("Eles desejam usar esse dispositivo para conquistar Matematria e, em seguida, expandir seu domínio para outros planetas através da manipulação das equações de segundo grau que governam a realidade.");
         System.out.println("");
        


       System.out.println("Maravilha, é notavel o seu desempenho para poder ajudar tudo e todos");
       System.out.println("espero que já tenha percebido que a sua jornada é mais do que apenas sobreviver");
       System.out.println("você se tornou a esperança de Matematria e da Terra. Com coragem renovada e aliados ao seu lado");
       System.out.println("você enfrenta cada novo desafio matemático com determinação, determinado a descobrir a verdade e encontrar um caminho de volta para casa.");
       System.out.println("");
       System.out.println("Vento forte com tornados que arrastou " + nomePersonagem + "para um topo da montanha");
       System.out.println("Voz de matematria: Olha só. o vento passou e acabou joganado para dentro de uma sala fechada não é facil sair de lá sem a chave necessária");
       System.out.println("sorte que no meio do caminho você fez aliados, e os martiarc irão levar para você a chave necessária para abrir a porta");
       System.out.println("Mas antes disso, é necessario resolver um novo desafio: "); 
       System.out.println("Determine o conjunto solução da equação ( x² - 4x - 96 = 0)");
       System.out.println("Digite a sua resposta: ");
       int opcao5;
       int opcao6;
       opcao5 = scanner.nextInt();
       opcao6 = scanner.nextInt();
      
          if (opcao5 == 12 &&  opcao6 == -8) {
            System.out.println(" Olha só, os Martiarcs conseguiu resolver e desbloqueou a chave necessaria para te libertar");
        } else {
            gameOver(); // Chame o método de "Game Over" quando o jogador errar.
            return; // Saia da função atual para evitar que o jogo continue após o erro. 
        }
         
        System.out.println("Fico contente por ter vocês ao meu lado. Se não fosse por vocês, ainda estaria preso. agradeço imensamente!");
        System.out.println("Martiarc: Estamos juntos agora, um pelo outro ate o fim!");
        System.out.println("Voz de Matemátria: muito bem " + nomePersonagem + "Com muita lutas e esforço, você conseguiu completetar todos os desafios");
        System.out.println("mas ainda não terminou, grandes aventuras de esperam e que você possa completar todos e sair vivo desse planeta!");
    
          // inserir o desafrio
          



        


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
        System.out.println("*-* MATEMATRIA *-*");
        System.out.println("Matematria: A abdução numérica é um jogo RPG com o intuito de instruir o player na resolução de uma equação de 2º grau, aprender matemática de uma maneira divertida e");
        System.out.println("didática, esse é o objetivo do game. É uma história de ficção científica em que um terrestre é abduzido por uma civilização alienígena, os Matiarcs, em um planeta cheio");
        System.out.println("de desafios matemáticos. Para retornar à Terra, ele deve resolver quebra-cabeças matemáticos complexos, ganhando o respeito dos Matiarcs e desvendando segredos");
        System.out.println("que ameaçam ambos os mundos. A trama combina elementos de aventura, amizade e mistério, enquanto os personagens enfrentam enigmas intelectuais que testam suas");
        System.out.println("habilidades e determinação.");

    }

    public static void exibeCreditos() {
        System.out.println("Desenvolvedores: Daniel Branco de Oliveira Filho; Jhowsemir Fernandes; José. ");

    }

    public static void gameOver() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game Over. Você falhou no desafio.");
        System.out.println("Opções:");
        System.out.println("1. Voltar ao menu principal");
        System.out.println("2. Reiniciar o jogo");
        System.out.print("Escolha uma opção: ");

        int escolhaGameOver = scanner.nextInt();

        if (escolhaGameOver == 1) {
            // Implemente a lógica para voltar ao menu principal.
            mainMenu(); // Suponhamos que você tenha um método mainMenu() para isso.
        } else if (escolhaGameOver == 2) {
            // Implemente a lógica para reiniciar o jogo.
            iniciaJogo(); // Suponhamos que você tenha um método iniciaJogo() para isso.
        } else {
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }

    }
}
