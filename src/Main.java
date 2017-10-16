import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(1, "pancho", "saavedra");
        Person person2 = new Person(2, "francisco", "juanito");
        Person person3 = new Person(3, "gaston", "lolazo");

        List<Person> people = new LinkedList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println("desordenado");
        people.forEach(System.out::println);

        people.sort(Person::compareTo);

        System.out.println("ordenado");
        people.forEach(System.out::println);

    }
}
