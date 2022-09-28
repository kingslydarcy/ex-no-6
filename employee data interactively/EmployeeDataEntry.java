//EmployeeDataEntry.java
package Pack;

import java.util.Scanner;

public class EmployeeDataEntry {
    EmployeeException exceptionObj[] = new EmployeeException[6];
    EmployeeMessages data = new EmployeeMessages();
    Scanner scan = new Scanner(System.in);
    int numData;
    double payData;

    EmployeeDataEntry(String num, String pay) {
        for (int i = 0; i < 6; i++) {
            exceptionObj[i] = new EmployeeException(data.getMessageArray()[i]);
        }
        try {
            numData = Integer.parseInt(num);
        } catch (java.lang.NumberFormatException a) {
            System.out.println(exceptionObj[0]);
            return;
        }
        try {
            if (numData < 1000)
                throw new EmployeeException(pay);
        } catch (EmployeeException e) {
            System.out.println(exceptionObj[1]);
            return;
        }

        try {
            if (numData > 9999)
                throw new EmployeeException(pay);
        } catch (EmployeeException e) {
            System.out.println(exceptionObj[2]);
            return;
        }

        try {
            payData = Double.parseDouble(pay);
        } catch (java.lang.NumberFormatException a) {
            System.out.println(exceptionObj[3]);
            return;
        }
        try {
            if (payData < 9.00)
                throw new EmployeeException(pay);
        } catch (EmployeeException e) {
            System.out.println(exceptionObj[4]);
            return;

        }

        try {
            if (payData > 25.00)
                throw new EmployeeException(pay);
        } catch (EmployeeException e) {
            System.out.println(exceptionObj[5]);
        }
    }

    public static void main(String args[]) {
        String num, pay;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number :");
        num = scan.next();
        System.out.println("Enter pay value :");
        pay = scan.next();
        EmployeeDataEntry obj = new EmployeeDataEntry(num, pay);
    }
}
