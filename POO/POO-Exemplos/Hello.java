import java.util.Scanner;

public class Hello{
    /*
        @parameters: int(param1, param2);
        @return: int(soma);
    */
    public static int returnNumber(int param, int param2) {
        int soma = param + param2;

        return soma;
    };

    public static void main(String[] args) {
        // objeto de entrada e recebedo por 2 inputs
        Scanner input = new Scanner(System.in);
        int in1 = input.nextInt();
        int in2 = input.nextInt();
        // atribuindo os inputs a função soma
        int soma = returnNumber(in1, in2);
        // exibindo resultado
        System.out.println("Hello, Word! \nResult you sum is: " + soma);      
    };
};