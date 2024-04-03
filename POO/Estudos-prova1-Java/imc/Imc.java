// Tem que inserir a pasta que está
package imc;

import java.util.Scanner;
/**
 * Calcular IMC
 */
public class Imc{
    /**
     * 
     * @param args
     */
    public static void main(String[] args){
        // Declarando variaveis em escopo global da função
        float altura = 0;
        float peso   = 0;
        // Leitura dos dados do teclado
        System.out.println("**********CALCULADORA DE IMC**********");
        Scanner objetoScanner = new Scanner(System.in); 

        // Parametros
        try{
            System.out.print("Insira sua altura(M): ");
            altura = objetoScanner.nextFloat();
            
            System.out.print("Insira seu peso(KG): ");
            peso = objetoScanner.nextFloat();
        } catch (Exception e){
            System.out.print("-------Erro na leitura dos dados-------\n" + e);
        }
        
        // Resultado IMC
        float result = calculaImc(altura, peso);
        
        // Exibindo IMC
        System.out.println("Seu IMC é: " + result);
        
        // Fechando objeto scanner
        objetoScanner.close();
    }

    /**
     * Calcula IMC
     * @param altura
     * @param peso
     * @return
     */
    protected static float calculaImc(float altura, float peso){        
        // int imc = (int)(peso / (altura * altura));
        float imc = peso / (altura * altura);
        return imc;
    }

}