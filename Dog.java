class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String atgs[]) {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();
    }
}
