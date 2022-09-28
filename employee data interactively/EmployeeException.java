//EmployeeException.java
package Pack;

public class EmployeeException extends Exception {
    String errorMessage;

    EmployeeException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String toString() {
        return errorMessage;
    }
}
