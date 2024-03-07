/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.

Exemplo de Entrada	Exemplo de Saída
7 21 -14

-14
7
21

7
21
-14
*/
import java.util.Scanner;

public class Crescente{
  public static void main(String[] args){
       
    int maiorNumero = 0;
    int menorNumero = 0;
    int entrada     = 0;
    int entrada1    = 0;
    int entrada2    = 0;
    int entrada3    = 0;
    
    Scanner scanner = new Scanner(System.in);
    
    for (int i = 0; i < 3; i++) {
      
      System.out.println("Insira os valores: ");
      entrada = scanner.nextInt();  
      // ordem crescente
      if (entrada > maiorNumero) maiorNumero = entrada;
      if (entrada < menorNumero) menorNumero = entrada;
      // ordem das entradasd inseridas
      if (i == 0) entrada1 = entrada;
      if (i == 1) entrada2 = entrada;
      if (i == 2) entrada3 = entrada;
    }    
    System.out.println("--------SAÍDA--------");
    // menor pro maior
    System.out.println(menorNumero + "\n" + entrada + "\n" + maiorNumero + "\n");
    // ordem de entrada
    System.out.println(entrada1 + "\n" + entrada2 + "\n" + entrada3);
    
    scanner.close();
  }
}
