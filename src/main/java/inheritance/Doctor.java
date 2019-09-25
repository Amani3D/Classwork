package inheritance;

public class Doctor {

    public String worksAtHospital;

    public Doctor(String worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }

    public void treatPatient() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "worksAtHospital='" + worksAtHospital + '\'' +
                '}';

    }
}

