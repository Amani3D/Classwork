package repl;



public class GetAverage {
    public static void main(String[] args) {

            int[] getAverage = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int total = 0;
            int average = 0;

            for (int x = 0; x < getAverage.length; x++){
                total = total + getAverage[x];
            }
        average = total / getAverage.length;

        System.out.println(average);
    }

}
