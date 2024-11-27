package helloworld;

public class Loops {
    public static void main(String arg[]) {
        // Example of for loop
        // (initialization step of loop, boolean expression, the update statement (update any loop control variables)) 
        System.out.println("Example of for loop");
        for (int x = 10; x < 20; x = x+1) { 
            System.out.println(x);
        
        }

        // Example of while loop
        System.out.println("Example of while loop");
        int y = 10;

        while (y < 50) {
            System.out.println(y);
            y++;
        }

        // Example of do...while loop
        System.out.println("Example of do...while loop");
        do {
            System.out.println(y);
            y++;
        } while(y < 50);

        
    }
}
