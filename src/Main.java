interface Animal {
    void sound();
    void move();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks!");
    }

    public void move() {
        System.out.println("Dog runs!");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows!");
    }

    public void move() {
        System.out.println("Cat walks silently!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myDog.move();

        myCat.sound();
        myCat.move();
    }
}
