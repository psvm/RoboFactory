package Robots;

class Robofactory {
    public static Robot produceRobot(String size, String type) {
        if (type == "Bender") return new RobotBender(size);
        if (type == "R2D2") return new RobotR2D2(size);
        if (type == "Wall-e") return new RobotWalle(size);
        else return null;
    }
}