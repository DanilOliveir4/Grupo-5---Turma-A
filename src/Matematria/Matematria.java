package Matematria;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Matematria {

    public static String nomePersonagem;

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
        capitulo1();
        capitulo2();
        capitulo3();
        capitulo4();
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
        System.out.println("""
                            ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################
                           ##################@@@@@@@@@@@@@@@@@@@@######@@@@@@@@@@@@######@@@@@@@@####@@@@@@@@##@@@@@@@@@@@@@@@@@@@@@@##############
                           ################@@@@                @@##@@@@@@        @@@@@@##@@    @@@@@@@@mm  @@##@@@@                @@##############
                           ################@@  mmmmmmmmmmmmmmmm@@##@@    mmmmmmmm    @@##@@      @@@@      @@##@@@@  mmmmmmmmmmmmmm@@##############
                           ################@@  @@@@@@@@@@@@@@@@@@##@@    @@@@@@@@    @@##@@      @@@@      @@##@@@@  @@############################
                           ################@@  @@####@@        @@##@@                @@##@@    @@    @@mm  @@##@@@@  @@@@@@@@@@@@@@@@##############
                           ################@@  @@####@@        @@##@@                @@##@@    @@    @@mm  @@##@@@@                @@##############
                           ################@@  @@####@@@@@@    @@##@@    @@@@@@@@    @@##@@    @@@@@@@@mm  @@##@@@@  @@@@@@@@@@@@@@@@##############
                           ################@@  @@########@@    @@##@@    @@####@@    @@##@@    @@####@@mm  @@##@@@@  @@############################
                           ################@@  @@@@@@@@@@@@    @@##@@    @@####@@    @@##@@    @@####@@mm  @@##@@@@  @@@@@@@@@@@@@@@@##############
                           ################@@@@            @@@@@@##@@    @@####@@    @@##@@    @@####@@mm  @@##@@@@                @@##############
                           ##################@@@@@@@@@@@@@@@@######@@@@@@@@####@@@@@@@@##@@@@@@@@####@@@@@@@@##@@@@@@@@@@@@@@@@@@@@@@##############
                           ########################################################################################################################
                           ########################################################################################################################
                           ##################@@@@@@@@@@@@@@@@######@@@@@@@@####@@@@@@@@##@@@@@@@@@@@@@@@@@@@@##@@@@@@@@@@@@@@@@@@##################
                           ################@@@@            @@@@@@##@@    @@####@@    @@##@@                @@##@@              @@@@@@##############
                           ################MM  @@@@@@@@@@@@    @@##@@    @@####@@    @@##@@    @@@@@@@@@@@@@@##@@    @@@@@@@@@@    @@##############
                           ################MM  @@########@@    @@##@@    @@####@@    @@##@@    @@@@@@##########@@    @@@@@@@@@@    @@##############
                           ################MM  @@########@@    @@##@@    @@@@@@@@    @@##@@        @@##########@@              @@@@@@##############
                           ################MM  @@########@@    @@##@@@@@@  @@@@  @@@@@@##@@    ++++@@##########@@    ++++++  ++@@##################
                           ################MM  @@########@@    @@######@@  @@@@  @@######@@    @@##############@@    @@##@@  @@@@@@################
                           ################MM  @@########@@    @@######@@@@    @@@@######@@    @@##############@@    @@##@@@@    @@################
                           ################MM  @@@@@@@@@@@@    @@########@@    @@########@@    @@@@@@@@@@@@@@##@@    @@####@@    @@@@##############
                           ################@@@@            @@@@@@########@@    @@########@@                @@##@@    @@####@@@@@@  @@##############
                           ##################@@@@@@@@@@@@@@@@############@@@@@@@@########@@@@@@@@@@@@@@@@@@@@##@@@@@@@@########@@@@@@##############
                           ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################
                           ########################################################################################################################""");
        System.out.println("");
        System.out.println("Game Over. Você falhou no desafio.");
        System.out.println("Opções:");
        System.out.println("1. Voltar ao menu principal");
        System.out.println("2. Reiniciar o jogo");
        System.out.print("Escolha uma opção: ");

        int escolhaGameOver = scanner.nextInt();

        if (escolhaGameOver == 1) {

            mainMenu();
        } else if (escolhaGameOver == 2) {

            iniciaJogo();
        } else {
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }

    }

    public static void capitulo1() {
        Scanner scanner = new Scanner(System.in);
        nomePersonagem = obterNomeDoUsuario();
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

                System.out.println("Voz de Matematria: Por favor fale novamente e com mais calma agora.");

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
        double resposta1;
        double resposta2;
        System.out.print("x' = ");
        resposta1 = scanner.nextDouble();
        System.out.print("x'' = ");
        resposta2 = scanner.nextDouble();
        if (resposta1 == -7 && resposta2 == 3) {
            System.out.println("Com um gesto rápido, você resolve o problema matemático. As paredes se afastam, e você está livre da primeira cápsula.");
        } else if (resposta1 == 3 && resposta2 == -7) {
            System.out.println("Com um gesto rápido, você resolve o problema matemático. As paredes se afastam, e você está livre da primeira cápsula.");
        } else {
            gameOver();
            return;
        }
        System.out.println("Respirando fundo, você percebe que esta é apenas a primeira de muitas provações que o esperam em Matematria. Os Matiarcs o observam,");
        System.out.println("sua atitude parecendo misturar curiosidade e respeito. Você percebe que precisará usar toda a sua inteligência e coragem para desvendar os");
        System.out.println("segredos deste planeta alienígena e encontrar uma maneira de voltar para casa. A jornada está apenas começando, e o enigma de Matematria está esperando para ser desvendado.");

    }

    public static void capitulo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("**-** Capítulo 2: Aliados Inesperados **-**");

        System.out.println("Voz de Matematria: Muito bem, você chegou ao Capítulo 2, esteja preparado!");
        System.out.println("");
        System.out.println("Neste capítulo, você continua a enfrentar desafios matemáticos em Matematria, incluindo um desafio de resolução de equações de segundo grau.");
        System.out.println("Voce está preparado?");
        System.out.println("1- Sim.");
        System.out.println("2- Não");
        int opcao1;
        do {
            opcao1 = scanner.nextInt();

            if (opcao1 < 1 || opcao1 > 2) {
                System.out.println("Voz de Matematria: Porfavor fale novamente e com mais calma agora.");
            }

        } while (opcao1 < 1 || opcao1 > 2);
        {
            System.out.println("avante");
        }
        if (opcao1 == 1 || opcao1 == 2) {
            System.out.println("Não tem mais volta. Siga em frente HAHAHA");
        }
        System.out.println("Enquanto você avança em Matematria, cada cápsula que enfrenta apresenta novos desafios matemáticos.");
        System.out.println("Siga em frente e logo encontrarar uma caverna para que possa descansar");
        System.out.println(" O planeta é repleto de surpresas, e você começa a entender que resolver enigmas é a única maneira de ganhar o respeito dos Matiarcs e encontrar uma saída.");
        System.out.println();
        System.out.println(" BARAULHO DE CHUVA: shuaaaa shuaaaaa shuaaaa ");
        System.out.println("É melhor você se apressar para evitar ser atingido ");
        System.out.println("Voz de Matematria: Você chegou na caverna, pode descansar");
        System.out.println("BOOOOM!");
        System.out.println("Fique parado ai mesmo" + nomePersonagem);
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
        double opcao2;
        double opcao3;
        System.out.print("x' = ");
        opcao2 = scanner.nextDouble();
        System.out.print("x'' = ");
        opcao3 = scanner.nextDouble();
        if ((opcao2 == -5 && opcao3 == 1) || (opcao2 == 1 && opcao3 == -5)) {
            System.out.println(" Muito bem. Com um movimento ágil, você soluciona o problema matemático contido na cápsula e resolve o quebra-cabeça.");
        } else {
            gameOver();
            return;
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

            if (opcao4 < 1 || opcao4 > 2) {
                System.out.println("Voz de Matematria: Porfavor fale novamente e com mais calma agora.");
            }

        } while (opcao4 < 1 || opcao4 > 2);
        if (opcao4 == 1 || opcao4 == 2) {
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
        System.out.println("Determine o conjunto solução da equação ( x^2 - 4x - 96 = 0)");
        System.out.println("Digite a sua resposta: ");
        double opcao5;
        double opcao6;
        System.out.print("x' = ");
        opcao5 = scanner.nextDouble();
        System.out.print("x'' = ");
        opcao6 = scanner.nextDouble();

        if ((opcao5 == 12 && opcao6 == -8) || (opcao5 == -8 && opcao6 == 12)) {
            System.out.println(" Os Martiarcs conseguiram resolver e desbloquearam a chave necessária para a sua libertação.");
        } else {
            gameOver();
            return;
        }

        System.out.println("Fico contente por ter vocês ao meu lado. Se não fosse por vocês, ainda estaria preso. agradeço imensamente!");
        System.out.println("Martiarc: Estamos juntos agora, um pelo outro ate o fim!");
        System.out.println("Voz de Matemátria: muito bem " + nomePersonagem + "Com muita lutas e esforço, você conseguiu completetar todos os desafios");
        System.out.println("mas ainda não terminou, grandes aventuras te esperam e que você possa completar todos e sair vivo desse planeta!");

    }

    public static void capitulo3() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> eventosAleatorios = new ArrayList<>();
        eventosAleatorios.add("– 3x^2 + 18x - 15 = 0");
        eventosAleatorios.add("– 2x^2 + 3x + 5 = 0");
        eventosAleatorios.add("x^2 + 4x - 5 = 0");
        eventosAleatorios.add("x^2 - x - 6 = 0 ");
        eventosAleatorios.add("2x^2 - 8 = 0");

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
        System.out.println("");
        System.out.println("**-** Capítulo 3: A Busca pela Verdade **-**");
        System.out.println("À medida que você e seus aliados Matiarcs continuam a decifrar os segredos de Matematria, vocês começam a perceber que a conspiração que ameaça tanto Matematria");
        System.out.println("quanto a Terra é mais complexa do que imaginavam. Pistas levam vocês a explorar áreas ainda mais desafiadoras do planeta, cada uma delas cheia de enigmas matemáticos");
        System.out.println("únicos. Com sua coragem renovada e os conhecimentos recém-adquiridos, vocês partem em busca da verdade.");
        System.out.println("Matiarcs: precisamos procurar pela chave é a única maneira de continuarmos nossa jornada.");
        System.out.println("1. Para que serve essa chave e por que precisamos dela tão desesperadamente?");
        System.out.println("2. (em tom sarcástico) Ah, maravilha, mais uma visita às encantadoras \"salinhas da morte\"! D::");
        System.out.println("3. (com confiança) Tudo bem já estava ficando cansado de esperar tanto.");
        int escolha5;
        do {
            escolha5 = scanner.nextInt();
            if (escolha5 < 1 || escolha5 > 3) {
                System.out.println("Matiarcs: Não Entendi, fale novamente.");
            }
        } while (escolha5 < 1 || escolha5 > 3);
        if (escolha5 == 1) {
            System.out.println("Matiarcs: (com ironia) Incrível como até mesmo na Terra não conseguimos encontrar chaves, não é?");
            System.out.println(nomePersonagem + ": HAHAHA muito engrançado");
            System.out.println("Matiarcs: Então, pelo visto, você está bem familiarizado com o conceito de chave (RSRS). Pois bem, estamos em busca de uma chave específica, pois somente ela tem o");
            System.out.println("poder de destrancar a passagem crucial que precisamos atravessar.");
        } else if (escolha5 == 2) {
            System.out.println("Matiarcs: Aprecio o seu entusiasmo, terráqueo.");
            System.out.println(nomePersonagem + ": Então aqui em Matematria nao existe sarcasmo? (risada sem graça)");
            System.out.println("Matiarcs: Bem, em Matematria, o sarcasmo é meio que \"dividir por zero\" em termos de ironia, se é que você me entende. (risada sem graça)");
        } else if (escolha5 == 3) {
            System.out.println("Matiarcs: Esse é o espirito!");
        }
        System.out.println("Matiarcs: Então estamos conversados vamos em busca da chave.");
        System.out.println("Matiarcs: Nós de Matematria crescemos ouvindo uma lenda, nessa lenda um forasteiro vindo de outro mundo chega para desvendar os mistérios de Matematria e, assim,");
        System.out.println("salvar ambos os planetas. Acreditem ou não, parece que essa profecia está se concretizando diante de nossos olhos. E acreditamos fortemente que você " + nomePersonagem + " é o forasteiroda lenda.");
        System.out.println("1. 0 pressão eu diria.");
        System.out.println("2. incrivel, ja posso voltar pra casa?");
        System.out.println("3. espero que essa lenda termine com o forasteiro inteiro e vivo.");
        int escolha6;
        do {
            escolha6 = scanner.nextInt();
            if (escolha6 < 1 || escolha6 > 3) {
                System.out.println("Matiarcs: Como assim? não entendi. ");
            }
        } while (escolha6 < 1 || escolha6 > 3);
        switch (escolha6) {
            case 1 ->
                System.out.println("Matiarcs: (com ironia) Entusiasmado com sempre.");
            case 2 ->
                System.out.println("Matiarcs: Mesmo após algumas cápsulas de matemática, você ainda mantém seu senso de humor. Admirável.");
            case 3 ->
                System.out.println("Matiarcs: Não é só o forasteiro que deseja ficar íntegro, nós também compartilhamos desse desejo.");
            default -> {
            }
        }
        System.out.println("Matiarcs: De acordo com a profecia, a chave está escondida em uma misteriosa caverna cheia de quebra-cabeças matemáticos. E, para sua surpresa, " + nomePersonagem + ",");
        System.out.println("você terá que superar mais desafios matemáticos para prosseguirmos.");
        System.out.println("1. (com sarcasmo)Isso é novidade para mim.");
        System.out.println("2. Vocês não poderiam dar uma ajudinha?");
        int escolha7;
        do {
            escolha7 = scanner.nextInt();
            if (escolha7 < 1 || escolha7 > 2) {
                System.out.println("Não consegui entender " + nomePersonagem + ", poderia repetir?");
            }
        } while (escolha7 < 1 || escolha7 > 2);
        if (escolha7 == 1 || escolha7 == 2) {
            System.out.println("Matiarcs: Você deve ter percebido que temos sim conhecimentos matemáticos, mas nao podemos interferir na sua jornada, pelo menos não até o momento atual.");
        }
        System.out.println("Junto com seus leais aliados Matiarcs, vocês exploram a caverna da profecia, mergulhando cada vez mais fundo nos segredos de Matematria. À medida que avançam,");
        System.out.println("descobrem pistas que indicam a existência de um local sagrado chamado \"O Refúgio da Sabedoria\".");
        System.out.println("Acredita-se que seja o epicentro do conhecimento matemático em Matematria, bem como o epicentro dos planos da conspiração.");
        System.out.println("Após explorar ainda mais a caverna, vocês se deparam com um canto isolado e decidem entrar. No entanto, no momento em que vocês entram, pedras caem abruptamente, selando a entrada atrás de vocês.");
        System.out.println("A busca por uma saída é a única opção e, após um tempo, vocês encontram uma equação (2x^2 - 32 = 0). Assim que a equação é descoberta, o chão ao redor começa a desmoronar e,");
        System.out.println("ao longe, um grito ecoa: \"Areia Movediça!\". A urgência de resolver a equação torna-se iminente.");
        System.out.println("Qual a resposta da equação?");
        double resposta3;
        double resposta4;
        System.out.print("x' = ");
        resposta3 = scanner.nextDouble();
        System.out.print("x'' = ");
        resposta4 = scanner.nextDouble();
        if (resposta3 == 4 && resposta4 == -4) {
            System.out.println(nomePersonagem + " Rapidamente pega uma pedra e rabisca ao lado da equação a resposta!");
        } else if (resposta3 == -4 && resposta4 == 4) {
            System.out.println(nomePersonagem + " Rapidamente pega uma pedra e rabisca ao lado da equação a resposta!");
        } else {
            System.out.println("Nada acontece, o tempo se passa e a areia engole você e os seus aliados.");
            gameOver();
            return;
        }
        System.out.println("Entretanto, o chão abaixo de você continua a se transformar em areia movediça quando outro Matiarc grita: \"Encontrei outra equação!\"");
        System.out.println("1. Você decide arriscar tudo para salvar a si mesmo e a todos.");
        System.out.println("2. O medo paralisa você e todos acabam perecendo.");
        int escolha8;
        do {
            System.out.print("Faça sua escolha: ");
            escolha8 = scanner.nextInt();
            if (escolha8 < 1 || escolha8 > 2) {
                System.out.println("Escolha novamente, e se apresse!");
            }
        } while (escolha8 < 1 || escolha8 > 2);
        if (escolha8 == 1) {
            System.out.println("Com coragem e determinação, você atravessa a sala, ciente dos riscos, e se prepara para enfrentar o desafio de resolver a equação.");
        } else if (escolha8 == 2) {
            System.out.println("Todos morrem sua jornada acaba aqui.");
            gameOver();
            return;
        }
        System.out.println("Você se depara com a seguinte equação: " + eventoAleatorioEscolhido1 + ". O tempo está se esgotando, exige uma resolução rápida e a esperança de ser o último a ser resolvido.");
        System.out.println("Mais uma vez, com uma pedra em mãos, você rabisca sua resposta ao lado do enigma matemático:");
        System.out.print("x' = ");
        double resposta5 = scanner.nextDouble();
        System.out.print("x'' = ");
        double resposta6 = scanner.nextDouble();
        switch (eventoAleatorioEscolhido1) {
            case "- 3x^2 + 18x - 15 = 0":
                double solucao1Evento1 = 1;
                double solucao2Evento1 = 5;
                if ((resposta5 == solucao1Evento1 && resposta6 == solucao2Evento1) || (resposta5 == solucao2Evento1 && resposta6 == solucao1Evento1)) {
                    System.out.println("Parabéns! Você salvou a todos, incluindo a si mesmo.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "- 2x^2 + 3x + 5 = 0":
                double solucao1Evento2 = -1;
                double solucao2Evento2 = 2.5;
                if ((resposta5 == solucao1Evento2 && resposta6 == solucao2Evento2) || (resposta5 == solucao2Evento2 && resposta6 == solucao1Evento2)) {
                    System.out.println("Parabéns! Você salvou a todos, incluindo a si mesmo.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 + 4x - 5 = 0":
                double solucao1Evento3 = 1;
                double solucao2Evento3 = -5;
                if ((resposta5 == solucao1Evento3 && resposta6 == solucao2Evento3) || (resposta5 == solucao2Evento3 && resposta6 == solucao1Evento3)) {
                    System.out.println("Parabéns! Você salvou a todos, incluindo a si mesmo.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 - x - 6 = 0 ":
                double solucao1Evento4 = 3;
                double solucao2Evento4 = -2;
                if ((resposta5 == solucao1Evento4 && resposta6 == solucao2Evento4) || (resposta5 == solucao2Evento4 && resposta6 == solucao1Evento4)) {
                    System.out.println("Parabéns! Você salvou a todos, incluindo a si mesmo.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "2x^2 - 8 = 0":
                double solucao1Evento5 = 3;
                double solucao2Evento5 = -2;
                if ((resposta5 == solucao1Evento5 && resposta6 == solucao2Evento5) || (resposta5 == solucao2Evento5 && resposta6 == solucao1Evento5)) {
                    System.out.println("Parabéns! Você salvou a todos, incluindo a si mesmo.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
        }
        System.out.println("Após resolver o último enigma, uma caixa emerge da antiga areia movediça, agora inofensiva. Sem hesitar, você a abre e encontra a chave necessária para acessar o Refúgio da Sabedoria.");
        System.out.println("Com a chave em mãos, você finalmente abre a passagem para o Refúgio da Sabedoria. Entretanto, o que vocês encontram dentro é além da imaginação. A verdade por trás da conspiração");
        System.out.println("é revelada, e o destino de Matematria e da Terra está à beira do abismo. Agora, cabe a você, o forasteiro da Terra, e seus aliados Matiarcs enfrentarem a conspiração,");
        System.out.println("desvendarem o último enigma matemático e salvar ambos os mundos. Com coragem e determinação, vocês se preparam para o confronto final, sabendo que o destino de");
        System.out.println("salvar ambos os mundos. Com coragem e determinação, vocês se preparam para o confronto final,");
        System.out.println("Matematria e da Terra depende do sucesso de sua missão. A batalha pela verdade e pela salvação começa agora!");
    }

    public static void capitulo4() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> eventosAleatorios = new ArrayList<>();
        eventosAleatorios.add("x2 - 5x - 14 = 0");
        eventosAleatorios.add("x^2 - 12x + 20 = 0");
        eventosAleatorios.add("x^2 + 9x + 20 = 0");
        eventosAleatorios.add("-x^2 + 3x = 0");
        eventosAleatorios.add("x^2 - 3x = 2x");

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
        System.out.println("");
        System.out.println("Capítulo 4: A Batalha pela Verdade");
        // Adicione descrições e diálogos para o Capítulo 4 aqui
        System.out.println("No Refúgio da Sabedoria, o epicentro do conhecimento matemático de Matematria, você e seus aliados Matiarcs enfrentam a conspiração");
        System.out.println("que ameaça tanto Matematria quanto a Terra. No entanto, o confronto final está longe de ser uma tarefa simples, pois os inimigos que guardam");
        System.out.println("os segredos do Refúgio estão preparados para tudo.");
        System.out.println("Matiarcs: Certo chegamos ao que achamos ser a batalha derradeira, muito provavelmente por de tras dessa porta está o nosso objetivo final");
        System.out.println("Matiarcs: o que faremos " + nomePersonagem + "?");
        System.out.println("1 - " + nomePersonagem + ": acho que um carteado cairia bem neste momento");
        System.out.println("2 - " + nomePersonagem + ": sinceramente gostaria de nao ter que ficar com essa escolha D:");
        System.out.println("3 - " + nomePersonagem + ": o que estamos esperando? vamos entrar e dar uma surra de lógica neles!");
        int escolha1;
        do {
            escolha1 = scanner.nextInt();
            if (escolha1 < 1 || escolha1 > 3) {
                System.out.println("Matiarcs: Como assim? não entendi. ");
            }
        } while (escolha1 < 1 || escolha1 > 3);
        if (escolha1 == 1) {
            System.out.println("Matiarcs: Sempre com piadinhas. Infezlimente não temos tempo pra isso mas eu tambem adoraria gritar um troco nessa sua orelha estranha de terraqueo.");
        } else if (escolha1 == 2) {
            System.out.println("Matiarcs: tá ai algo em que concordamos deixar nossas vidas em suas mãos nao é nada reconfortante");
        } else if (escolha1 == 3) {
            System.out.println("Matiarcs: Gosto quando demonstra confiança.");
        }
        System.out.println("Matiarcs: " + nomePersonagem + " prepare - se estamos indo de encontro com a batalha final");
        System.out.println("Após adentrar a porta vocês se deparam com uma sala impressionante do Refúgio da Sabedoria, e nao demorou nem um segundo para que a verdadeira raiz dos problemas");
        System.out.println("de Matematria e da Terra desse as caras, e para seu espanto eles se pareciam com seus novos aliados os Matiarcs!");
        System.out.println("A partir de agora nao tem mais volta é vencer ou vencer,vocês confrontam os responsáveis pela conspiração.");
        System.out.println("Eles se revelam como uma facção dissidente dos Matiarcs, que desejam usar seu conhecimento matemático avançado para dominar outros planetas, incluindo a Terra.");
        System.out.println("Matiarcs: Não estou entendendo o que está acontecendo aqui, voces VOCES sao nossos iguais porque tentar destruir sua própria terra?");
        System.out.println("Dissindentes: Cansamos de nos limitar, temos o conhecimento ou seja temos o poder para governar e viver em outros lugares alem de Matematria, queremos mais sempre mais HAHAHA");
        System.out.println("1 - " + nomePersonagem + ": Casos de familia ao vivo KSKS, sinto muito de atrapalhar esse reencontro mas preciso eu vou salvar minha terra natal, se necessário");
        System.out.println("passerei por cima de voces sem remorso algum.");
        System.out.println("2 - " + nomePersonagem + ": Tudo bem chega de papinho, dissindentes tenho uma proposta para voces, que tal desistirem agora e ai eu nao acabo com a raça de voces.");
        int escolha2;
        do {
            escolha2 = scanner.nextInt();
            if (escolha2 < 1 || escolha2 > 2) {
                System.out.println("Só um minuto. estou pensando o que falar.");
            }
        } while (escolha2 < 1 || escolha2 > 2);
        if (escolha2 == 1 || escolha2 == 2) {
            System.out.println("Matiarcs: Você tem razão " + nomePersonagem + " se rendam ou faremos se renderem!");
        }
        System.out.println("Dissindentes: Então tentem nos parar!");
        System.out.println("Após essa fala um dos inimigos dissindentes apertou um piso ao seu lado, a sala se dividiu em duas, você e seu grupo se veem novamente e uma Capsula da matemática");
        System.out.println("Números e letras flutuam sob suas cabeças a sala nao parece ter um fundo, é totalmente branca dando um impressão de estar preso no infinito, depois de analisa-la");
        System.out.println("uma voz ressoa: voces vão nos parar certo? entâo veremos quem de nós chegará primeiro ao Tetraedon.");
        System.out.println("Uma onda de adrenalina te percorre, parando um pouco para pensar você deduz que o Tetraedon deve estar em alguma Capsula tambem, e no fundo aquela sensação");
        System.out.println("de que sua intuição está certa o anima,porque de acordo com o racicionio só precisamos fugir dessa sala para chegarmos a sala do Tetraedon.");
        System.out.println("O tempo nunca esteve ao seu favor e não será diferente agora, com agilidade de pensamento e um raciocinio rápido você percebe que os números e letras que estão flutando");
        System.out.println("formam uma equação de segundo grau, uma não DUAS! seus aliados Matiarcs o auxiliam na formação dessas equações, mais fácil do que o imaginado a primeira equação está");
        System.out.println("montada sendo ela a seguinte " + eventoAleatorioEscolhido1 + " nao tendo tempo a perder você parte para a resolução enquanto os Matiarcs formam a próxima equação");
        System.out.print("x' = ");
        double resposta5 = scanner.nextDouble();
        System.out.print("x'' = ");
        double resposta6 = scanner.nextDouble();
        switch (eventoAleatorioEscolhido1) {
            case "x2 - 5x - 14 = 0":
                double solucao1Evento1 = -2;
                double solucao2Evento1 = 7;
                if ((resposta5 == solucao1Evento1 && resposta6 == solucao2Evento1) || (resposta5 == solucao2Evento1 && resposta6 == solucao1Evento1)) {
                    System.out.println("Okay okay deu certo vamos para a próxima.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 - 12x + 20 = 0":
                double solucao1Evento2 = 10;
                double solucao2Evento2 = 2;
                if ((resposta5 == solucao1Evento2 && resposta6 == solucao2Evento2) || (resposta5 == solucao2Evento2 && resposta6 == solucao1Evento2)) {
                    System.out.println("Okay okay deu certo vamos para a próxima.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 + 9x + 20 = 0":
                double solucao1Evento3 = -5;
                double solucao2Evento3 = -4;
                if ((resposta5 == solucao1Evento3 && resposta6 == solucao2Evento3) || (resposta5 == solucao2Evento3 && resposta6 == solucao1Evento3)) {
                    System.out.println("Okay okay deu certo vamos para a próxima.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "-x^2 + 3x = 0":
                double solucao1Evento4 = 3;
                double solucao2Evento4 = 0;
                if ((resposta5 == solucao1Evento4 && resposta6 == solucao2Evento4) || (resposta5 == solucao2Evento4 && resposta6 == solucao1Evento4)) {
                    System.out.println("Okay okay deu certo vamos para a próxima.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 - 3x = 2x":
                double solucao1Evento5 = 5;
                double solucao2Evento5 = 0;
                if ((resposta5 == solucao1Evento5 && resposta6 == solucao2Evento5) || (resposta5 == solucao2Evento5 && resposta6 == solucao1Evento5)) {
                    System.out.println("Okay okay deu certo vamos para a próxima.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
        }
        System.out.println("Você resolve o primeiro desafio, mas o tempo é escasso. Não sabemos quão rápido o grupo de dissidentes resolveu a cápsula deles, e o nervosismo e a ansiedade");
        System.out.println("começam a transparecer. Quando os pensamentos ruins começam a dominá-lo, um grito ao fundo o tira do fundo do poço que estava prestes a entrar: 'CONSEGUIMOS MONTAR A SEGUNDA!'");
        System.out.println("Assim que a ficha cai, você corre até o local onde eles decifraram a segunda equação. A cada passo dado, você se sente mais exausto. Incrível como a sala transparece essa sensação de");
        System.out.println("realmente estar dentro de um infinito, como se tivesse consequências em tudo ao redor. Mesmo correndo em direção à equação, parece que não sai do lugar, como se estivesse preso em um loop temporal.");
        System.out.println("Quase sem energia, você consegue chegar perto o suficiente para enxergar a equação, e começa a resolver a seguinte equação " + eventoAleatorioEscolhido2 + ". Desenha com os dedos nesse");
        System.out.println("possível infinito chamado de Cápsula da Matemática.");
        System.out.print("x' = ");
        double resposta1 = scanner.nextDouble();
        System.out.print("x'' = ");
        double resposta2 = scanner.nextDouble();
        switch (eventoAleatorioEscolhido2) {
            case "x2 - 5x - 14 = 0":
                double solucao1Evento1 = -2;
                double solucao2Evento1 = 7;
                if ((resposta1 == solucao1Evento1 && resposta2 == solucao2Evento1) || (resposta1 == solucao2Evento1 && resposta2 == solucao1Evento1)) {
                    System.out.println("Conseguimos!");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 - 12x + 20 = 0":
                double solucao1Evento2 = 10;
                double solucao2Evento2 = 2;
                if ((resposta1 == solucao1Evento2 && resposta2 == solucao2Evento2) || (resposta1 == solucao2Evento2 && resposta2 == solucao1Evento2)) {
                    System.out.println("Conseguimos!");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 + 9x + 20 = 0":
                double solucao1Evento3 = -5;
                double solucao2Evento3 = -4;
                if ((resposta1 == solucao1Evento3 && resposta2 == solucao2Evento3) || (resposta1 == solucao2Evento3 && resposta2 == solucao1Evento3)) {
                    System.out.println("Conseguimos!");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "-x^2 + 3x = 0":
                double solucao1Evento4 = 3;
                double solucao2Evento4 = 0;
                if ((resposta1 == solucao1Evento4 && resposta2 == solucao2Evento4) || (resposta1 == solucao2Evento4 && resposta2 == solucao1Evento4)) {
                    System.out.println("Conseguimos!");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 - 3x = 2x":
                double solucao1Evento5 = 5;
                double solucao2Evento5 = 0;
                if ((resposta1 == solucao1Evento5 && resposta2 == solucao2Evento5) || (resposta1 == solucao2Evento5 && resposta2 == solucao1Evento5)) {
                    System.out.println("Conseguimos!");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
        }
        System.out.println("Quase que imediatamente a sala que antes era totalmente branca sem perspectiva alguma de espaço se tornou pequena e totalmente escura.");
        System.out.println("Uma luz verde surge literalmente do completo nada e dela uma porta se forma. A última Cápsula, agora era pra valer; a batalha final estava através dessa porta.");
        System.out.println("Não paramos pra pensar nem por um segundo, pois a batalha final ainda estava acontecendo. Ao abrir a porta, um 'X' de mais ou menos 1 metro de altura a ultrapassa.");
        System.out.println("Vocês correm para dentro dela e percebem o caos que é esta sala, números e letras descontrolados de um lado para o outro, a influência o Tetraedron sobre eles.");
        System.out.println("Realmente dava para se imaginar o porque daquele artefato ser tão perigoso. Você e seus aliados entraram na sala ao mesmo tempo que o grupo de Dissidentes, ou seja, a batalha está equilibrada.");
        System.out.println("Agora é a hora de torná-la desequilibrada. Dessa vez, não só os Matiarcs, como " + nomePersonagem + ", também buscam encontrar a equação que dará a vitória e consequentemente o Tetraedron.");
        System.out.println("A batalha é feroz, mas a lógica e o raciocínio são suas maiores armas. À medida que o confronto se desenrola, vocês percebem que a única maneira de vencer os dissidentes é usar");
        System.out.println("sua compreensão avançada da matemática e da lógica para desativar o dispositivo que está causando toda essa bagunça dentro da sala, dispositivo esse que planejavam usar para seus objetivos nefastos.");
        System.out.println("Matiarcs: Não estamos conseguindo encontrar a equação o números não param nao há um padrão.");
        System.out.println("1 - " + nomePersonagem + ": Verdade tambem nao consegui encontrar um padrão, nao sei o que podemos fazer.");
        System.out.println(" 2 - " + nomePersonagem + ": Calma vamos conseguir algo deve estar passando batido.");
        System.out.println("3 - " + nomePersonagem + ": Realmente nem espaço para fazer uma grainha estou conseguindo achar.");
        int escolha3;
        do {
            System.out.println("O que você fará nesse momento?");
            escolha3 = scanner.nextInt();
            if (escolha3 < 1 || escolha3 > 3) {
                System.out.println("Receio ue nao haja essa escolha. Tente novamente:");
            }
        } while (escolha3 < 1 || escolha3 > 3);
        if (escolha3 == 1 || escolha3 == 2) {
            System.out.println("Tudo bem, então o que faremos agora?");
        } else if (escolha3 == 3) {
            System.out.println("Surprendente terraqueo é você pensar na possibilidade de fazer uma piada.");
        }
        System.out.println("Parando um pouco e acalmando sua mente uma ideia surge!");
        System.out.println(nomePersonagem + ": Pessoal, o Tetradon está afetando toda a lógica do local, isso deve ser o que está impedindo que consigamos organizar a equação. Então, sugiro que façamos algo irracional.");
        System.out.println(nomePersonagem + ": FECHEM OS OLHOS!");
        System.out.println("Matiarcs: Mas precisamos enxergar os componentes para formar a equação, " + nomePersonagem + ", abra o olho! " + nomePersonagem + " AAAA tudo bem, façamos o que sugeriu.");
        System.out.println("Com relutância, todos fecham os olhos, e o improvável acontece: cada um dos Matiarcs está vendo um termo na sua mente, ou seja, uma parte da equação. O que faz todo sentido em um ambiente ");
        System.out.println("em que a lógica não está sendo aplicada, um ambiente irracional só fazendo algo racional para o irracional.");
        System.out.println("Vocês organizam os termos e está lá a última equação! " + eventoAleatorioEscolhido3 + ". Sem nem ao menos verificar se estão à frente dos Dissidentes, você parte para a resolução.");
        System.out.println("Após fechar os olhos novamente, você imagina os espaços para anotar sua resposta.");
        System.out.print("x' = ");
        double resposta3 = scanner.nextDouble();
        System.out.print("x'' = ");
        double resposta4 = scanner.nextDouble();
        switch (eventoAleatorioEscolhido3) {
            case "x2 - 5x - 14 = 0":
                double solucao1Evento1 = -2;
                double solucao2Evento1 = 7;
                if ((resposta3 == solucao1Evento1 && resposta4 == solucao2Evento1) || (resposta3 == solucao2Evento1 && resposta4 == solucao1Evento1)) {
                    System.out.println("A sala antes conturbada e baralhuenta se transformara em um silencio ensurdeedor.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 - 12x + 20 = 0":
                double solucao1Evento2 = 10;
                double solucao2Evento2 = 2;
                if ((resposta3 == solucao1Evento2 && resposta4 == solucao2Evento2) || (resposta3 == solucao2Evento2 && resposta4 == solucao1Evento2)) {
                    System.out.println("A sala antes conturbada e baralhuenta se transformara em um silencio ensurdeedor.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 + 9x + 20 = 0":
                double solucao1Evento3 = -5;
                double solucao2Evento3 = -4;
                if ((resposta3 == solucao1Evento3 && resposta4 == solucao2Evento3) || (resposta3 == solucao2Evento3 && resposta4 == solucao1Evento3)) {
                    System.out.println("A sala antes conturbada e baralhuenta se transformara em um silencio ensurdeedor.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "-x^2 + 3x = 0":
                double solucao1Evento4 = 3;
                double solucao2Evento4 = 0;
                if ((resposta3 == solucao1Evento4 && resposta4 == solucao2Evento4) || (resposta3 == solucao2Evento4 && resposta4 == solucao1Evento4)) {
                    System.out.println("A sala antes conturbada e baralhuenta se transformara em um silencio ensurdeedor.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
            case "x^2 - 3x = 2x":
                double solucao1Evento5 = 5;
                double solucao2Evento5 = 0;
                if ((resposta3 == solucao1Evento5 && resposta4 == solucao2Evento5) || (resposta3 == solucao2Evento5 && resposta4 == solucao1Evento5)) {
                    System.out.println("A sala antes conturbada e baralhuenta se transformara em um silencio ensurdeedor.");
                } else {
                    System.out.println("Sua aventura Termina aqui.");
                    gameOver();
                }
                break;
        }
        System.out.println("O Tetraedon misteriosamente aparece em suas mãos, obrigando o grupo dissidente a se curvar em rendição.");
        System.out.println("Vocês conseguem derrotar a facção dissidente e impedir a conspiração. No entanto, o custo foi alto, e Matematria agora precisa se recuperar dos danos causados pela traição interna.");
        System.out.println("Ao desativar o dispositivo, vocês também descobrem que esses aparelhos têm o poder de abrir um portal dimensional que pode levar você de volta à Terra.");
        System.out.println("A luta pela verdade e pela justiça em Matematria chegou ao fim, mas você deve tomar uma decisão crucial.");
        System.out.println("Agora, você enfrenta a escolha de voltar para casa, deixando para trás seus aliados Matiarcs e a responsabilidade de ajudar a reconstruir Matematria, ou");
        System.out.println("ficar com seus amigos Matiarcs, compartilhando seu conhecimento e habilidades únicas, enquanto continua explorando os mistérios do planeta.");
        System.out.println("A decisão não é fácil, mas o que quer que escolha, sua jornada em Matematria teve um impacto profundo em ambos os mundos.");
        System.out.println("A Terra e Matematria estão ligadas por uma compreensão matemática compartilhada, e sua história viverá para sempre como um exemplo de como a matemática e a lógica podem unir e salvar mundos.");
        System.out.println("Escolha o destino do personagem: ");
        System.out.println("1. Voltar para a Terra");
        System.out.println("2. Ficar em Matematria");
        int escolhaFinal = scanner.nextInt();

        if (escolhaFinal == 1) {
            System.out.println("Você decide voltar para casa, deixando Matematria.");
            System.out.println("Ao retornar à Terra, o terráqueo herói foi recebido com celebrações e reconhecimento mundial por sua incrível jornada além do nosso planeta. Seus feitos corajosos em salvar o planeta alienígena tornaram-se lendários,");
            System.out.println("e ele foi saudado como um símbolo de esperança e cooperação intergaláctica.");
            System.out.println("                                                     \n"
                    + "                            ::mmmmmmmmmmmmmmmmmmmmmm::                          \n"
                    + "                        mmmmmmmmmmmmmmmmmmmmmm::::::..mmmm                      \n"
                    + "                    mmmmmm::::::::::::::mmmm::::::::::mm::++mm                  \n"
                    + "                mmmmmm::::::::::::::::::mmmm  ::::::::::::mmmmmmmm              \n"
                    + "              mmmmmm::::::::::::::::::::::mm  ::::::::::::::::::  mm            \n"
                    + "            mmmm::::::::::::::::::::::::::mmmmmmmm::::mmmm::mmmm::mmmm          \n"
                    + "          mmmm::::::::::::::::::::::::::::::::mmmmmm::mmmmmmmmmm::mm::mm        \n"
                    + "        mmmm::::::::::::::::::::::::::::::::mmmmmm..::mmmmmmmm::::mm::::mm      \n"
                    + "      mmmmmm::::::::::::::::::::::::::::::::mmmmmm::::mmmmmmmm::::mm++::mm      \n"
                    + "      mmmm::::::::::::::::::::::::::::::::mm++  ::::mmmmmmmmmm::::  mmmm..mm    \n"
                    + "    mmmm::::::::::::::::::::::::::::::::mmmmmmmm::::mmmmmmmmmmmm::::::::::mm    \n"
                    + "    mmmmmmmm::::::::::::::::::::::::::::mmmm  mm::mmmmmmmmmmmmmmmmmmmm::::::mm  \n"
                    + "  mmmmmmmmmm::::::::::::::::::::::::::::::mmmm::::mmmmmmmmmmmmmmmmmmmmmm::::mm  \n"
                    + "  mm::++mmmm::::::::::::::::::::::::::::::mmmm::::mmmmmmmmmmmmmmmmmmmm..::::::mm\n"
                    + "  mm::::mmmm::::::::::::::::::::::::::++mmmmmm::::::::mmmmmmmmmmmmmm::::mm++mmmm\n"
                    + "    ::::mmmm::::::::::::::::::::::::mmmm::mmmmmmmm::::mmmmmmmmmmmmmm::mmmm::::mm\n"
                    + "  mmmm::mmmmmmmm::::::::::::::::::mm::mm::  mm::::mm::::mmmmmmmmmm::::  mm::::::\n"
                    + "  mmmm::mmmmmmmm::::::::::::::mmmmmm::::::::  mmmmmm::::mmmmmmmm--::::  mm::::::\n"
                    + "mmmmmm::::::mmmm::::::::::::::mmmm::::mmmmmm::::mm--::::mmmmmmmm..::::mmmm::::::\n"
                    + "mmmmmmmmmm::mmmmmmmmmmmmmm::::mm..::::mmmmmmmm::::::::::::::::++::::::mm::::::::\n"
                    + "++::mmmmmm::::mmmmmmmmmmmmmmmmmmmm::::mmmmmmmmmmmm::::::::::::::::::  mm::::::::\n"
                    + "  ::mmmmmmmm::::  mmmm----mmmmmmmmmm::mmmmmmmmmmmmmm::::::::::::::::::mmmm::::::\n"
                    + "    ::mmmmmmmm::::  mmmm::::mmmmmmmm::mmmm::::mmmmmm::::::::::::::::::mmmmmm::mm\n"
                    + "  mm::::::mmmmmm::::mmmmmm::::mmmmmm::::::::::::::::::::::::::::::::::::  mmmmmm\n"
                    + "  mm::::mmmmmmmmmm::::::::::::mmmm++mmmmmmmmmmmm::::::::::::::::::::::mm::  mmmm\n"
                    + "    ::::++mmmmmmmmmmmmmm::::::mmmmmmmmmmmmmmmmmmmm::::::::::::::::::::mmmm::mm  \n"
                    + "    mm::::mmmmmmmmmmmmmm::::++mm::::::::::::::mmmmmm::::::::::::::::::::::::mm  \n"
                    + "    mm::::mmmmmmmmmmmm::::mmmmmm::::::::::::::::mmmmmm::::::mmmmmm::::::::::mm  \n"
                    + "      mm::::mmmmmmmmmm::mmmmmm::::::::::::::::::::mmmmmm::mmmmmmmmmm::::::mm    \n"
                    + "        --::::mmmmmm--::::++mm::::::::::::::::::::++mmmm::mmmmmmmmmm::::::++    \n"
                    + "        mm::::::mmmm..::mmmm::::::::::::::::::::::::mmmm::::mmmmmmmm::::mm      \n"
                    + "          mm::::::mm::::mm::::::::::::::::::::::::mmmmmm::::mmmmmmmm::mm        \n"
                    + "            mm::::::::::mmmm::::::::::::::::::::::mmmm::::mmmmmm::::mm          \n"
                    + "              mm::::::::mmmmmm::::::::::::::::::mmmmmm::::mmmm::::mm            \n"
                    + "                mm--::::::mmmmmmmm::::::::::::mmmmmm::::mmmm::mmmm              \n"
                    + "                  mmmm::::::mmmmmmmm::::::::::mmmm::::::::..mm                  \n"
                    + "                      mmmm..::..++++mm::::::::mmmm::::--mmmm                    \n"
                    + "                            mmmm++mmmmmmmmmmmmmmmmmmmm..            ");
            // Adicione mais descrições e diálogos para o final "Voltando para a Terra" 
        } else if (escolhaFinal == 2) {
            System.out.println("Você decide ficar em Matematria com seus aliados Matiarcs.");
            System.out.println("No momento em que o terráqueo, herói entre os descobertos, imaginou o dilema de retornar à Terra ou permanecer no planeta que havia ajudado a salvar, ele ");
            System.out.println("sobre a profunda conexão que havia sido desenvolvida com aquele mundo distante. Inspirado pela gratidão dos habitantes conhecidos e pelos laços de amizade");
            System.out.println("forjados durante o tempo, decidiu ficar no planeta, e ajudar na reconstrução do mesmo.");
            // Adicione mais descrições e diálogos para o final "Ficar em Matematria" aqui
        }

        System.out.println("Fim do jogo. Obrigado por jogar!");
        mainMenu();
    }

    public static String obterNomeDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vejam só, o azarado da vez acaba de fazer sua aparição. Qual seria o nome do nosso próximo aspirante a herói?");
        System.out.print("Nome: ");
        String nomePersonagem = scanner.nextLine();

        return nomePersonagem;
    }
}
