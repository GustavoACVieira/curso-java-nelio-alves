package src.Section9;

public class ContaBancariaEx64 {
    public static final double TAX = 5.00;

    private String id;
    private String name;
    private double balance;

    //construtores
    public ContaBancariaEx64() {

    }

    public ContaBancariaEx64(String id, String name, double initialDeposit) {
        this.id = id;
        this.name = name;
        accountDeposit(initialDeposit);
    }

    public ContaBancariaEx64(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters e setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    //métodos
    public void accountDeposit(double deposit) {
        balance += deposit;
    }

    public void accountWithdrawal(double withdrawal) {
        balance -= (withdrawal + TAX);
    }

    //toString
    @Override
    public String toString() {
        return "Account "
                + id
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
