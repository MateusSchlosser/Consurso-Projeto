import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private List<Pessoa> participantes;

    public Concurso() {
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Pessoa pessoa) {
        participantes.add(pessoa);
    }

    public List<Pessoa> getParticipantes() {
        return participantes;
    }

    public List<Pessoa> getAprovados() {
        List<Pessoa> aprovados = new ArrayList<>();
        for (Pessoa p : participantes) {
            if (p.isAprovado()) {
                aprovados.add(p);
            }
        }
        return aprovados;
    }

    public double calcularPorcentagemAprovacao() {
        if (participantes.isEmpty()) {
            return 0.0;
        }
        return (getAprovados().size() / (double) participantes.size()) * 100;
    }

    public Pessoa getPessoaMaiorMedia() {
        Pessoa maiorMedia = participantes.get(0);
        for (Pessoa p : participantes) {
            if (p.calcularMedia() > maiorMedia.calcularMedia()) {
                maiorMedia = p;
            }
        }
        return maiorMedia;
    }

    public double calcularMediaAprovados() {
        List<Pessoa> aprovados = getAprovados();
        if (aprovados.isEmpty()) {
            return -1; // Indica que não há aprovados
        }
        double somaMedias = 0.0;
        for (Pessoa p : aprovados) {
            somaMedias += p.calcularMedia();
        }
        return somaMedias / aprovados.size();
    }
}
