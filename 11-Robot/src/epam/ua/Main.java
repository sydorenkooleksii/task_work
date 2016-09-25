package epam.ua;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Operator operator = new Operator("Oleksii", "Sydorenko");
        Robot robot = new Robot(3.0, 4.0);
        robot.setOperator(operator);
        robot.getOperator();
        operator.getFirstName();
        operator.getLastName();
        operator.getRobot();
        Robot robot1 = new Robot(33.0, 43.0);
        operator.setRobot(robot1);
        operator.getRobot();

    }
}
