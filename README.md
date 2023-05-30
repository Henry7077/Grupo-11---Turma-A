# Projeto
jogo
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("== Meu Jogo ==");
            System.out.println("1 - História");
            System.out.println("2 - Instruções");
            System.out.println("3 - Créditos");
            System.out.println("4 - Jogar");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    historia();
                    break;
                case 2:
                    instrucoes();
                    break;
                case 3:
                    creditos();
                    break;
                case 4:
                    jogar(input);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }

  
    public static void historia() {
        System.out.println("Um jovem programador acorda depois de uma noite de sono intenso e percebe que está em um quarto desconhecido. Ele se olha no espelho e reconhece a si mesmo, mas está confuso sobre onde está. Ele lembra de onde trabalha e de sua família, mas percebe que anda estressado e sobrecarregado com várias tarefas e compromissos.");
        System.out.println("Lembra que recentemente foi ao médico e explicou sobre sua falta de concentração, estresse e esgotamento. O médico alertou que se ele não diminuísse o ritmo, poderia ter um colapso. O programador também lembra que seu chefe pediu um projeto importante e que ele precisa entregá-lo para ser promovido.");
        System.out.println("No entanto, ele não se lembra de quanto tempo faz que o chefe pediu o projeto e fica preocupado com a situação. Ele entra em contato com o médico, que explica que a perda de memória recente é comum em pessoas com sobrecarga de trabalho.");
        System.out.println("O médico sugere que o programador tire alguns dias de férias para se recuperar e tente realizar atividades rotineiras para ajudar sua memória. O programador, no entanto, se preocupa com o projeto e decide procurar livros e apostilas em seu quarto para obter informações sobre como realizá-lo.");
    }

    public static void instrucoes() {
        System.out.println("Bem-vindo ao jogo! Neste jogo, você precisa ajudar o estudante que perdeu parte de sua memória recente. Você deve guiá-lo através de desafios de lógica usando um livro, uma apostila ou um caderno de rascunho que o estudante pegará em seu quarto. Qualquer um desses itens levará o estudante ao fim do jogo.");
    }

    public static void creditos() {
        System.out.println("Este jogo foi desenvolvido por Henrique e Jailson do Grupo 11 da turma A, da disciplina Projetos de Integração.");
    }

    public static void jogar(Scanner input) {
        System.out.println("O jogo está começando!");
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        escolherMaterial(nome);
    }

    public static void escolherMaterial(String nome) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao seu quarto, " + nome + "! Hoje é dia de estudar.");
        System.out.println("Escolha o que você deve pegar para estudar. Lembre-se, quanto mais completo for o seu material, melhor:");
        System.out.println("1. Livro");
        System.out.println("2. Apostila");
        System.out.println("3. Caderno de rascunho");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Boa escolha, " + nome + "! Então vamos começar!");
                fase1();
                break;
            case 2:
                System.out.println("Excelente escolha, " + nome + ", mas escolha um item mais completo.");
                break;
            case 3:
                System.out.println("Perfeito, " + nome + "! Boa escolha, mas escolha um item mais completo.");
                break;
            default:
                System.out.println("Opção inválida. Escolha um número entre 1 e 3.");
                break;
        }
    }

    public static void fase1() {
        System.out.println("Bem-vindo à Fase 1\n!");
        questaoAlgoritmos();
    }

    public static void questaoAlgoritmos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================== Fase 01 ================ Sabendo que fluxograma ilustra as etapas, sequências e decisões de um processo ou fluxo de trabalho. Embora haja vários outros tipos, um fluxograma básico é a forma mais simples de um mapa de processo. Trata-se de uma ferramenta robusta para planejar, visualizar, documentar e otimizar processos em diversas áreas de conhecimento.");

        String enunciado = "Um algoritmo que lê 3 valores a, b, c e os escreve. A seguir, encontre o maior dos 3 valores e o escreva com a mensagem: 'É o maior'. Então me diga qual desses programas corresponde ao fluxograma apresentado:";

        System.out.println("+-----------------+");
        System.out.println("| Início          |");
        System.out.println("+-----------------+");
        System.out.println("|                 |");
        System.out.println("| Digite 'a'      |");
        System.out.println("+--------+--------+");
        System.out.println("         |");
        System.out.println("         V");
        System.out.println("+-----------------+");
        System.out.println("| Digite 'b'      |");
        System.out.println("+--------+--------+");
        System.out.println("         |");
        System.out.println("         V");
        System.out.println("+-----------------+");
        System.out.println("| Digite 'c'      |");
        System.out.println("+--------+--------+");
        System.out.println("         |");
        System.out.println("         V");
        System.out.println("+-----------------+");
        System.out.println("|                 |");
        System.out.println("|    a > b ?      |");
        System.out.println("|    |            |");
        System.out.println("|   Yes           |");
        System.out.println("|    |            |");
        System.out.println("|    V            |");
        System.out.println("|   a > c ?       |");
        System.out.println("|    |            |");
        System.out.println("|   Yes           |");
        System.out.println("|    |            |");
        System.out.println("|    V            |");
        System.out.println("|  maior = a      |");
        System.out.println("|                 |");
        System.out.println("+--------+--------+");
        System.out.println("         |");
        System.out.println("         No");
        System.out.println("         |");
        System.out.println("         V");
        System.out.println("+-----------------+");
        System.out.println("|                 |");
        System.out.println("|    b > c ?      |");
        System.out.println("|    |            |");
        System.out.println("|   Yes           |");
        System.out.println("|    |            |");
        System.out.println("|    V            |");
        System.out.println("|  maior = b      |");
        System.out.println("|                 |");
        System.out.println("+--------+--------+");
        System.out.println("         |");
        System.out.println("         No");
        System.out.println("         |");
        System.out.println("         V");
        System.out.println("+-----------------+");
        System.out.println("|                 |");
        System.out.println("|   maior = c     |");
        System.out.println("|                 |");
        System.out.println("+--------+--------+");
        System.out.println("         |");
        System.out.println("         V");
        System.out.println("+-----------------+");
        System.out.println("|                 |");
        System.out.println("| Exibir 'O maior |");
        System.out.println("| valor é: maior' |");
        System.out.println("|                 |");
        System.out.println("+--------+--------+");
        System.out.println("         |");
        System.out.println("         V");
        System.out.println("+-----------------+");
        System.out.println("|      Fim        |");
        System.out.println("+-----------------+");

        String respostaCorreta = ("a + b + | a - b | Maior de a e b = ");
    
        ArrayList<String> alternativas = new ArrayList<>();
        alternativas.add(" a++ b +| b -a | Maior de a e  b =");
        alternativas.add(" ab + | a + b  | Maior d  de a e b =");
        alternativas.add(" b + a + a - b | Maior de a e b = ");
        alternativas.add(" a + b + | a - b |Maior de a e b = ");
    
        do {
            // Exibir a pergunta e as alternativas
            System.out.println(enunciado);
            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + alternativas.get(i));
            }

            // Ler a resposta do usuário
            System.out.print("Digite a letra correspondente à opção correta: ");
            String respostaUsuario = scanner.nextLine();

            // Verificar se a resposta está correta
            int indexRespostaCorreta = alternativas.indexOf(respostaCorreta);
            if (indexRespostaCorreta >= 0 && respostaUsuario.equalsIgnoreCase(Character.toString((char) ('a' + indexRespostaCorreta)))) {
                System.out.println("Resposta correta!");
                fase2();
                return;
            }
            System.out.println("Resposta incorreta. Tente novamente.");
        } while (true);
    }
    
  
    public static void fase2() {
        System.out.println("Parabéns! Você concluiu a Fase 1 com sucesso.");
        System.out.println("Bem-vindo à Fase 2!");
        calcularPi();
    }

    public static void calcularPi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao desafio de calcular π/3!");
        System.out.println("Como você representaria uma divisão de π por 3 em algoritmos?");

        String respostaCorreta = "pi = 3.14159\npi_div_3 = pi / 3";

        ArrayList<String> alternativas = new ArrayList<>();
        alternativas.add("(a) pi = 3.14159\npi_div_3 = pi / 3");
        alternativas.add("(b) pi = 3.14159\npi_mult_3 = pi * 3");
        alternativas.add("(c) pi = 3.14159\npi_mod_3 = pi % 3");
        alternativas.add("(d) pi = 3.14159\npi_div_3 = pi + 3");

        do {
            // Embaralhar as alternativas
            Collections.shuffle(alternativas);

            // Exibir a pergunta e as alternativas
            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + alternativas.get(i));
            }

            // Ler a resposta do usuário
            System.out.print("Digite a letra correspondente à opção correta: ");
            String respostaUsuario = scanner.nextLine();

            // Verificar se a resposta está correta
            int indexRespostaCorreta = alternativas.indexOf(respostaCorreta);
            if (indexRespostaCorreta >= 0 && respostaUsuario.equalsIgnoreCase(Character.toString((char) ('a' + indexRespostaCorreta)))) {
                System.out.println("Resposta correta!");
                fase3();
                return;
            }
            System.out.println("Resposta incorreta. Tente novamente.");
        } while (true);
    }

    public static void fase3() {
        System.out.println("Parabéns! Você concluiu a Fase 2 com sucesso.");
        System.out.println("Bem-vindo à Fase 3!");
        calcularMedia();
    }

    public static void calcularMedia() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao desafio de calcular a média!");
        System.out.println("Escreva um algoritmo que leia 4 notas e calcule a média final.");

        String respostaCorreta = "soma = nota1 + nota2 + nota3 + nota4\nmedia = soma / 4";

        ArrayList<String> alternativas = new ArrayList<>();
        alternativas.add("(a) media = (nota1 + nota2 + nota3 + nota4) / 4");
        alternativas.add("(b) soma = nota1 + nota2 + nota3 + nota4\nmedia = soma / 4");
        alternativas.add("(c) media = (nota1 + nota2 + nota3 + nota4) * 4");
        alternativas.add("(d) soma = nota1 + nota2 + nota3 + nota4\nmedia = soma * 4");

        do {
            // Embaralhar as alternativas
            Collections.shuffle(alternativas);

            // Exibir a pergunta e as alternativas
            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + alternativas.get(i));
            }

            // Ler a resposta do usuário
            System.out.print("Digite a letra correspondente à opção correta: ");
            String respostaUsuario = scanner.nextLine();

            // Verificar se a resposta está correta
            int indexRespostaCorreta = alternativas.indexOf(respostaCorreta);
            if (indexRespostaCorreta >= 0 && respostaUsuario.equalsIgnoreCase(Character.toString((char) ('a' + indexRespostaCorreta)))) {
                System.out.println("Resposta correta!");
                fase4();
                return;
            }
            System.out.println("Resposta incorreta. Tente novamente.");
        } while (true);
    }

    public static void fase4() {
        System.out.println("Parabéns! Você concluiu a Fase 3 com sucesso.");
        System.out.println("Bem-vindo à Fase 4!");
        contarCaracteres();
    }

    public static void contarCaracteres() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao desafio de contar caracteres!");
        System.out.println("Escreva um algoritmo que leia uma frase e conte quantos caracteres ela possui.");

        String respostaCorreta = "tamanho = comprimento(frase)";

        ArrayList<String> alternativas = new ArrayList<>();
        alternativas.add("(a) tamanho = length(frase)");
        alternativas.add("(b) tamanho = count(frase)");
        alternativas.add("(c) tamanho = size(frase)");
        alternativas.add("(d) tamanho = comprimento(frase)");

        do {
            // Embaralhar as alternativas
            Collections.shuffle(alternativas);

            // Exibir a pergunta e as alternativas
            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + alternativas.get(i));
            }

            // Ler a resposta do usuário
            System.out.print("Digite a letra correspondente à opção correta: ");
            String respostaUsuario = scanner.nextLine();

            // Verificar se a resposta está correta
            int indexRespostaCorreta = alternativas.indexOf(respostaCorreta);
            if (indexRespostaCorreta >= 0 && respostaUsuario.equalsIgnoreCase(Character.toString((char) ('a' + indexRespostaCorreta)))) {
                System.out.println("Resposta correta!");
                faseFinal();
                return;
            }
            System.out.println("Resposta incorreta. Tente novamente.");
        } while (true);
    }

    public static void faseFinal() {
        System.out.println("Parabéns! Você concluiu a Fase 4 com sucesso.");
        System.out.println("Você concluiu todas as fases do desafio.");
        System.out.println("Continue estudando e se aprimorando. O conhecimento é um tesouro que ninguém pode roubar de você.");
    }
}


