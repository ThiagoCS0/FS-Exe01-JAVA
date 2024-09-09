import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Primitivos();
//        Matematica();
//        Login();
//        StringMath();
//        Vetores();
//        Matrizes();
        BuscaEmMatrizes();
    }

    private static void Primitivos() {
        byte byteVar = 127;
        long longVar = 9000000L;
        float floatVar = 3.14568F;
        char charVar = 'A';
        String nome = "Thiago";
        M("Byte: " + byteVar + " - Long: " + longVar + " - Float: " + floatVar + " - Char: " + charVar);
        M("Nome: " + nome);
        System.out.printf("%.2f\n", floatVar); // Apenas 2 numeros
        Locale.setDefault(Locale.US); // mudar localidade
        System.out.printf("%.2f\n", floatVar); // saida: 3.15 em vez de 3,15

        int a = 5, b = 7, c = 3;
        double area;
        area = (double) (a + b) / 2 * c; // maneira de conveter um valor
        M("" + area);

        Scanner sc = new Scanner(System.in); // Receber entrada
        String palavra = sc.next(); /*Palavra*/
        M(palavra);
        String frase = sc.nextLine(); /*Frase*/
        M(frase);
        int idade = sc.nextInt(); /*Inteiro*/
        M("Sua idade é: " + idade);
        char caracter = sc.next().charAt(0); /*Char*/
        M("O caracter é: " + caracter);
    }

    private static void Matematica() {
        Scanner sc = new Scanner(System.in);
        double celsius = 25.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        M("Atemperatura em Fahrenheit é: " + fahrenheit);

        int idade = 17;
        if (idade >= 18) {
            M("Você é maior de idade");
        } else {
            M("Você é menor de idade");
        }

        M("Digite um numero: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            M(n + " é par.");
        } else {
            M(n + " é impa.");
        }

//         Verifique se o ano é bissexto
        M("Digite o ano para verificação?");
        int ano = sc.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || ((ano & 400) == 0)) {
            M(ano + " é um ano bisexto!");
        } else {
            M(ano + " não é uma no bisexto");
        }

//         Calculadora
        M("Numero 1: ");
        double n1 = sc.nextDouble();
        M("Numero 2: ");
        double n2 = sc.nextDouble();
        M("Qual operador { + - * / }");
        char operador = sc.next().charAt(0);
        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
            default:
                M("Operador invalido, apenas { + - * / }");
                return;
        }
        M("O resultado é " + resultado);
    }

    private static void Login() {
//                Login : 3 tentativas
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        String login, senha;
        while (true) {
            if (tentativas < 3) {
                M("Login:");
                login = sc.next();
                M("Senha:");
                senha = sc.next();
                if (login.equals("Thiago") && senha.equals("senha")) {
                    break;
                } else {
                    M("Tente novamente!");
                    tentativas++;
                }
            } else {
                M("Infelismente não conseguiu!");
                return;
            }
        }
        M("Sejá bem vindo!");
    }

    private static void StringMath() {
        String t = "Meu nome é Thiago";
        M("toUpperCase\t\t\t\t: " + t.toUpperCase() + ".");
        M("toLowerCase\t\t\t\t: " + t.toLowerCase() + ".");
        M("Texto\t\t\t\t\t: " + t + ".");
        M("Contains:" + (t.contains("thiago")) + "\t\t\t: No texto acima " + (t.contains("thiago") ? "" : "não ") + "contém thiago.");
        M("Equals:" + ("Thiago".equals("thiago")) + "\t\t\t: Thiago " + ("Thiago".equals("thiago") ? "é" : "não é") + " igual a thiago.");
        M("equalsIgnoreCase:" + ("Thiago".equalsIgnoreCase("thiago")) + "\t: Thiago " + ("Thiago".equalsIgnoreCase("thiago") ? "é" : "não é") + " igual a thiago.");
        M("isEmpty:" + (t.isEmpty()) + "\t\t\t: O Texto " + (t.isEmpty() ? "" : "não ") + "está vazio.");
        M("replace\t\t\t\t\t: " + t.replace("Thiago", "Thiago Silva."));
        M("length\t\t\t\t\t: O texto tem " + t.length() + " caracteres.");
        M("substring\t\t\t\t: Os 3 caracteres apartir do 0, são '" + (t.substring(0, 3)) + "'.");

        double n = 50.30;
        M("50.30\t: double original\t\t\t: " + n);
        M("round\t: Arredondar (+ proximo)\t: " + Math.round(n));
        M("ceil\t: Arredondar (p cima)\t\t: " + Math.ceil(n));
        M("flor\t: Arredondar (p baixo)\t\t: " + Math.floor(n));
        M("sqrt\t: Raiz quadrada\t\t\t\t: " + Math.sqrt(n));
        M("abs\t\t: Absoluto\t\t\t\t\t: " + Math.abs(n));
        M("random\t: Aleatório\t\t\t\t\t: " + Math.random());
    }

    private static void Vetores() {
//        imprimir todos
        int[] vetor = new int[5];
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        vetor[4] = 100;
        M("Elementos do array 'vetor':");
        for (int i = 0; i < vetor.length; i++) {
            M("Elemento na posição " + i + " : " + vetor[i]);
        }

//        Somar todos
        int[] vInicializado = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int i = 0; i < vInicializado.length; i++) {
            soma += vInicializado[i];
        }
        M(soma + " é a soma de todos os números do 'vInicializado'.");

        int maior = 0;

