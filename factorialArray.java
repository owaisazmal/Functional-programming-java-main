import java.util.*;

public class factorialArray implements Runnable {
    int i;
    Long[] result;

    public factorialArray(Long[] result, int i) {
        this.i = i;
        this.result = result;
    }

    @Override
    public void run() {
        result[i] = factorial(i);
    }

    private Long factorial(int i) {
        return factorialHelper(1L, i);
    }

    private Long factorialHelper(long accum, int i) {
        if (i >= 1) {
            return factorialHelper(accum * i, i - 1);
        }
        return accum;
    }
}
