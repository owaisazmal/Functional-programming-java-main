import java.util.stream.IntStream;

public class FP03Comp333 {
    public static void main(String[] args) {
    //System.out.println(question1(70));
    //System.out.println(question2(2));
    System.out.println(question3(2));

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
        .mapToDouble(x -> (double)(3/x) + (double)x)
        .sum();
    }
    static double question4(int n){
        return IntStream
        .range(1, n+1)
        .mapToDouble(x -> (double)x)
        .sum();
    }
}

/*Topic: Languages are designed for single core programming

I think developing new programming languages and tools that are specifically designed for parallel programming is the solution to the mismatch between single-core programming languages and parallel hardware. Functional programming is a promising approach, but it is still in its early stages and is not widely used. We need to create new functional programming languages and tools that are more useful and efficient in everyday situations. Along with new programming languages, we need to create new tools and compilers to assist programmers in writing and optimizing parallel code. These tools should be capable of automatically identifying and parallelizing code sections, as well as generating efficient code for a wide range of parallel hardware architectures.

 

CITATION

"The von Neumann Architecture: Is It Time for a Change?" by David Patterson, IEEE Computer, January 2004.
"The Rust Programming Language" by Steve Klabnik and Carol Nichols, O'Reilly Media, 2018. */
