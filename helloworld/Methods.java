package helloworld;

public class Methods {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // int z = maxNumber(x, y);
        // System.out.println("Maximum number is " + z);
        printMaxNumber(x, y);
    }

    public static int maxNumber(int a, int b) {
        int max = a;
        if (b > max) {
            max = b;
        }
        return max;
    }

    public static void printMaxNumber(int a , int b) {
        int max = a;
        if (b > max) {
            max = b;
        }
        System.out.println("Maximum number is " + max);
    }
}
