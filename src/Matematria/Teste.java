package Matematria;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        testaProssegueTexto();
    }

    public static void testaProssegueTexto() {
        System.out.println("Testando o método prossegueTexto:");
        Matematria.prossegueTexto();

        // Se o método prossegueTexto() terminar sem problemas, imprima a mensagem de sucesso.
        System.out.println("Funcionou, passou no teste!");
    }
}

class Matematria {

    public static void prossegueTexto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para prosseguir.");
        int prossiga;
        do {
            prossiga = scanner.nextInt();
            if (prossiga != 1) {
                System.out.println("Mais uma vez, Digite 1 para continuar.");
            }
        } while (prossiga != 1);

        // Fechar o scanner após a utilização
        scanner.close();
    }
}
