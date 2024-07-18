/**
 * 2. Uma Disciplina
 * A classe deve ter atributos para armazenar o nome da disciplina e as notas dos dois bimestres e da prova final. Os
 * métodos da classe devem permitir calcular a média parcial (com as notas bimestrais) e a média final (com todas as notas,
 * caso o aluno tenha ficado na prova final). Considere como média de aprovação o valor 60, notas de 0 a 100, média
 * parcial ponderada com pesos 2 e 3 e média final como a média aritmética da média parcial
 * com a nota da prova final, caso o aluno não seja aprovado por média.
 * Escrever um programa para testar a classe.
 * */

public class Disciplina {
    /**
     * atributos para armazenar o nome da disciplina e as notas dos dois bimestres e da prova final
     * */
    private String nome;
    private double nota1b = 0, nota2b = 0, nota_prova_final = 0;
    protected int peso1 = 2, peso2 = 3;

    public Disciplina(String nome, double nota1b, double nota2b) {
        setNome(nome);
        setNota1b(nota1b);
        setNota2b(nota2b);
    }

    public Disciplina(String nome, double nota1b, double nota2b, double nota_prova_final) {
        setNome(nome);
        setNota1b(nota1b);
        setNota2b(nota2b);
        setNota_prova_final(nota_prova_final);
    }
    /**
     *  Os
     *  métodos da classe devem permitir calcular a média parcial (com as notas bimestrais) e a média final (com todas as
     *  notas, caso o aluno tenha ficado na prova final). Considere como média de aprovação o valor 60, notas de 0 a 100,
     *  média parcial ponderada com pesos 2 e 3 e média final como a média aritmética da média parcial
     *  com a nota da prova final, caso o aluno não seja aprovado por média.
     *  Escrever um programa para testar a classe.
     *  */

    public double mediaParcial(double nota1b, double nota2b) {

        return ((nota1b * peso1) + (nota2b * peso2)) / (peso1 + peso2);
    }

    public double mediaFinal(double nota1b, double nota2b, double nota_prova_final) {
        return ((nota1b * peso1) + (nota2b * peso2) + nota_prova_final)/(peso1 + peso2);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1b() {
        return this.nota1b;
    }
    public void setNota1b(double nota1b) {
        this.nota1b = nota1b;
    }

    public double getNota2b() {
        return this.nota2b;
    }
    public void setNota2b(double nota2b) {
        this.nota2b = nota2b;
    }

    public double getNota_prova_final() {
        return this.nota_prova_final;
    }
    public void setNota_prova_final(double nota_prova_final) {
        this.nota_prova_final = nota_prova_final;
    }

    public String toString() {
        return "Nome: " + getNome() + "\n" +
               "1 Bimestre: " + getNota1b() + "\n" +
               "2 Bimestre: " + getNota2b() + "\n" +
               "Prova Final: " + getNota_prova_final() + "\n" +
               "Media Parcial: " + mediaParcial(getNota1b(), getNota2b()) + "\n" +
               "Media Final: " + mediaFinal(getNota1b(), getNota2b(), getNota_prova_final()) + "\n";
    }
}
