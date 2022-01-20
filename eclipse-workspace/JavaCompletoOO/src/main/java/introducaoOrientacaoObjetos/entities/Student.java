package introducaoOrientacaoObjetos.entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double mediaStudent() {

        return grade1 + grade2 + grade3;
    }

    public void result() {
        if(mediaStudent() >= 60.00) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + (60.0 - mediaStudent()) + " PONTS.");
        }
    }

    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f",mediaStudent());
    }

}
