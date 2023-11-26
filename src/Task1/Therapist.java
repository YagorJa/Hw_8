package Task1;

public class Therapist extends Doctor {


    @Override
    public void recovery() {
        System.out.println("Я лечу людей бумагами и даю больничный");
    }
    public void setDoctor(Patient patient){
        switch (patient.getRecoveryPlan()) {
            case 1 -> patient.setDoctor(new Surgeon());
            case 2 -> patient.setDoctor(new Dentist());
            default -> patient.setDoctor(new Therapist());
            // default -> patient.setDoctor(this);
        }
        patient.getDoctor().recovery();
    }
}
