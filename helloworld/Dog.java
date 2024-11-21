package helloworld;

public class Dog {

    int dogAge;

    public Dog(String name) {
        // This is the constructor and there's one one parameter, the name
        System.out.println("The name of the dog is: " + name);
    }

    public void setAge(int age) {
        dogAge = age;
    }

    public int getAge() {
        System.out.println("The age of the dog is: " + dogAge);
        return dogAge;
    }

    public static void main(String[] args) {
        // Create an object
        Dog Canis = new Dog("Jack");

        // Call the class method setAge to set the dog's age
        Canis.setAge(3);

        // Call the class method getAge to get the dog's age
        Canis.getAge();

        // Can also access instance variable as follows:
        System.out.println("The age of the dog is " + Canis.dogAge);

    }
    
}
