import java.util.List;

public class FP01Functional{
public static void main(String[] args) {
    List<String> courses = List.of("Spring", "Microservices", "Docker", "API", "AWS", "PCF", "Spring Boot", "Kubernetes"); 
    List<Integer> of = List.of(12,9,5,1,3,56,156,21,45,23);
    // printEvenNumbersInListFunctional(of);
    // printAllCLoudServicesInListFunctional(courses);
    printSquaresOFEvenNumbersInListFunctional(of);
    }

    private static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer>numbers){
        numbers.stream().forEach(FP01Functional::print);
    }

    private static boolean isEven(int number){
        return number%2 == 0;
    }

    private static void printAllCLoudServicesInListFunctional(List<String>courses){
        
        courses.stream()
        .filter(course-> course.length()>=4)
        .forEach(System.out::println);

    }

    //number -> number%2 == 0
    //number -> number%2 =! 0
    private static void printEvenNumbersInListFunctional(List<Integer>numbers){
        
              numbers.stream()
           // .filter(FP01Functional::isEven)
           //.filter(number -> number%2 == 0) //Lambda Expression
           .filter(number -> number%2 != 0) //Lambda Expression 
           .forEach(FP01Functional::print);
        }

        private static void printSquaresOFEvenNumbersInListFunctional(List<Integer>numbers){
        
              numbers.stream()

           .filter(number -> number%2 != 0) //Lambda Expression 
           .map(number -> number*number)
           //.map(number -> number*number*number)
           .forEach(System.out::println);
        }
        
}