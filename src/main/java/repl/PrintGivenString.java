package repl;

public class PrintGivenString {
    public static void main(String[] args) {

        System.out.println(printGivenStringTimesNumberGiven("Ha", 3));


    }

    public static String printGivenStringTimesNumberGiven(String str, int n) {

        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += str;




        }


        return answer;

    }
}

