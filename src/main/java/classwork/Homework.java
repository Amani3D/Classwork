package classwork;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {


        ArrayList<Integer> arrli = new ArrayList<Integer>();

        int correctNumber = 8;
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (true) {

            System.out.println("Guess the number!");
            int userInput = scanner.nextInt();

            if (userInput > correctNumber) {
                System.out.println("Number too large.");
            }
            if (userInput < correctNumber) {
                System.out.println("Number too small");
            }

            if (userInput == correctNumber) {
                System.out.println("Correct Guess!");

                break;
            }


            if (!arrli.contains(userInput))
                counter++;

            arrli.add(userInput);

            System.out.println("You had " + counter + " wrong guesses.");
        }
        System.out.println("You had " + counter + " wrong guesses.");
    }

}


