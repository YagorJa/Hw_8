package Task1;

public class Test {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(3);
        Therapist therapist = new Therapist();
        therapist.setDoctor(patient1);
        therapist.setDoctor(patient2);

    }
}
