package util;


public class Timer {

    private long startTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop(String message) {
        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;
        System.out.println(message + ": "+ (timeTaken / 1000000) + "ms");
    }
}
