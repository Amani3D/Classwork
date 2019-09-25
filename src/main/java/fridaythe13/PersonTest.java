package fridaythe13;

import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        boolean flag = true;

        while (flag) {

            System.out.println("What is your name?");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("Alice") || (userInput.equalsIgnoreCase("Bob"))){
                System.out.println("Welcome " + userInput + "!");

                break;
            }
            counter++;
        }
//        String correctPassword = "password";
//        Scanner scanner = new Scanner(System.in);
//
//        int counter = 0;
//        boolean flag = true;
//
//        while(flag) {
//
//            System.out.println("What is the password?");
//            String userInput = scanner.nextLine();
//
//            if(userInput.equals(correctPassword)) {
//                System.out.println("You are logged in");
//
//                break;
//            }
//            counter++;
//        }
//        flag = false;
//
//        System.out.println("You had " + counter + " wrong attempts");
//
//        }


        //Scanner scanner2 = new Scanner(System.in);
        //System.out.println("The mango is $3.00, would you like this in the bag?");
        //String answer = scanner2.nextLine();
        //System.out.println("Beep");

        //Scanner scanner3 = new Scanner(System.in);
        //System.out.println("The chips are $2.50");
        //String productcost2 = scanner3.nextLine();
        //System.out.println("Beep");

        //Scanner scanner4 = new Scanner(System.in);
        //System.out.println("The cheesecake is $6.00, will that be all?");
        //String productcost3 = scanner4.nextLine();
        //System.out.println("That'll be $11.50");

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Ayo ma! What's your name?");
        //String shortyName = scanner.nextLine();
        //System.out.println("Nice to meet ya " + shortyName);

        //Scanner scanner1 = new Scanner(System.in);
        //System.out.println("Let me get yo numba!");
        //double shortyNumber = scanner.nextDouble();
        //System.out.println("Bet " + shortyName);


        //Person person1 = new Person("Najae", 21);
        //person1.setName("Bill");
    }
}




