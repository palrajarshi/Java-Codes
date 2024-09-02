class Animal {

    void sound() {
        System.out.println("Sound of Animal");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dogs Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cats Meow");
    }
}

public class dmd {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.sound();
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();

        obj1.sound();
        obj2.sound();
    }
}
