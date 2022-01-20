package herancaEPolimorfismo.exercicioPolimorfismo1;

public class Product {

    protected String name;
    protected Double price;

    public Product() {}

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "$ " + String.format("%.2f",price));
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
