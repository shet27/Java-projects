//read from csv file
import java.io.*;
import java.util.Scanner;

public class csv {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("file location"));
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();
    }
}
