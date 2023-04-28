//student details
import java.util.Scanner;

public class Student {
    String USN;
    String name;
    String branch;
    long phoneNo;

    Student(String u, String n, String b, long ph) {
        USN = u;
        name = n;
        branch = b;
        phoneNo = ph;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String u;
        String n;
        String b;
        long p;

        System.out.println("enter the number of students:");
        Scanner input = new Scanner(System.in);
        int studentNo = input.nextInt();
        Student s[] = new Student[5];

        for (int i = 0; i < studentNo; i++) {
            System.out.println("enter the USN of the student " + (i + 1));
            u = input.next();
            System.out.println("enter the name of the student " + (i + 1));
            n = input.next();
            System.out.println("enter the branch of the student " + (i + 1));
            b = input.next();
            System.out.println("enter the phoneNo of the student " + (i + 1));
            p = input.nextLong();

            s[i] = new Student(u, n, b, p);

        }
        System.out.println("<------------STUDENTS DETAILS------------>");
        System.out.println("USN\t\tNAME\t\tBRANCH\t\tPHONE NO");

        for (int i = 0; i <= studentNo; i++) {
            System.out.println(s[i].USN + "\t\t" + s[i].name + "\t\t" + s[i].branch + "\t\t" + s[i].phoneNo);
        }

    }

}
