package homiework;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Aubrey", "Boyce", 823);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Bill", "Brown", 214, 2000.0);
        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("Najae", "Sherwood", 569, 80, 5000);
        BasePlusEmployee basePlusEmployee = new BasePlusEmployee("David", "Clark", 792, 7000, 100, 60);

        Employee[] Employees = {salariedEmployee, commissionedEmployee, basePlusEmployee, employee};

        for (Employee e : Employees) {
            System.out.println(e);

        }
    }
}
