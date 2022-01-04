package ooppt1;

class DogOver {


    // Overriding - same name and same parameters
    public void bark() {
        System.out.println("woof");
    }
}

class GermanSheperd extends DogOver {

    @Override
    public void bark() {
        System.out.println("Woof Woof");
    }
}

