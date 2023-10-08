import java.util.stream.IntStream;

public class FP03Comp333 {
    public static void main(String[] args) {
    //System.out.println(question1(70));
    System.out.println(question2(2));

    }

   static double question1(int n){
        return IntStream
        .range(1, n+1)
        .mapToDouble(x -> (double) x / (x * x))
        .sum();
    }
       static double question2(int n){
        return IntStream
        .range(1, n+1)
        .mapToDouble(x -> 6 + (x * x))
        .sum();
    }
    static double question3(int n){
        return IntStream
        .range(1, n+1)
        .mapToDouble(x -> (3/x) +x)
        .sum();
    }
}
