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
import java.utils.scanner;

public class Crescente{
  public static void main(String[] args){
    
    // ler 3 valores inteiro dentro do laço até 3 valores. Para quando a entrada for maior que maiorNumero, maioNumero recebe entrada, Ter também menor numero, para quando a entra for menor que menorNumero, menorNumero recebe a entrada.
    
    int maiorNumero, menorNumero, entrada, entrada1, entrada2, entrada3 = 0;
    
    for (int i = 0; i < 3; i++)) {
      int entrada = scanner.nextInt();  
      // ordem crescente
      if (entrada > maiorNumero) maiorNumero = entrada;
      if (entrada < menorNumero) menorNumero = entrada;
      // ordem das entradasd inseridas
      if (i = 0) entrada1 = entrada;
      if (i = 1) entrada2 = entrada;
      if (i = 2) entrada3 = entrada;
    }    
    // menor pro maior
    System.out.println(menorNumero, "/n", entrada, "/n", maiorNumero, "/n", " ", "/n");
    // ordem de entrada
    System.out.println(entrada1, "/n", entrada2, "/n", entrada3);
  }
}
