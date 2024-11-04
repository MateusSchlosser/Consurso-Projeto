public class RelatorioConcurso {
    public static void gerarRelatorio(Concurso concurso) {
        System.out.println("### TABELA ###");
        for (Pessoa p : concurso.getParticipantes()) {
            System.out.printf("%s, %.1f, %.1f, MEDIA = %.2f%n", p.getNome(), p.getNotaEtapa1(), p.getNotaEtapa2(), p.calcularMedia());
        }

        System.out.println("### PESSOAS APROVADAS ###");
        for (Pessoa p : concurso.getAprovados()) {
            System.out.println(p.getNome());
        }

        System.out.printf("Porcentagem de aprovação: %.1f %% %n", concurso.calcularPorcentagemAprovacao());
        System.out.println("Maior média: " + concurso.getPessoaMaiorMedia().getNome());

        double mediaAprovados = concurso.calcularMediaAprovados();
        if (mediaAprovados == -1) {
            System.out.println("Nota média dos aprovados: Não há candidatos aprovados");
        } else {
            System.out.printf("Nota média dos aprovados: %.2f%n", mediaAprovados);
        }
    }
}
