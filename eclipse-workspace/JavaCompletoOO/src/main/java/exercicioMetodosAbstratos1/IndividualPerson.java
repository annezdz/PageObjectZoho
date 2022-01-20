package exercicioMetodosAbstratos1;

public class IndividualPerson extends Person{

    private double medicalExpenses = 0.0;


    public IndividualPerson(){}

    public IndividualPerson(String name, Double annualIncome, double medicalExpenses) {
        super(name, annualIncome);
        this.medicalExpenses = medicalExpenses;
    }

    public double getMedicalExpenses() {
        return medicalExpenses;
    }

    @Override
    public double calculateTax() {
        double calculateTax = 0.0;
        if(getAnnualIncome() < 20000.00D && medicalExpenses == 0.0) {
            calculateTax = getAnnualIncome() * .15;
        } else {
            calculateTax = getAnnualIncome() * .15 - (medicalExpenses * .5);
        }
        if(getAnnualIncome() >= 20000.00D && medicalExpenses == 0.0) {
            calculateTax = getAnnualIncome() * .25;
        } else {
            calculateTax = getAnnualIncome() * .25 - (medicalExpenses * .5);
        }
        return calculateTax;
    }
}
