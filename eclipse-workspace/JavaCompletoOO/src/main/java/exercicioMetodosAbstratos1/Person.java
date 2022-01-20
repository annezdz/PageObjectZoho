package exercicioMetodosAbstratos1;

public abstract class Person {

    private String name;
    private Double annualIncome;

    public Person() {}

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public abstract double calculateTax();

    @Override
    public String toString() {
        return name + " : $ " + String.format("%.2f%n",calculateTax());
    }
}
