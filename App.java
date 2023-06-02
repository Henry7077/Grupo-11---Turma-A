
import java.util.Scanner; 
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class App {
  
public static void historia() {
    System.out.println("Um jovem programador acorda depois de uma noite de sono intenso e percebe que está em um quarto desconhecido. Ele se olha no espelho e reconhece a si mesmo, mas está confuso sobre onde está. Ele lembra de onde trabalha e de sua família, mas percebe que anda estressado e sobrecarregado com várias tarefas e compromissos.");
    System.out.println("Lembra que recentemente foi ao médico e explicou sobre sua falta de concentração, estresse e esgotamento. O médico alertou que se ele não diminuísse o ritmo, poderia ter um colapso. O programador também lembra que seu chefe pediu um projeto importante e que ele precisa entregá-lo para ser promovido.");
    System.out.println("No entanto, ele não se lembra de quanto tempo faz que o chefe pediu o projeto e fica preocupado com a situação. Ele entra em contato com o médico, que explica que a perda de memória recente é comum em pessoas com sobrecarga de trabalho.");
    System.out.println("O médico sugere que o programador tire alguns dias de férias para se recuperar e tente realizar atividades rotineiras para ajudar sua memória. O programador, no entanto, se preocupa com o projeto e decide procurar livros e apostilas em seu quarto para obter informações sobre como realizá-lo.");
}

public static void instrucoes() {
    System.out.println("\nBem-vindo ao jogo! Neste jogo, você precisa ajudar o estudante que perdeu parte de sua memória recente. Você deve guiá-lo através de desafios de lógica usando um livro, uma apostila ou um caderno de rascunho que o estudante pegará em seu quarto. Qualquer um desses itens levará o estudante ao fim do jogo.");
}

public static void creditos() {
    System.out.println("\nEste jogo foi desenvolvido por Henrique e Jailson do Grupo 11 da turma A, da disciplina Projetos de Integração.");
}

   static String ComecoDoJogo() {
    Scanner input = new Scanner(System.in);
    System.out.println("O jogo está começando!");
    System.out.print("\nDigite o nome do seu personagem: ");
    String nome = input.nextLine();
   return nome;
}

 static void PegueSeuLivro(String nome) {
   Scanner input = new Scanner(System.in);
    System.out.println("\nSeja Bem vindo " + nome + "!! Pegue o seu Livro, e vamos para a nossa Jornada.");
    System.out.println("\nAperte 1 para pegar o seu Livro.");
     int aperte = input.nextInt();
     
 }


public static void questaoAlgoritmos(String nome) {
  System.out.println("\nBem-vindo à Fase 1\n!");
    Scanner scanner = new Scanner(System.in);

     System.out.println("\n==================== Fase 01 ===================");
     System.out.println("\nSabendo que fluxograma ilustra as etapas, sequências e decisões de um processo ou fluxo de trabalho. Embora haja vários outros tipos, um fluxograma básico é a forma mais simples de um mapa de processo. Trata-se de uma ferramenta robusta para planejar, visualizar, documentar e otimizar processos em diversas áreas de conhecimento.");

    
    System.out.println("-------EXEMPLO-----");
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

    String respostaCorreta = ("Losango");

    ArrayList<String> alternativas = new ArrayList<>();
    alternativas.add("Retangulo");
    alternativas.add("Losango");
    alternativas.add("Setas");
    alternativas.add("Terminador");
  boolean respostaCorretaFornecida = false;
  int tentativa = 0;
    do {
        // Exibir a pergunta e as alternativas
      
        System.out.println("\nQual símbolo é normalmente usado em um fluxograma para representar uma decisão ou condição?");
        for (int i = 0; i < alternativas.size(); i++) {
            System.out.println((char) ('a' + i) + ") " + alternativas.get(i));
        }

        // Ler a resposta do usuário
        System.out.print("\nDigite a letra correspondente à opção correta: ");
        String respostaUsuario = scanner.nextLine();

        // Verificar se a resposta está correta
        int indexRespostaCorreta = alternativas.indexOf(respostaCorreta);
        if (indexRespostaCorreta >= 0 && respostaUsuario.equalsIgnoreCase(Character.toString((char) ('a' + indexRespostaCorreta)))) {
            System.out.println("\nResposta correta! Parabéns " + nome +"!! Você concluiu a Fase 1 com sucesso, com isso sua memoria está voltando aos poucos ");
     System.out.println("\nVamos Para Fase 2!!");

          respostaCorretaFornecida = true;
          break;
        }else{
            System.out.println("\nResposta incorreta. Tente novamente.");
          tentativa++;
     } 

} while (!respostaCorretaFornecida && tentativa < 3);
  if(tentativa == 3){
    System.out.print("\nAcabou suas tentativas, mas CONTINUE e não desanime de sua jornada.");
    
}
}

  public static void fase2(String nome) {
   System.out.println("\nBem-vindo à Fase 2!");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem-vindo ao desafio de calcular π/3!");
    System.out.println("\nComo você representaria uma divisão de π por 3 em algoritmos?");

    String respostaCorreta = "pi = 3.14159\npi_div_3 = pi / 3";

    ArrayList<String> alternativas = new ArrayList<>();
    alternativas.add("pi = 3.14159\npi_div_3 = pi / 3");
    alternativas.add("pi = 3.14159\npi_mult_3 = pi * 3");
    alternativas.add("pi = 3.14159\npi_mod_3 = pi % 3");
    alternativas.add("pi = 3.14159\npi_div_3 = pi + 3");
  boolean respostaCorretaFornecida = false;
int tentativa = 0;
    do {
        // Embaralhar as alternativas
      
        Collections.shuffle(alternativas);

        // Exibir a pergunta e as alternativas
        for (int i = 0; i < alternativas.size(); i++) {
            System.out.println((char)( +'a' + i) + ") " + alternativas.get(i));
        }

        // Ler a resposta do usuário
        System.out.print("Digite a letra correspondente à opção correta: ");
        String respostaUsuario = scanner.nextLine();

        // Verificar se a resposta está correta
        int indexRespostaCorreta = alternativas.indexOf(respostaCorreta);
        
      if (indexRespostaCorreta >= 0 && respostaUsuario.equalsIgnoreCase(Character.toString((char) ('a' + indexRespostaCorreta)))) {
            System.out.println("\nResposta correta! É isso ai " + nome + ", Voce lembrou de mais um importante topico sobre a programação, Mais um pouco e lembrara do que é necessario para concluir o projeto solicitado pelo Chefe.");
            System.out.println("\nVamos Para Fase 3!!");
          respostaCorretaFornecida = true;
            break;
        }
        System.out.println("\nResposta incorreta. Tente novamente.");
      tentativa++;
      
      
    } while (!respostaCorretaFornecida && tentativa < 3);
  if(tentativa == 3){
  System.out.println("\nVamos lá cara... LEMBRA, LEMBRA, LEMBRA.. preciso que você lembre, o Chefe ja está perdendo a paciencia.");
}
}

public static void fase3(String nome) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nBem-vindo à Fase 3! " + nome);
    System.out.println("\n==========DESAFIO: calcular a média!==========");
    System.out.println("\nEscreva um algoritmo que leia 4 notas e calcule a média final.");

    String respostaCorreta = "soma = nota1 + nota2 + nota3 + nota4\nmedia = soma / 4";

    ArrayList<String> alternativas = new ArrayList<>();
    alternativas.add("media = (nota1 + nota2 + nota3 + nota4) / 4");
    alternativas.add("soma = nota1 + nota2 + nota3 + nota4\nmedia = soma / 4");
    alternativas.add("media = (nota1 + nota2 + nota3 + nota4) * 4");
    alternativas.add("soma = nota1 + nota2 + nota3 + nota4\nmedia = soma * 4");
    int tentativa = 0;
  boolean respostaCorretaFornecida = false;

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
            System.out.println("\nResposta correta! Parabens " + nome + " voce realmente perdeu a memoria?? Voce e muito bom nisso!! Continue assim e logo estara 100%");
            System.out.println("Vamos Para Fase 4!!");
          respostaCorretaFornecida = true;
          break;
            
        }
        System.out.println("\nResposta incorreta. tente se lembrar, voce consegue!");
      tentativa++;
      
    } while (!respostaCorretaFornecida && tentativa < 3);
 if(tentativa == 3){
  System.out.println("Mantenha o foco, voce pode melhorar.");
  
}
}


