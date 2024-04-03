// Pasta notas
package notas;

import java.util.Scanner;

public class Notas {
    /**
     * Recebendo os dados
     */
    protected static float[] inputs(){
        // declarando array
        float[] notas = new float[2];
        
        // criando objeto scanner
        Scanner objetoScanner = new Scanner(System.in);

        // recebendo inputs
        System.out.print("Insira a nota do PRIMEIRO bimestre: ");
        notas[1] = objetoScanner.nextFloat();

        System.out.print("Insira a nota do SEGUNDO bimestre: ");
        notas[2] = objetoScanner.nextFloat();

        objetoScanner.close();

        return notas;
    }
    
    /**
     * Exibindo os resultados  
     */    
    public static void main(String[] args) {
        //inicializar array para receber notas da função
        float[] notasMain = new float[2];
        float mediaFinal = 0;

        System.out.println("---CALCULADORA DE MÉDIAS DE NOTAS---");
        // recebendo os dados
        notasMain = inputs();
        // calculando a média
        mediaFinal = calculaNotas(notasMain[0], notasMain[1]);
        // imprimindo a media
        System.out.println("Sua média foi de: " + mediaFinal);
    }

    /**
     * Calculando notas
     * MD = (2N1 + 3N2)/5
     */
    protected static float calculaNotas(float nota1, float nota2){
        float media = ((2 * nota1) + (3*nota2))/5;
        return media;
    }

}
