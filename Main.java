package Main;
//first change
import Employee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Васильев", 50000, true),
                new Employee("Сайкович", 60000, false),
                new Employee("Найден", 55000, true),
                new Employee("Андреенко", 70000, true),
                new Employee("Иванов", 45000, false)
        };

        double averageSalary = Employee.calculateAverageSalary(employees);
        System.out.println("Средняя зарплата: " + averageSalary);

        int employeesWithChildren = Employee.countEmployeesWithChildren(employees);
        System.out.println("Количество служащих с детьми: " + employeesWithChildren);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }
    }
}
