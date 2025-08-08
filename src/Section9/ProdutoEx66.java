package src.Section9;

public class ProdutoEx66 {
    private String nome;
    private double preco;
    private int quantidade;
    private double valorTotalEstoque;

    //construtor
    public ProdutoEx66() {

    }

    public ProdutoEx66(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        adicionarEstoque(quantidade);
    }

    public ProdutoEx66(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //métodos
    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double valorTotalEstoque() {
        return valorTotalEstoque = quantidade * preco;
    }

    //toString
    public String toString() {
        return "Produto: "
                + nome
                + ", R$ "
                + String.format("%.2f",preco)
                + ", Quantidade: "
                + quantidade;
    }
}
