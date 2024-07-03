/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author 20241014040001
 */
public class Livro {
    /**Atributos da classe:
     - titulo
     - autor 
     - isbn
     - disponivel
     * 
     * Metodos 
     * exibeAtributos
     * verificaDisponibilidade
     * alteraDisponibilidade
     */
    
    private int id1 = 123456789;
    private boolean disponivel1 = true;
    private String titular1 = "Pedro";
    private String titulo1 = "Clean Code";
    private String autor1 = "Java";
    
    /**
    int id = 123456789;
    boolean disponivel = true;
    String titular1 = "Pedro";
    String titulo1 = "Clean Code";
    String autor1 = "Java";
    */
    String message;
    String situacaoDisponivel;
    
    public String exibeAtributos(String titular, String autor, String titulo,boolean disponivel){
        /**
         * Retorna informações chaves do livro
        */
        if (disponivel){
            situacaoDisponivel = "Livro Disponível!";
        } else {
            situacaoDisponivel = "Livro Não Disponível!";
        };
        
        message = "INFORMAÇOES SOBRE O LIVRO!" + "\n" +
                "Com quem está: " + titular + "\n" +
                "Titulo: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Disponibilidade: " + situacaoDisponivel;
        
        return message;
    };
    
    public static void main(String[] args) {
        Livro livro = new Livro();       
        
        System.out.println(livro.exibeAtributos(livro.titular1, livro.autor1, livro.titulo1, livro.disponivel1));        
    }
}
