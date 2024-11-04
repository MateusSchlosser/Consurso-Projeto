import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a quantidade de pessoas? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        Concurso concurso = new Concurso();

        for (int i = 1; i <= quantidade; i++) {
            System.out.printf("Digite os dados da %da pessoa:%n", i);

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Nota etapa 1: ");
            double notaEtapa1 = scanner.nextDouble();

            System.out.print("Nota etapa 2: ");
            double notaEtapa2 = scanner.nextDouble();
            scanner.nextLine(); // Consome a nova linha

            Pessoa pessoa = new Pessoa(nome, notaEtapa1, notaEtapa2);
            concurso.adicionarParticipante(pessoa);
        }

        RelatorioConcurso.gerarRelatorio(concurso);

        scanner.close();
    }
}
