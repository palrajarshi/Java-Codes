class A {
    float salary;
    String name;

    A() {
        salary = 23000;
        name = "Rajarshi";
    }

    A(int Salary, String name) {
        this.salary = Salary;
        this.name = name;
    }

    void display() {
        System.out.println(salary);
        System.out.println(name);
    }
}

public class constructors {
    public static void main(String[] args) {
        A obj = new A(51000, "Harry");
        obj.display();
    }
}
