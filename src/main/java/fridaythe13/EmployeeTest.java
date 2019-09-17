package fridaythe13;

public class EmployeeTest {
    public static void main(String[] args) {

        //int x = 10;
        Employee employee1 = new Employee("Najae", 40.0f, 20.00);
        employee1.calculatePay();

        Employee employee2 = new Employee("Bill", 70.0f, 40.00);
        employee2.calculatePay();

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
