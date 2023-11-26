package L08;

import java.util.Scanner;

class Employee {

    Scanner scanner = new Scanner(System.in);
    final int id = scanner.nextInt();
    final String name = scanner.nextLine();
    final String lastName = scanner.nextLine();
    double salary;

    public String getName() {
        return (name + " " + lastName);
    }
    public double getAnnualSalary() {
        return (salary);
    }
    double raiseSalary(double raise) {
        salary += salary*raise/100;
        return salary;
    }
}
