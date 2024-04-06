class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is black");
    }

    public static void main(String atgs[]) {
        Labrador obj = new Labrador();
        obj.eat();
        obj.bark();
        obj.color();
    }
}
