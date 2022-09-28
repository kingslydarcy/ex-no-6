//EmployeeMessages.java
package Pack;

public class EmployeeMessages {
    String arr[] = new String[6];

    EmployeeMessages() {
        arr[0] = "Entered number is not numeric";
        arr[1] = "Entered number is less than 1000";
        arr[2] = "Entered number is greater than 9999";
        arr[3] = "Hourly pay rate is not numeric";
        arr[4] = "Hourly pay rate is less than $9.00";
        arr[5] = "Hourly pay rate is greater than $25.00";
    }

    String[] getMessageArray() {
        return arr;
    }
}
