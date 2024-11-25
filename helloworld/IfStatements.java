package helloworld;

public class IfStatements {
    public static void main(String[] args) {
        int x = 10;
        
        // Simple If statement
        if (x < 20) {
            System.out.println("X is less than 20");
        }

        // If-else statement 
        if (x == 10) {
            System.out.println("Value of X is 10");
        } else if (x > 10) {
            System.out.println("Value of X is less than 10");
        } else {
            System.out.println("Value of X is more than 10");
        }
    }
}
