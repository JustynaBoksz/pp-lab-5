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

        
        Person[] people = new Person[5];
        final int constantB = 10;

        try {
            
            people[0] = new Person("Ania B", 30);
            people[1] = new Person("Kasia C", 25);
            people[2] = new Person("Marek P", 40);
            people[3] = new Person("Antoni L", 22);
            people[4] = new Person("Zbigniew O", 33);

            
            for (Person eachPerson : people) {
                int agePlusB = MathUtils.add(eachPerson.getAge(), constantB);
                messenger.sendMessage(eachPerson.getName() + " age plus " + constantB + " is: " + agePlusB);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}