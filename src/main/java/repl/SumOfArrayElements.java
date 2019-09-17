package repl;

public class SumOfArrayElements {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int x=0; x < numbers.length; x++){
            sum = sum + numbers[x];
        }
        System.out.println(sum);
        }


    }





