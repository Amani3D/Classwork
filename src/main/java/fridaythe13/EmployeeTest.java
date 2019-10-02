package fridaythe13;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Peter", 20.0f, 1000.00, LocalDate.of(2012, 8, 24), new Personality("Left Brain", "Red"), new Cars("Blue"));
        System.out.println(salariedEmployee.getPaymentAmount());

        Vendor vendor = new Vendor(200, 10.0);
        System.out.println(vendor.getPaymentAmount());

        //Person person = new Person("David");

        //Person person2 = new Entrepreneur("Mikaila", 500, 2300);

        //person2 = new Employee("Mikaila01", 40f);
        //System.out.println(person2);

//        ((Employee) person2).calculatePay();
//
//        System.out.println(person2 instanceof Person);
//
//        getPersonName(person2);

        //Person[] people = {person, person2};

        //for (Person p : people) {
            //System.out.println(p);
        }



//    public static void getPersonName(Person person) {
//        if(person instanceof Employee) {
//            System.out.println(person.getName() + " has a boss");
//        } else if(person instanceof Entrepreneur) {
//            System.out.println(person.getName() + " is living their best life");
//        } else {
//            System.out.println("You're a person with no job or biz");
//        }
    }


//        Entrepreneur entrepreneur = new Entrepreneur("Joe");
//
//        System.out.println(entrepreneur);

//        SalariedEmployee salariedEmployee = new SalariedEmployee("Mike", 25.00f, 30, LocalDate.of(2017, 3, 12), new Personality("Left Brain", "Red"), new Cars("Silver"));
//
//
//        System.out.println(salariedEmployee);


        //Employee employee = new Employee("James", 0.0f, 15);
        //employee.calculatePay();

//        employee.sex = "M";
//        employee.setPronoun("Him");
//        System.out.println(employee.getPronoun());


        //invoke or call the method on the object
        //object.method()

        //int x = 10;
        //Employee employee1 = new Employee("Najae", 40.0f, 20.00);
        //employee1.calculatePay();

        //Employee employee2 = new Employee("Bill", 70.0f, 40.00);
        //employee2.calculatePay();

        //Employee employee3 = new Employee("David", 50.0f, 70.00);
        //employee3.calculatePay();

//        Employee employee4 = new Employee("Mike", 20.0f, 40.0);
//        employee4.hourlyRate = 20.0;
//        employee4.setHourlyRate(9.00);




        //System.out.println(employee1);
        //System.out.println(employee2);
        //System.out.println(employee3.calculatePay(41));
        //System.out.println(employee);



