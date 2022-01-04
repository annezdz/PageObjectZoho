package ooppt1;


class DogOverl {

    // Overloading - same name diferent parameters

    public void bark() {
        System.out.println("Woof");
    }

    public void bark(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("woof");
        }
    }
}

