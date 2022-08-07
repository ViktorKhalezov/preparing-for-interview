import lesson1.task1.Person;
import lesson1.task1.PersonBuilder;

public class Main {

    public static void main(String[] args) {

        Person person = new PersonBuilder().firstName("Viktor")
                .lastName("Khalezov")
                .middleName("Nikolay")
                .country("Russia")
                .address("Saint-Petersburg")
                .phone("8-911-111-22-33")
                .age(36)
                .gender("male")
                .build();

        System.out.println(person);

    }

}

