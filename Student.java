class Student {
    int id;
    String name;
    int age;

    // Creating two-argument constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Creating three-argument constructor
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    void print() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan", 25);
        s1.print();
        s2.display();
    }
}
