package helloworld;

public class Arrays {
    public static void main(String[] args) {
        double[] myFirstArray = {1.4, 2.3, 3.5, 4.6};

        System.out.println(myFirstArray.length);

        // Print all of the elements of myFirstArray
        for (int i = 0; i < myFirstArray.length; i++) {
            System.out.println(myFirstArray[i]);
        }

        // Print all elements of myFirstArray with foreach loop
        for (double element: myFirstArray) {
            System.out.println(element);
        }

        // Summing all elements of myFirstArray
        double sum = 0;
        for (int i = 0; i < myFirstArray.length; i++) {
            sum = sum + myFirstArray[i];
            System.out.println(sum);
        }

        // Find the smallest element
        double min = myFirstArray[0];
        for (int i = 0; i < myFirstArray.length; i++) {
            if (myFirstArray[i] < min)
                min = myFirstArray[i];

            System.out.println("Minimum value is " + min);
            System.out.println("The total value is " + sum);
        }
    }
}
