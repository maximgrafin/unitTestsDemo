public class Main {

    public static void main(String[] args) {
        IHaveAName me = new Human("Maksim", "Sadym");
        IHaveAName meToo = new Human("Maksim", "Sadym");
        IHaveAName myFriend = new Human("Sadik", "Hasanovic");
//        IHaveAName myDog = new Pet("dog", "Jimmy");

        Doctor myDoctor = new Doctor("Gregory", "House");

        myDoctor.addPatient(me);
        myDoctor.addPatient(meToo);
        myDoctor.addPatient(myFriend);

        System.out.println("Doctor: " + myDoctor);
        System.out.println("Patients: ");

        for (IHaveAName patient : myDoctor.patients) {
            System.out.println(patient);
        }
    }
}

