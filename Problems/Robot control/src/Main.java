public static void moveRobot(Robot robot, int toX, int toY) {
    robot.stepForward();
    int currentX = robot.getX();
    int currentY = robot.getY();
    if(currentX > toX) {
        switch(robot.getDirection().name()) {
            case "UP":
                robot.turnLeft();
                break;
            case "RIGHT":
                robot.turnLeft();
                robot.turnLeft();
                break;
            case "DOWN":
                robot.turnRight();
                break;
            }
    }
    else {
        switch(robot.getDirection().name()) {
            case"UP":
                robot.turnRight();
                break;
            case"DOWN":
                robot.turnLeft();
                break;
            case"LEFT":
                robot.turnRight();
                robot.turnRight();
                break;
        }
    }
    while (currentX != toX) {
        robot.stepForward();
        currentX = robot.getX();
    }
    if(currentY > toY) {
        switch(robot.getDirection().name()) {
            case "RIGHT":
                robot.turnRight();
                break;
            case "LEFT":
                robot.turnLeft();
                break;
        }
    }
    else {
        switch(robot.getDirection().name()) {
            case "RIGHT":
                robot.turnLeft();
                break;
            case "LEFT":
                robot.turnRight();
                break;
        }
    }
    while(currentY != toY) {
        robot.stepForward();
        currentY = robot.getY();
    }
}