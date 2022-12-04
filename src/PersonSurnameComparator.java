import java.util.Comparator;
public class PersonSurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        int surnameCompare = Integer.compare(surname2.length, surname1.length);
        if (surnameCompare == 0) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return surnameCompare;
        }
    }
}
