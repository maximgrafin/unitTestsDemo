public class Human implements IHaveAName {
    protected String firstName;
    protected String lastName;

    public Human(String _firstName, String _lastName){
        firstName = _firstName;
        lastName = _lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Human) {
            Human human = (Human) object;
            return lastName.equals(human.lastName)
                   && firstName.equals(human.firstName);
        }
        return false;
    }
}

