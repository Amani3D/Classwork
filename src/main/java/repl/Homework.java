package repl;

public class Homework {
    public static void main(String[] args) {

        System.out.println(printOddNumbersInRange(15, 3));

                }
    public static String printOddNumbersInRange(int start, int end){
        String result = "";

        for (int i = start; i >= end; i--) {
            if(i % 2 != 0){
                result += i;


            }

        }

        return result;

    }

        }





