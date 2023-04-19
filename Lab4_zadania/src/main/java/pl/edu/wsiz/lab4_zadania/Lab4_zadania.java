/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pl.edu.wsiz.lab4_zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author arono
 */
public class Lab4_zadania {

    public static void main(String[] args) {
       
         MyInterface myLambda = (message) -> System.out.println("Message: " + message);
        myLambda.printMessage("Hello LAMBDA!");
   
System.out.println("================================================");
System.out.println("Kolekcja zawierająca liczby - wypisz elementy parzyste");
       
 List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        
        System.out.println("================================================");
        System.out.println("Kolekcja zawierająca liczby – wypisz najmniejszą wartość spośród elementów parzystych");
        
        
         List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int minEven = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number % 2 == 0 && number < minEven) {
                minEven = number;
            }
        }
        if (minEven != Integer.MAX_VALUE) {
            System.out.println(minEven);
        }
         System.out.println("================================================");
      
        int start = 4;
        int end = 7;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                System.out.println(number);
            } 
        }
         
        
        System.out.println("================================================");
        System.out.println("Kolekcja zawierająca liczby - wypisz elementy z podanego zakresu");
        for (int number2 : numbers) {
            if (number2 >= start && number2 <= end) {
                System.out.println(number2);
            }
        } 
        
         System.out.println("================================================");
         System.out.println("Kolekcja osoby - wypisz osoby urodzone po podanym roku(1990)");
       
         int year = 1990;
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Adam", "Nowak", 1993));
        persons.add(new Person("Anna", "Kowalska", 1992));
         persons.add(new Person("Marcelina", "Baran", 1992));
         for (Person person : persons) {
            if (person.getYearOfBirth() > year) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }
   
    System.out.println("================================================");
         System.out.println("Kolekcja osoby - wypisz osoby, których imię zaczyna się od podanego ciągu (np.2 litery), posortuj w kolejności alfabetycznej po nazwisku");
    
            String prefix = "Ma";
    
             persons.add(new Person("Marek", "Kowalczyk", 1987));
    
    List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getFirstName().startsWith(prefix)) {
                filteredPersons.add(person);
            }
        }

        Collections.sort(filteredPersons, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        for (Person person : filteredPersons) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
  
    System.out.println("================================================");
         System.out.println("Ile jest takich osób");
    int count=0;
     for (Person person : persons){
     if (person.getFirstName().startsWith(prefix)){
     filteredPersons.add(person);
     count++;
     }
     
    
     }
    System.out.println("Takich osób jest: "+count);
    
    
    
    
    
    
    }
}
    

     
         
         
         
         
         
         
         
         
         
         
         
      
    

