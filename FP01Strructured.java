import java.util.List;

public class FP01Strructured{
public static void main(String[] args) {

    //PrintAllNumbersInListStructured(List.of(12,9,5,1,3,56,156,21,45,23));
    List<Integer> numbers = List.of(12,9,5,1,3,56,156,21,45,23);
    PrintEvenNumbersInListStructured(numbers);

    }

    private static void PrintAllNumbersInListStructured(List<Integer> numbers) {
        //How to loop the numbers?
        for(int number:numbers){
            System.out.println(number);
        }
    }
        private static void PrintEvenNumbersInListStructured(List<Integer> numbers) {
        //How to loop the numbers?
        for(int number:numbers){
            if(number%2==0)
            System.out.println(number);
        }
    }
}