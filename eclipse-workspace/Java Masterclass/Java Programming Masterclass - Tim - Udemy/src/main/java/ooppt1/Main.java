package ooppt1;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {

//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("911");
//        System.out.println(porsche.getModel());

//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add = " + calculator.getAdditionResult());
//        System.out.println("subtract  = " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply = " + calculator.getMultiplicationResult());
//        System.out.println("divide = " + calculator.getDivisionResult());
//        Person person = new Person();
//        person.setFirstName("");
//        person.setLastName("");
//        person.setAge(10);
//        System.out.println("fullname - " + person.getFullName());
//        System.out.println("isTeen - " + person.isTeen());
//        person.setFirstName("John");
//        person.setAge(18);
//        System.out.println("fullname - " + person.getFullName());
//        System.out.println("isTeen - " + person.isTeen());
//        person.setLastName("Smith");
//        System.out.println("fullname - " + person.getFullName());
//        person.setAge(999);
//        System.out.println(person.getAge());


//        BankAccount bankAccount = new BankAccount();
//        bankAccount.withDray(100);
//        bankAccount.deposit(100);
//        bankAccount.deposit(1);
//        bankAccount.withDray(100);
//        System.out.println(bankAccount.getBalance());
//        BankAccount anne = new BankAccount();
//        System.out.println(anne.getAccountNumber());
//
//        BankAccount dudu = new BankAccount("Dudu","dudu@dudu.com","123456");
//        System.out.println(dudu.getAccountNumber() + " " + dudu.getBalance() + " " + dudu.getCustomerName());

//        bankAccount.setAccountNumber(123);
//        bankAccount.setBalance(1000);
//        bankAccount.setCustomerName("Anne N Z");
//        bankAccount.setEmail("annezdz@hotmail.com");
//        bankAccount.setPhoneNumber("(47) 991069919");
//        System.out.println("Number Account : " + bankAccount.getAccountNumber());
//        System.out.println("Client : " + bankAccount.getCustomerName());
//        System.out.println("email : " + bankAccount.getEmail());
//        System.out.println("Balance : " + bankAccount.getBalance());
//        System.out.println("Telephone : " + bankAccount.getPhoneNumber());
//        bankAccount.deposit(500);
//        System.out.println("Balance : " + bankAccount.getBalance());
//        bankAccount.withDray(2000);
//        System.out.println("Balance : " + bankAccount.getBalance());
//
//        BankAccount bankAccount1 = new BankAccount(123,2000,
//                "Eduardo","lodi001@uol","(47) 991999999");
//
//        System.out.println(bankAccount1.getAccountNumber());
//        System.out.println(bankAccount1.getBalance());

//        BankAccount bank1 = new BankAccount("Bibi","arrora@arroba","(44)44444444");
//        System.out.println(bank1.getBalance());
//        bank1.withDray(100.55);
//
//        Vip vip = new Vip("Anne",50.000);
//        System.out.println(vip.getEmail());
//        System.out.println(vip.getName());
//        System.out.println(vip.getLimit());
//
//        Vip vip1 = new Vip();
//        System.out.println(vip1.getEmail());
//        System.out.println(vip1.getName());
//        System.out.println(vip1.getLimit());
//
//        Vip vip3 = new Vip("Eduardo",9.000,"dudu@dudu");
//        System.out.println(vip3.getEmail());
//        System.out.println(vip3.getName());
//        System.out.println(vip3.getLimit());
//        VipCustomer customer = new VipCustomer();
//        System.out.println(customer.getEmail());
//        System.out.println(customer.getLimit());
//        System.out.println(customer.getName());
//
//        VipCustomer customer1 = new VipCustomer("Anne", "annezdz@hotmail.com");
//        System.out.println(customer1.getName());
//        System.out.println(customer1.getEmail());
//        System.out.println(customer1.getLimit());
//
//        VipCustomer customer2 = new VipCustomer("Eduardo",15.000,"dudu@dudu.com");
//        System.out.println(customer2.getName());
//        System.out.println(customer2.getEmail());
//        System.out.println(customer2.getLimit());
//
//        Wall wall = new Wall(5,4);
//        System.out.println("area =" + wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println("width = " + wall.getWidth());
//        System.out.println("height = " + wall.getHeight());
//        System.out.println("area =" + wall.getArea());
//        wall.setHeight(-1.1);
//        System.out.println("height = " + wall.getHeight());

        Wall wall1 = new Wall(-1.25,-1.25);
        System.out.println("width = " + wall1.getWidth());
        System.out.println("height = " + wall1.getHeight());

        Wall wall = new Wall(-1.1,-1.1);
        System.out.println(wall.getHeight());

//        WallArea wallArea = new WallArea(5,4);
//        System.out.println("area = " + wallArea.getArea());
//        wallArea.setHeight(-1.5);
//        System.out.println("width = " + wallArea.getWidth());
//        System.out.println("heigh = " + wallArea.getHeight());
//        System.out.println("area = " + wallArea.getArea());

//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println("distace (0,0) = " + first.distance());
//        System.out.println("distace (second) = " + first.distance(second));
//        System.out.println("distace (2,2) = " + first.distance(2,2));
//        Point point = new Point();
//        System.out.println("distace () = " + point.distance());
//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor,carpet);
//        System.out.println("Total = " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("Total = " + calculator.getTotalCost());

//        Animal animal = new Animal("Animal",1,1,5,5);
//        Dog dog = new Dog("York",8,20,2,4,20,1,"long silkuy" );
//        dog.eat();
//        dog.walk();
//        dog.run();

//        Outlander outlander = new Outlander(36);
//        outlander.accelerate(30);


    }
}
