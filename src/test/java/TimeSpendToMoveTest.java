import org.junit.jupiter.api.Assertions;

import java.util.ArrayDeque;
import java.util.Queue;

public class TimeSpendToMoveTest {
    @org.junit.jupiter.api.Test
    public void test_time_spend_to_move_positive() {
        // setup
        Queue<Integer> floors = new ArrayDeque<>();
        floors.offer(1);
        floors.offer(15);
        floors.offer(22);
        // perform
        int result = Main.timeSpendToMove(floors);
        // assertion
        Assertions.assertEquals(result, 135, "Неверное кол-во секунд");
    }

    @org.junit.jupiter.api.Test
    public void test_time_spend_to_move_no_floors() {
        // setup
        Queue<Integer> floors = new ArrayDeque<>();
        // perform
        int result = Main.timeSpendToMove(floors);
        // assertion
        Assertions.assertEquals(result, 0, "Неверное кол-во секунд");
    }

    @org.junit.jupiter.api.Test
    public void test_time_spend_to_move_one_floor() {
        // setup
        Queue<Integer> floors = new ArrayDeque<>();
        floors.offer(1);
        // perform
        int result = Main.timeSpendToMove(floors);
        // assertion
        Assertions.assertEquals(result, 10, "Неверное кол-во секунд");
    }

    @org.junit.jupiter.api.Test
    public void test_time_spend_to_move_takes_no_string() {
        // setup
        Queue<String> floors = new ArrayDeque<>();
        floors.offer("test_string");
        // assertion
        Assertions.assertThrows(ClassCastException.class, () -> {
        // perform
            int result = Main.timeSpendToMove(floors);
        });
    }

}
