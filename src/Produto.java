public class Produto {
    private String item;
    private double preco;


    public Produto(String item, double preco) {
        this.item = item;
        this.preco = preco;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "item='" + item + '\'' +
                ", preco=" + preco +
                '}';
    }
}
