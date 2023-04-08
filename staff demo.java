
//program 4
import java.util.Scanner;

class Staff {
    String staffID, name;
    long phoneNo;
    double salary;

    void readstaffdetails() {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the staff ID");
        staffID = userinput.next();
        System.out.println("Enter the name of the staff");
        name = userinput.next();
        System.out.println("Enter the phoneNo ofthe staff");
        phoneNo = userinput.nextLong();
        System.out.println("Enter the salary of the staff");
        salary = userinput.nextDouble();
    }

    void displaystaffdetails() {
        System.out.println("The staff ID is : " + staffID);
        System.out.println("The name of the staff is : " + name);
        System.out.println("The phone no of the staff is : " + phoneNo);
        System.out.println("The salary of the staff is : " + salary);
    }
}

class Teaching extends Staff {
    String domain;
    int NoOfPublication;

    void readstaffdetails() {
        System.out.println("<---------------Enter the teaching staff details------------->");
        super.readstaffdetails();
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the domian");
        domain = userinput.next();
        System.out.println("Enter the no of publications of the staff");
        NoOfPublication = userinput.nextInt();
    }

    void displaystaffdetails() {
        System.out.println("<------------Teaching staff details----------------->");
        super.displaystaffdetails();
        System.out.println("The domain of the staff is : " + domain);
        System.out.println("The no of publications of the staff is : " + NoOfPublication);
    }

}

class Technical extends Staff {
    String skills[] = new String[5];
    int n;

    void readstaffdetails() {

        System.out.println("<---------------Enter the teachnical staff details------------->");
        super.readstaffdetails();
        Scanner userinput = new Scanner(System.in);
        System.out.println("enter no of skills");
        n = userinput.nextInt();
        System.out.println("Enter the skills of the staff");
        for (int i = 0; i < n; i++) {
            skills[i] = userinput.next();
        }
    }

    void displaystaffdetails() {

        System.out.println("<------------Teachnical staff details----------------->");
        super.displaystaffdetails();
        System.out.println("The skill of the Staff is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(skills[i]);
        }
    }
}

class Contract extends Staff {
    float period;

    void readstaffdetails() {
        System.out.println("<---------------Enter the contract staff details------------->");
        super.readstaffdetails();
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the time period of the staff");
        period = userinput.nextFloat();
    }

    void displaystaffdetails() {
        System.out.println("<------------contract staff details----------------->");
        super.displaystaffdetails();
        System.out.println("The contract period of staff is: " + period);
    }

}

public class staffdemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Teaching t = new Teaching();
        Technical te = new Technical();
        Contract c = new Contract();

        t.readstaffdetails();
        te.readstaffdetails();
        c.readstaffdetails();

        t.displaystaffdetails();
        te.displaystaffdetails();
        c.displaystaffdetails();

    }

}