public static void fase4(String nome) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n==========Bem-vindo à Fase 4!==========");
    System.out.println("_______DESAFIO: contar caracteres!_______");
    System.out.println("\nEscreva um algoritmo que leia uma frase e conte quantos caracteres ela possui.");

    String respostaCorreta = "tamanho = comprimento(frase)";

    ArrayList<String> alternativas = new ArrayList<>();
    alternativas.add("tamanho = length(frase)");
    alternativas.add("tamanho = count(frase)");
    alternativas.add("tamanho = size(frase)");
    alternativas.add("tamanho = comprimento(frase)");
    boolean respostaCorretaFornecida = false;
    int tentativa = 0;

    do {
        // Embaralhar as alternativas
        Collections.shuffle(alternativas);

        // Exibir a pergunta e as alternativas
        for (int i = 0; i < alternativas.size(); i++) {
            System.out.println((char) ('a' + i) + ") " + alternativas.get(i));
        }

        // Ler a resposta do usuário
        System.out.print("\nDigite a letra correspondente à opção correta: ");
        String respostaUsuario = scanner.nextLine();

        // Verificar se a resposta está correta
        int indexRespostaCorreta = alternativas.indexOf(respostaCorreta);
        if (indexRespostaCorreta >= 0 && respostaUsuario.equalsIgnoreCase(Character.toString((char) ('a' + indexRespostaCorreta)))) {
            System.out.println("\nResposta correta! Parabens " + nome +" Falta apenas um desafio para que voce esteja preparado para voltar a fazer oque voce mais ama!" );
            System.out.println("\nVamos para a FASE FINALLL");
            respostaCorretaFornecida = true;;
            break;
            
        }else{
        System.out.println("\nResposta incorreta. Pense melhor!");
        tentativa++;
        }
    } while (!respostaCorretaFornecida && tentativa < 3);
    if(tentativa == 3){
        System.out.println("Infelizmente Voce nao esta preparado para o desafio Final. Recomece e pense onde voce errou. Estude mais e mais, que os conhecimentos voltaram ao lugar");
    }
}

