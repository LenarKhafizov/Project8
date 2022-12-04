import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(people, new PersonSurnameComparator(1));
        System.out.println(people);
        Collections.sort(people, new PersonSurnameComparator(2));
        System.out.println(people);

    }
}