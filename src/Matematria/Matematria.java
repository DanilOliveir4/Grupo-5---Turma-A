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
<<<<<<< HEAD
                System.out.println("Voz de Matematria: Por favor fale novamente e com mais calma agora.");
=======
                System.out.println("Voz de Matematria: Porfavor fale novamente e com mais calma agora.");
>>>>>>> 22ee9d8bf69ce7fd4ce14874008aa1d99b323804
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

<<<<<<< HEAD
    }

    public static void capitulo2() {
        System.out.println("**-** Capítulo 2: Aliados Inesperados **-**");
=======
        // Adicione mais descrições e diálogos para o Capítulo 1 aqui
        System.out.println("Capítulo 2: Aliados Inesperados");
        System.out.println("Voz de Matematria: Muito bem, você chegou ao Capítulo 2, esteja preparado!");
        System.out.println("");
        System.out.println("Neste capítulo, você continua a enfrentar desafios matemáticos em Matematria, incluindo um desafio de resolução de equações de segundo grau.");
        System.out.println("Voce está preparado?");
        System.out.println("1-Sim.");
        System.out.println("2- Não");
        int opcao1;
         do {
            opcao1 = scanner.nextInt();
            if (opcao1 == 1) {
                System.out.println("Execelente, bora lá!!");
            }
              
         } while (opcao1 < 1 || opcao1 > 3);
          if (opcao1 == 2) {
             System.out.println("Não tem mais volta. Siga em frente HAHAHA");
         } 
         System.out.println("Enquanto você avança em Matematria, cada cápsula que enfrenta apresenta novos desafios matemáticos."); 
         System.out.println("Siga em frente e logo encontrarar uma caverna para que possa descansar");
         System.out.println(" O planeta é repleto de surpresas, e você começa a entender que resolver enigmas é a única maneira de ganhar o respeito dos Matiarcs e encontrar uma saída.");
         System.out.println();
         System.out.println( " BARAULHO DE CHUVA: shuaaaa shuaaaaa shuaaaa ");
         System.out.println("É melhor você se apressar para evitar ser atingido por essa tempestade cortante de números. ");
         System.out.println("Voz de Matematria: Você chegou na caverna, pode descansar");
         System.out.println("BOOOOM!");
         System.out.println( "Fique parado ai mesmo" + nomePersonagem);
         System.out.println("Estas são as cápsulas mágicas, não deixe de abri-las.");
         System.out.println("Em uma das cápsulas, você se depara com um desafio de resolução de equações de segundo grau.");
         System.out.println("os coeficientes e constantes se misturam no ar, e você precisa encontrar as raízes corretas para resolver a proposta.");
         System.out.println("com dedicação e lógica, você domina o desafio e segue em frente.");
         System.out.println("Mão há necessidade de ficar ansioso para resolver essa equação, mas lembre-se de que Matematria depende de você.");
         System.out.println("vamos la" + nomePersonagem + "voce já se lembra de como resolver equaçoes de 2 grau né? é preciso de muito foco");
         System.out.println("chegou sua hora, agora dependem de você, abra a cápsula e resolva a conta ");
         System.out.println("Fiiiiiiinnnnnuuum: Som de cápsula se abrindo");
         System.out.println(nomePersonagem + "Resolva a seguinte equação: 2x ^ 2 - 5x + 3 = 0");
          // inserir o desafrio
          



        

>>>>>>> 22ee9d8bf69ce7fd4ce14874008aa1d99b323804

        // Adicione descrições e diálogos para o Capítulo 2 aqui
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