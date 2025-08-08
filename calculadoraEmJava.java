import java.util.Scanner;

public class exerciciosChatGPT01 {
    public static void printMenu(){
        System.out.println("==========CALCULADORA==========");
        System.out.println("Escolha o operador de sua preferência");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Sair");
        System.out.println("================================");
        System.out.print("Digite a sua escolha: ");
    }
    public static float soma(int a, int b) {
        return a + b;
    }
    public static float subtracao(int a, int b) {
        return a - b;
    }
    public static float multiplicacao(int a, int b) {
        return a * b;
    }
    public static float divisao(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (operacaoSelecionada != 5){
            
            printMenu();
            int operacaoSelecionada = scanner.nextInt();

            if (operacaoSelecionada == 1 && operacaoSelecionada == 2 && operacaoSelecionada == 3 && operacaoSelecionada == 4){
                System.out.print("Favor digite o primeiro valor: ");
                float num1 = scanner.nextInt();
                System.out.print("Favor digite o segundo valor: ");
                float num2 = scanner.nextInt();
            }

            if (operacaoSelecionada == 1){
                float resultado = soma(num1,num2);
                System.out.println("O resultado da soma resulta em "+soma);
            }
            else if (operacaoSelecionada == 2){
                float resultado = subtracao(num1,num2);
                System.out.println("O resultado da subtração resulta em "+subtracao);
            }
            else if (operacaoSelecionada == 3){
                float resultado = multiplicacao(num1,num2);
                System.out.println("O resultado da multiplicação resulta em "+multiplicacao);
            }
            else if (operacaoSelecionada == 4){
                float resultado = divisao(num1,num2);
                System.out.println("O resultado da divisão resulta em "+divisao);
            }
            else{
                System.out.print("Obrigada por usar a calculadora");
                System.out.print("Saindo... ");
            }
                
        }
    }
}
