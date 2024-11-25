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
        } else if (x < 10) {
            System.out.println("Value of X is less than 10");
        } else {
            System.out.println("Value of X is more than 10");
        }

        int y = 50;
        // Nested if-else example
        if (x == 100) {
            if (y > 30) {
                System.out.println("X is 100 and Y is more than 30");
            }
        }

        // Switch Example
        switch (x) {
            case 50:
                System.out.println("X is 50");
                break;
            case 60:
                System.out.println("X is 60");
                break;
            case 100:
                System.out.println("X is 100");
                break;
            default:
                System.out.println("X has a different value");
        }


    }
}
