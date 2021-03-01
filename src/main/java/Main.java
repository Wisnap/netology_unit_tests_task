import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> floors = new ArrayDeque<>();
        while (true){
            System.out.println("Введите номер этажа");
            int input = scanner.nextInt();
            if (input == 0){
                System.out.println("На работу лифта потрачено " + timeSpendToMove(floors) + " секунд");
                break;
            } else if (input < 0 || input > 25){
                System.out.println("Такого этажа нет в доме!");
            } else {
                floors.offer(input);
            }

        }
    }


    public static int timeSpendToMove(Queue queue){
        final int waitDoorsInSeconds = 10;
        final int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        int previousFloor = -1;
        while (queue.peek() != null){
            int currentFloor = (int) queue.poll();
            System.out.println(currentFloor + "\n");
            if (previousFloor != -1){
                totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
                totalSeconds += waitDoorsInSeconds;
                previousFloor = currentFloor;
            } else {
                previousFloor = currentFloor;
                totalSeconds += waitDoorsInSeconds;
            }
        }
        return totalSeconds;
    };
}