//        Maior valor :for normal
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        M("for normal: " + maior + " é o maior valor do 'vetor'.");

//        Maior valor :for diferente
        for (int value : vetor) {
            if (value > maior) {
                maior = value;
            }
        }
        M("for diferente: " + maior + " é o maior valor do 'vetor'.");

//        Reverter um array
        int inic = 0, fim = vetor.length - 1;
        while (inic < fim) {
            int tmp = vetor[inic];
            vetor[inic] = vetor[fim];
            vetor[fim] = tmp;
            inic++;
            fim--;
        }

        int[] vetor2 = {1, 20, 3, 14, 15};

//        Adicionar
        int[] novoV = Arrays.copyOf(vetor2, vetor2.length + 1);
        int novo = 7;
        novoV[vetor2.length] = novo;
        vetor2 = novoV;

//        Excluir
        int del = 20, id = 0;
        int[] novoV2 = new int[vetor2.length - 1];
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] != del) {
                novoV2[id] = vetor2[i];
                id++;
            }
        }
        vetor2 = novoV2;
        for (int i = 0; i < vetor2.length; i++) {
            M("Elemento na posição " + i + " : " + vetor2[i]);
        }

//        Pesquisar
        Scanner sc = new Scanner(System.in);
        String saida = "";
        M("Valor a ser buscado (sem vírgulas ou pontos):");
        int busca = sc.nextInt();
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] == busca) {
                saida = "O valor " + busca + " existe!";
                break;
            }
        }
        M(saida.isEmpty() ? "O valor " + busca + " não existe!" : saida);

    }

    private static void Matrizes() {
        int[][] matrix = {
                {1, 2, 3},
                {3, 5, 6},
                {10, 11, 10}
        };
        // Exibir matriz
        M("- Exibir matriz:");
        for (int[] row : matrix) {
            for (int value : row) {
                M(value + "");
            }
        }
        // Somar a diagonal principal e secundaria

        // Rotacionando
        int n = matrix.length;
        int[][] rotacionada = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotacionada[j][n - 1 - i] = matrix[i][j];
            }
        }
        M("");
        M("- Matriz rotacionada 90 graus:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M(rotacionada[i][j] + "");
            }
        }

        // Somas
        M("");
        int soma = 0, somaSecundaria = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) { soma += matrix[i][j]; }
                if ((i + j) == matrix.length - 1) { somaSecundaria += matrix[i][j]; }
            }
        }
        M("- Somas:");
        M("Soma principal: " + soma);
        M("Soma secundaria: " + somaSecundaria);
    }

    private static void BuscaEmMatrizes(){
        int[][] matrix = {
                {1, 2, 3},
                {3, 5, 6},
                {10, 11, 10}
        };
        int n = matrix.length;
        Scanner sc = new Scanner(System.in);
        M("Digete um número buscar na matriz:");
        int bsc = sc.nextInt();
        boolean enc =false;
        for (int lin = 0; lin < n; lin++) {
            for (int col = 0; col < n; col++) {
                if(matrix[lin][col]==bsc){
                    M(MessageFormat.format("{0} encontrado na linha {1}, coluna {2}", bsc, lin, col));
                    enc = true;
                }
            }
        }
        if(!enc){M("Nenhum valor encontrado!");}

    }
    private static void M(String m) {
        System.out.println(m);
    }
}