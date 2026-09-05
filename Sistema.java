public class Sistema {
    
    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double nota1 = 8;
        double nota2 = 7;
        double media = calcularMedia(nota1, nota2);
        
        exibirResultados(nomeAluno, media);
        verificarSituacao(media);
    }
    
    // Calcula a média entre duas notas
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
    
    // Exibe o nome do aluno e sua média
    public static void exibirResultados(String nomeAluno, double media) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
    }
    
    // Verifica se o aluno foi aprovado ou reprovado
    public static void verificarSituacao(double media) {
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}