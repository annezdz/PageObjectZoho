package exemploHerancaMultipla.devices;

public class Program {

    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        ConcreteScanner scanner = new ConcreteScanner("2003");
        scanner.processDoc("My email");
        System.out.println("Scan result : " + scanner.scan());

        ComboDevice comboDevice = new ComboDevice("2081");
        comboDevice.processDoc("My dissertation");
        comboDevice.print("My dissertation");
        System.out.println(comboDevice.scan());
    }
}
