package helloworld;
import java.io.*;

public class Files {
    public static void main (String args[]) throws IOException{
        FileInputStream inputFile = null;
        FileOutputStream outputFile = null;

        try {

        
        inputFile = new FileInputStream("inputTest.txt");
        outputFile = new FileOutputStream("outputTest.txt");

        int c;
        while((c = inputFile.read()) != -1) {
            outputFile.write(c);
        }
        }finally {
            if (inputFile != null) {
                inputFile.close();
            }
            if (outputFile != null) {
                outputFile.close();
            }
        }
    }
}
