package src.Section10;

public class StockEx87 {
    private final int id;
    private String nameProduct;
    private int quantity;

    //construtor
    public StockEx87(int id, String nameProduct, int quantity) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.quantity = quantity;
    }

    public StockEx87(int id, String nameProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        quantity = 0;
    }

    //getters e setters
    public int getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    //metodos
    public void add(int qtd) {
        quantity += qtd;
    }

    public void remove(int qtd) {
        quantity -= qtd;
    }

    //toString
    public String toString() {
        return id + ", " + nameProduct + ", " + quantity;
    }
}