public static void faseFinal() {
    System.out.println("Parabéns! Você concluiu a Fase 4 com sucesso.");
    System.out.println("Você concluiu todas as fases do desafio.");
    System.out.println("Continue estudando e se aprimorando. O conhecimento é um tesouro que ninguém pode roubar de você.");
}
  static void menu (){
    Scanner input = new Scanner(System.in);
    System.out.println("\n== O Programador ==");
        System.out.println("1 - História");
        System.out.println("2 - Instruções");
        System.out.println("3 - Créditos");
        System.out.println("4 - Jogar");
        System.out.print("Escolha uma opção: ");
       
  }
  
 static void opcaoMenu(){
 Scanner input = new Scanner(System.in); 
int opcao ;
  do {
    menu();
    opcao = input.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("\nUm jovem programador acorda depois de uma noite de sono intenso e percebe que está em um quarto desconhecido. Ele se olha no espelho e reconhece a si mesmo, mas está confuso sobre onde está. Ele lembra de onde trabalha e de sua família, mas percebe que anda estressado e sobrecarregado com várias tarefas e compromissos.");
    System.out.println("\nLembra que recentemente foi ao médico e explicou sobre sua falta de concentração, estresse e esgotamento. O médico alertou que se ele não diminuísse o ritmo, poderia ter um colapso. O programador também lembra que seu chefe pediu um projeto importante e que ele precisa entregá-lo para ser promovido.");
    System.out.println("\n No entanto, ele não se lembra de quanto tempo faz que o chefe pediu o projeto e fica preocupado com a situação. Ele entra em contato com o médico, que explica que a perda de memória recente é comum em pessoas com sobrecarga de trabalho.");
    System.out.println("\nO médico sugere que o programador tire alguns dias de férias para se recuperar e tente realizar atividades rotineiras para ajudar sua memória. O programador, no entanto, se preocupa com o projeto e decide procurar livros e apostilas em seu quarto para obter informações sobre como realizá-lo.");
            break;
                
            case 2:
                instrucoes();
            break;
            
            case 3:
                creditos();
            break;
                
            case 4:
            break;
              
            default:
                System.out.println("Opção inválida! Tente novamente.");
                
      
   } 
}while (opcao != 4);
}

static void adivinhe(String nome){
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n============== ADIVINHE ==============");
    System.out.println("\n" + nome +"Voce esta quase lá, mas precisa dar um relaxada, aprender pode ser estressante.");
    System.out.println("\nEsta fase e um Bonus para voce se destrair e se divertir. Mas quando voce menos espera, voce entendera que esta treinando e desevolvendo a sua logica.");
    System.out.println("\\nO desasafio consite em voçê Adivinha um numero aleatorio, voce tera 5 tentativas. BOA SORTE! ");
    Random aleatorio = new Random();
    int n1 = 1;
    int n2 = 100;
    int tentativas;
    int resposta;
    int numero; 
    int Jogardenovo;
do{
    numero = aleatorio.nextInt(n2-n1 + 1)+n1;
    tentativas = 5;
    do{
      System.out.println("tente adivinha o numero aleatorio: ");
      resposta = scanner.nextInt();
      if(resposta == numero){
        System.out.println("Parabens voce acertou!!!");
        break;
        
      } else if(Math.abs(resposta - numero) <=1){
        
        System.out.println("TA QUEEENTE!!");
        
      
        }else if(resposta < numero){
        System.out.println("Maior!!");
        }else if(resposta > numero){
        System.out.println("Menor!!");
        }else{
        System.out.println("TA FRIOOO");
        }
      
      tentativas--;
    }while(resposta != numero && tentativas > 0 );
    if(resposta != numero){
    System.out.println("GAME OVER");
    System.out.println("O numero era: " + numero);
    }
    System.out.println("\nSe divertiu ne? Se quiser jogar novamente digite 1. Se voce se sente preparado para a fase Final, Digite 2.");
    Jogardenovo = scanner.nextInt(); 
}while(Jogardenovo == 1);
    scanner.close();
   
  }



public static void main(String[] args) { 
  opcaoMenu();
  String nomeDoPersonagem = ComecoDoJogo();
  PegueSeuLivro(nomeDoPersonagem);
  questaoAlgoritmos(nomeDoPersonagem); //Fase 1
  fase2(nomeDoPersonagem);
  fase3(nomeDoPersonagem);
  fase4(nomeDoPersonagem);
  adivinhe(nomeDoPersonagem);
}
    
}
