/*
Course : SWEN-601- Exam Problem2
Name : Sagar Kate
email : sk5817@rit.edu
 */

package Problem2;

public class RobotNG extends Robot {

    public RobotNG(int ID) {
        super(ID);
    }

    // Override advance method
    @Override
    public void advance() {
        switch (getDirection()) {
            case "North":
                setY(getY() + 2);
                break;
            case "East":
                setX(getX() + 2);
                break;
            case "South":
                setY(getY() - 2);
                break;
            case "West":
                setX(getX() - 2);
                break;
        }
    }
}
