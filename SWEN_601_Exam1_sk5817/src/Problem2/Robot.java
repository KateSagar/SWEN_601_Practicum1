/*
Course : SWEN-601- Exam Problem2
Name : Sagar Kate
email : sk5817@rit.edu
 */
package Problem2;

public class Robot {
    private int ID;
    private int x;
    private int y;
    private String direction;

    //default cons
    public Robot(int ID)
    {
        this.ID = ID;
        this.x = 0;
        this.y=0;
        this.direction = "East";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    // Advance method
    public void advance() {
        switch (direction) {
            case "North":
                y += 1;
                break;
            case "East":
                x += 1;
                break;
            case "South":
                y -= 1;
                break;
            case "West":
                x -= 1;
                break;
        }
    }

    // Display method
    public void display() {
        System.out.println("Robot ID: " + ID);
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Direction: " + direction);
    }
}
