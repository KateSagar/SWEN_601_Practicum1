/*
Course : SWEN-601- Exam Problem2
Name : Sagar Kate
email : sk5817@rit.edu
 */
package Problem2;

import java.util.Random;
import java.util.Scanner;

public class RobotDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID for robot 1: ");
        int id1 = scanner.nextInt();
        Robot robot1 = new Robot(id1);

        System.out.print("Enter ID for robot 2: ");
        int id2 = scanner.nextInt();
        Robot robot2 = new Robot(id2);

        System.out.print("Enter ID for robot 3: ");
        int id3 = scanner.nextInt();
        Robot robot3 = new Robot(id3);

        int iterations=0;
        do {
            System.out.print("Enter number of iterations (between 0 and 10): ");
            iterations = scanner.nextInt();
        } while (iterations < 0 || iterations > 10);


        for (int i = 0; i < iterations; i++) {
            String direction1 = getDirection();
            robot1.setDirection(direction1);
            robot1.advance();
            String direction2 = getDirection();
            robot2.setDirection(direction2);
            robot2.advance();
            String direction3 = getDirection();
            robot3.setDirection(direction3);
            robot3.advance();
        }

        // Display
        System.out.println("Final state of robot 1:");
        robot1.display();

        System.out.println("Final state of robot 2:");
        robot2.display();

        System.out.println("Final state of robot 3:");
        robot3.display();
    }

    private static String getDirection() {
        Random random = new Random();
        String[] directions = {"East", "West", "North", "South"};
        int index = random.nextInt(4);
        return directions[index];
    }
}
