package exercicioMetodosAbstratos1;

public class CompanyPerson extends Person{

    private int numberEmployees;

    public CompanyPerson() {}

    public CompanyPerson(String name, Double annualIncome, int numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    @Override
    public double calculateTax() {
        return (numberEmployees > 10) ? getAnnualIncome() * .14 : getAnnualIncome() * .16;
    }
}
