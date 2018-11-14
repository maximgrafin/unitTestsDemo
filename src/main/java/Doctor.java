import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human {
    public List<IHaveAName> patients = new ArrayList<IHaveAName>();

    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getFullName() {
        return "Dr. " + lastName;
    }

    public void addPatient(IHaveAName patient) {
        for (IHaveAName another_patient : patients) {
            if (another_patient.equals(patient)) {
                System.out.println("The patient " + patient + " is already registerd");
                return;
            }
        }
        patients.add(patient);
    }
}

