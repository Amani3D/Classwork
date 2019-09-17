package momo;

public class GradeCalcTest {
    public static void main(String[] args) {

        GradeCalc course1 = new GradeCalc("Calc");
        course1.GetMinimumGrade(new int[] {50, 40, 90, 75, 24});
        course1.getMaximumGrade(new int[] {50, 40, 90, 75, 24});
        course1.getAverageGrade(new int[] {50, 40, 90, 75, 24});


        System.out.println(course1);

    }
}
