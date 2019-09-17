package momo;

public class GradeCalc {

    public String courseName;

    public GradeCalc(String courseName){
        this.courseName = courseName;
    }

    int[] grdav = {50, 40, 90, 75, 24};

    public void GetMinimumGrade(int[] grades){
        int minValue = grades[0];
        for(int x = 1; x < grades.length; x++){
            if(grades[x] < minValue) {
                minValue = grades[x];
            }
        }
        System.out.println(minValue);
    }

    public void getMaximumGrade(int[] grades) {
        int maxValue = grades[0];
        for(int a = 1; a < grades.length; a++) {
            if(grades[a] > maxValue) {
                maxValue = grades[a];
            }
        }
        System.out.println(maxValue);
    }

    public void getAverageGrade(int[] average) {
        int[] grdav = {50, 40, 90, 75, 24};
        int total = 0;

        for(int v = 0; v < grdav.length; v++){
            total = total + grdav[1];
        }
        double av = total / grdav.length;
        System.out.println(av);
    }

    @Override
    public String toString() {
        return "GradeCalc{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}

