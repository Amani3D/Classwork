package repl;

public class ExtractAllEvenNumbers {
    public static void main(String[] args) {

        int[] input ={2, 5, 6, 7, 23, 4, 8, 12, 9};

        System.out.println(extractAllEvenNumbers(input));



    }

    public static String extractAllEvenNumbers(int[] numbers) {

        String answer = "";

        for(int x = 0; x < numbers.length; x++){
            if(numbers[x] % 2 == 0){
                answer += numbers[x] + ", ";



            }
        }


// substring - starting and ending point given, answer.length - the length of the array but second to last so that the comma will end after the last number
    answer = answer.substring(0, (answer.length()-2));
    return answer;
    }

}
