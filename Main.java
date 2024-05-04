import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Jan Kowalski", 30);
            System.out.println("Imię: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

       
        int a = 10;
        int b = 20;
        int sum = MathUtils.add(a, b);
        System.out.println("Suma: " + sum);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Suma " + a + " i " + b + " wynosi: " + sum);
    }
}