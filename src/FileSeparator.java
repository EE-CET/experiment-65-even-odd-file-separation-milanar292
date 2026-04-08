import java.io.*;
import java.util.*;

public class FileSeparator {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("numbers.txt"));
            PrintWriter evenWriter = new PrintWriter("even.txt");
            PrintWriter oddWriter = new PrintWriter("odd.txt");

            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num % 2 == 0)
                    evenWriter.print(num + " ");
                else
                    oddWriter.print(num + " ");
            }

            sc.close();
            evenWriter.close();
            oddWriter.close();

            BufferedReader brEven = new BufferedReader(new FileReader("even.txt"));
            String line;
            System.out.print("Even File: ");
            while ((line = brEven.readLine()) != null) {
                System.out.print(line);
            }
            brEven.close();

            BufferedReader brOdd = new BufferedReader(new FileReader("odd.txt"));
            System.out.print("\nOdd File: ");
            while ((line = brOdd.readLine()) != null) {
                System.out.print(line);
            }
            brOdd.close();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
