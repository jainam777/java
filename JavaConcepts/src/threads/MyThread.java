package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThread {
	public static void main(String[] args) throws InterruptedException {
		long startTime= System.currentTimeMillis();
		Runnable r1=()->{System.out.println("My thread");};
		ExecutorService ser= Executors.newFixedThreadPool(2);
		ser.submit(r1);
		 ser.shutdown(); // stop accepting new tasks

	        // wait for all tasks to complete
	        ser.awaitTermination(1, TimeUnit.SECONDS);
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time taken:"+ (endTime-startTime)+"ms");
	}

}
