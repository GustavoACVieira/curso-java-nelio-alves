package src.Section8;

public class TrilhaSonoraEx59 {
    public String nome;
    public int duracao;
    public double avaliacao;
    public int qtdAvaliacoes;

    public void avaliarNota(double nota) {
        this.avaliacao = (avaliacao * (qtdAvaliacoes - 1) + nota) / qtdAvaliacoes;
    }

    @Override
    public String toString() {
        return nome + " (" + duracao + "min) - Avaliação média: " + String.format("%.2f",avaliacao) + "/" + qtdAvaliacoes;
    }
}
