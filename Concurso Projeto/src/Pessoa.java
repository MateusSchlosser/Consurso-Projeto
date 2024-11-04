public class Pessoa {
    public String nome;
    public double notaEtapa1;
    public double notaEtapa2;

    public Pessoa(String nome, double notaEtapa1, double notaEtapa2) {
        this.nome = nome;
        this.notaEtapa1 = notaEtapa1;
        this.notaEtapa2 = notaEtapa2;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaEtapa1() {
        return notaEtapa1;
    }

    public double getNotaEtapa2() {
        return notaEtapa2;
    }

    public double calcularMedia() {
        return (notaEtapa1 + notaEtapa2) / 2.0;
    }

    public boolean isAprovado() {
        return calcularMedia() >= 70.0;
    }
}
