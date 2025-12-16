package myth01;

import java.util.ArrayList;
import java.util.List;
import util.Timer;

/**
 * Demonstrates Myth 01: Inserting at the front of an ArrayList is costly.
 * Uses util.Timer from utils/timer_utils/java/util for benchmarking.
 */
public class ArrayInsert {
    // Constants for easy tweaking
    private static final int INITIAL_SIZE = 1_000_000;
    private static final int INSERT_OPERATION_COUNT = 10_000;

    private List<Integer> list = new ArrayList<>();
    private Timer timer = new Timer();

    /** 
     * Prefills the list with INITIAL_SIZE elements.
     * Purpose: Create a baseline large array for testing.
     */
    public void prefillItems() {
        for (int i = 0; i < INITIAL_SIZE; i++) {
            list.add(i);
        }
        System.out.println("Initial size: " + list.size());
    }

    /**
     * Appends elements to the end of the list.
     * This is generally O(1) for ArrayList (amortized).
     */
    public void appendItems() {
        timer.start();
        for (int i = 0; i < INSERT_OPERATION_COUNT; i++) {
            list.add(i);
        }
        timer.stop("Appending operation took");
        System.out.println("Final size after appending: " + list.size());
    }

    /**
     * Inserts elements at index 0.
     * This is O(n) for ArrayList because all existing elements are shifted.
     */
    public void prependItems() {
        timer.start();
        for (int i = 0; i < INSERT_OPERATION_COUNT; i++) {
            list.add(0, i);
        }
        timer.stop("Prepending operation took");
        System.out.println("Final size after prepending: " + list.size());
    }

    public static void main(String[] args) {
        ArrayInsert arrayInsert = new ArrayInsert();
        arrayInsert.prefillItems();
        arrayInsert.appendItems();
        arrayInsert.prependItems();
    }
}
