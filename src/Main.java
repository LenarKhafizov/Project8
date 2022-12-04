import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("\t Домашнее задание по теме: " + "\"Коллекции TreeMap и TreeSet\"");
        List<Person> people = new ArrayList<>();
        people.add((new Person("Иван", "Максимов", 16)));
        people.add((new Person("Виктор", "Апполонов-Краснов", 17)));
        people.add((new Person("Игорь", "Мари Соли Боярт", 15)));
        people.add((new Person("Алексей", "Шувалов", 18)));
        people.add((new Person("Антон", "Андре Себастьян Жардье", 18)));
        Comparator <Person> comparator = (Person o1, Person o2) -> {
            String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            int surnameLength1 = Math.min(surname1.length, 2);
            int surnameLength2 = Math.min(surname2.length, 2);
            int surnameCompare = Integer.compare(surnameLength2, surnameLength1);
            if (surnameCompare == 0) {
                return Integer.compare(o2.getAge(), o1.getAge());
            } else {
                return surnameCompare;
            }
        };
        Collections.sort(people, comparator);
        System.out.println(people);

    }
}