// import java.util.concurrent.Executors;
// import java.util.concurrent.TimeUnit;

// public class FP04randomNum implements Runnable {
//     int[] result = new int[n];
//     int i;
//     FP04randomNum(int[] result, int i){
//         this.result = result;
//         this.i = i;
//     }

//     @Override
//     public void run(){
//         result[i] = (int) Math.random();
//     }
// }

// int FP04randomNum(int n){
    
//     ExecutableService myexecutable = new Executors.newFixedThreadPool(4);
//     for(int i = 0; i < n; i += 1){
//         myexecutable.execute(new FP04randomNum(result, i));
//     }
//     myexecutable.shutdown();
//     myexecutable.awaitterminaton(10, TimeUnit.SECONDS);
//     return result;

// }
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FP04randomNum implements Runnable {
    int[] result;
    int i;

    FP04randomNum(int[] result, int i) {
        this.result = result;
        this.i = i;
    }

    @Override
    public void run() {
        result[i] = (int) Math.random();
    }

    public static int[] generateRandomArray(int n) {
        int[] result = new int[n];

        ExecutorService myExecutable = Executors.newFixedThreadPool(4);

        for (int i = 0; i < n; i += 1) {
            myExecutable.execute(new FP04randomNum(result, i));
        }

        myExecutable.shutdown();

        try {
            myExecutable.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }
}


