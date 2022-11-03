import com.company.Person;
import java.util.*;
import java .util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Vanga", "Gouthami", 25),
                new Person("Matta", "Harshita", 30),
                new Person("Chilusani", "Sharishma", 35),
                new Person("Jathothu", "Parvati", 40),
                new Person("Vanga", "Vinay", 19)
        );
        //step1: Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        //step2: Create a method that prints all elements in the list
        System.out.println("printing all persons");
        printAll(people);
        //step3: Create a method that prints all people that have last name beginning with V

        System.out.println("printing all persons that have last name beginning with V");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("V");
            }
        });
        System.out.println("printing all persons with first name beginning with V");
        printConditionally(people, new Condition() {
        @Override
        public boolean test(Person p){
            return p.getFirstName().startsWith("V");
        }
    });
    }

    private static void printConditionally(List<Person> people,Condition condition){
        for(Person p : people){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }
    private static void printAll(List<Person> people) {
        for (Person p:people){
            System.out.println(p);
        }
    }
}

interface Condition{
    boolean test(Person p);
}