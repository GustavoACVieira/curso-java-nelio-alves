package src.Section9;

public class PlanoTelefoneEx67 {

    private String numero;
    private double saldo;
    private int minutosUsados;
    private String destinatario;
    private static final double CUSTO_POR_MINUTO = 0.5; // custo de R$0,50 por minuto

    // Construtor
    public PlanoTelefoneEx67(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.minutosUsados = 0; // inicia zerado
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    // Métodos
    public void adicionarCredito(double value) {
        this.saldo += value;
    }

    public void fazerLigacao(int minutos) {
        double custo = minutos * CUSTO_POR_MINUTO;

        if (saldo >= custo) {
            minutosUsados += minutos;
            saldo -= custo;
            System.out.println("Ligação realizada por " + minutos + " minutos.");
        } else {
            System.out.println("Saldo insuficiente para a ligação.");
        }
    }

    public void fazerLigacao(String destino, int minutos) {
        double custo = minutos * CUSTO_POR_MINUTO;

        if (saldo >= custo) {
            minutosUsados += minutos;
            saldo -= custo;
            this.destinatario = destino;
            System.out.println("Ligação para " + destino + " realizada por " + minutos + " minutos.");
        } else {
            System.out.println("Saldo insuficiente para a ligação.");
        }
    }

    // ToString
    @Override
    public String toString() {
        return "Número: " + numero +
                "\nSaldo atual: R$ " + String.format("%.2f", saldo) +
                "\nMinutos restantes: " + (int)(saldo / CUSTO_POR_MINUTO) +
                "\nMinutos usados: " + minutosUsados;
    }
}