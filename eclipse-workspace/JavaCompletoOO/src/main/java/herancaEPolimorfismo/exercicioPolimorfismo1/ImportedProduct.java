package herancaEPolimorfismo.exercicioPolimorfismo1;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct() {};

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return price + customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    @Override
    public String priceTag() {
        return name + " $ " + totalPrice() + " (Customs fee : $ " + customsFee + ")";
    }
}
