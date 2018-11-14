import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoctorTest {
    @Test
    public void givenDoctor_whenGetFullNameCalled_thenDrReturned() {
        Doctor doctor = new Doctor("Gregory", "House");
        assertEquals("Dr. House", doctor.getFullName());
    }
    // assertArrayEquals(... , ...);
    /*
    * Given doctor without patients
    * When add patient
    * Then patient added
    * */

    /*
    * Given doctor with patient
    * When add another patient
    * Then another patient added
    * */

    /*
    * Given doctor with patient
    * When add the same patient
    * Then patient not added
    * */

    /*
    * Given doctor with patient
    * When add another patient with the same name
    * Then another patient not added
    * */

    @Test
    public void givenDoctorWithoutPatient_whenAddPatient_thenPatientAdded() {
        // Given doctor without patients
        Doctor doctor = new Doctor("Gregory", "House");

        // When add patient
        IHaveAName me = new Human("Maksim", "Sadym");
        doctor.addPatient(me);

        // Then patient added
        IHaveAName[] expectedPatients = { me };
        assertArrayEquals(expectedPatients, doctor.patients.toArray());
    }
}

