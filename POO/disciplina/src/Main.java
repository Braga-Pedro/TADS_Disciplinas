public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Pedro", 4, 5.5, 6);
        System.out.printf(
                "Nome: " + disciplina.getNome() + "\n" +
                "1 Bimestre: " + disciplina.getNota1b() + "\n" +
                "2 Bimestre: " + disciplina.getNota2b() + "\n" +
                "Prova Final: " + disciplina.getNota_prova_final() + "\n" +
                "Media Parcial: " + disciplina.mediaParcial(disciplina.getNota1b(), disciplina.getNota2b()) + "\n" +
                "Media Final: " + disciplina.mediaFinal(disciplina.getNota1b(), disciplina.getNota2b(), disciplina.getNota_prova_final()) + "\n"
        );
    }
}