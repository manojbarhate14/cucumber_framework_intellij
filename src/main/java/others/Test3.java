package others;
//The Dog class overrides makeSound() and returns a Dog object, which is a subtype of Animal.
// This is valid due to covariant return types.
// In this way we can achieve method overriding  by changing return type you can use covariant return types for method overriding
class Animal {
    public Animal makeSound() {
        System.out.println("Animal class");
        return new Animal();
    }
}

class Dog extends Animal {
    public Dog makeSound() {
        System.out.println("Dog class");
        return new Dog();
    }
}

public class Test3 extends Dog {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.makeSound();
    }
}
