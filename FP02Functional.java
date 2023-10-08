import java.util.List;

public class FP02Functional{

    public static void main(String[] args) {
    
        List <String> list = List.of("Apple", "Banana", "Cat", "Dog");

        PrintAllStrings(list);

        // for (String string:list){
        //     System.out.println(string);
        // }
    }
    
    public static void PrintAllStrings(List<String>list){

        list.stream()
        .forEach(System.out::println);
    }

}