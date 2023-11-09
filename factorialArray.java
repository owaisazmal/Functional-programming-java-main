import java.util.*;
public class factorialArray implement runnable {
    int i;
    Long[]result;
}
factorialArray(long[]result, int i){

This.i = i;
This.result = result;

}

@override
Public void run(){
result[i] = factorial(i);
}

Long factorial(int i){

 return factorialHelper(1, i)
}

long factorial(long accum, int i){

if(i>=1) return factorialHelper(accum*i, i-1);

return accum;

}