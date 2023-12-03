//test Runs for Assignment 1 of the given questions to find out the output
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FP05Comp333Proj1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int twoDArr[][] = {{1, 2, 3}, {4, 5, 6}};
        
        //Q1
        //printString("Owais");   

         //Q2
        //System.out.println(Arrays.toString(intRandom1DArray(9)));   
        
        //Q3 
        // int row = 2;
        // int col = 3;
        // int[][] random2DArray = intRand2DArray(row, col);

        // for (int[] rowArray : random2DArray) {
        //     for (int num : rowArray) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }
        
        
        //Q4
        //System.out.println(int2DArrayToString(twoDArr));
        
        //Q5
        //promptForInput("Your Name: ");    
        
        //Q6
        //System.out.println(Arrays.toString(orderedArray(10)));   
        
        
        // //Q7
        // int row = 2;
        // int col = 2;
        // int[][] ordered2DArray = ordered2DArray(row, col);
        
        // for (int[] rowArray : ordered2DArray) {
        //     for (int num : rowArray) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }
        

        //Q8
        //System.out.println(sumArray(arr));
        
        //Q9
        //System.out.println(averageArray(arr));

        //Q10
        //System.out.println(sum2DArray(twoDArr));
    }

    /*****************************************Q1******************************************/

    static void printString(String input){
        System.out.println(input);
    }

    /*****************************************Q2******************************************/
    
    static int[] intRandom1DArray(int size){
        return new Random().ints().limit(size).toArray(); 
    }
    
    /*****************************************Q3******************************************/

    static int[][] intRand2DArray(int row, int col) 
    { 
        return IntStream.range(0, row)
            .mapToObj(x -> new Random().ints().limit(col).toArray())
            .toArray(int[][]::new);  
    }

    /*****************************************Q4******************************************/

    static String int2DArrayToString(int[][] input) 
    { 
         return Arrays.stream(input)
                .map(x -> Arrays.stream(x)
                .mapToObj(i -> String.format(" % 6d", i)) 
                .reduce("", (a,b) -> a + b))
                .reduce("", (a,b) -> a + b+'\n'); 
    }

    /*****************************************Q5******************************************/
 
    static String promptForInput(String msg) { 

        Scanner reader = new Scanner(System.in); 
        System.out.print(msg); 
        return reader.next(); 

    }
    /*****************************************Q6******************************************/
    
    static int[] orderedArray(int size) {
        return IntStream.range(0, size).toArray();
    }
 
    /*****************************************Q7******************************************/
    
    static int[][] ordered2DArray(int row, int col) { 
        return IntStream
        .range(0, row)
        .mapToObj(x -> IntStream.range(x*10, x*10+col) .toArray())
        .toArray(int[][]::new);
    }

    /*****************************************Q8******************************************/
    
    static int sumArray(int[] input){ 
        return Arrays.stream(input).reduce(0, (a,b) -> a + b); 
    }

    /*****************************************Q9******************************************/
    
    static int averageArray(int[] input) { 
        return Arrays.stream(input).reduce(0, (a,b) -> a + b)/input.length; 
    }

    /*****************************************Q10******************************************/

    static int sum2DArray(int[][] input) {
        return Arrays.stream(input)
            .mapToInt(x->Arrays.stream(x)
            .reduce(0, (a,b) -> a + b))
            .reduce(0, (a,b) -> a + b); 
     }
}
