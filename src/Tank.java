public class Tank {
    // Fields
    int x_dis, y_dis;
    int direction = 0;
    int fuel;

    // Constructors
    public Tank(){
        this(0, 0, 100);
    }
    public Tank(int x_dis, int y_dis){
        this(x_dis, y_dis, 100);
    }
    public Tank(int x_dis, int y_dis, int fuel) {
        this.x_dis = x_dis;
        this.y_dis = y_dis;
        this.fuel = fuel;
    }

    // Methods
    public void goForward(int distance) {
        if ((direction == 0 || direction == 2) && fuel > 0) {
            x_dis += distance;
            fuel -= distance;
        } else if ((direction == 1 || direction == 3) && fuel > 0) {
            y_dis += distance;
            fuel -= distance;
        }
    }

    public void goBackward(int distance) {
        goForward(-distance);
    }

    public void turnRight() {
        if (direction == 0) {
            direction = 3;
        } else {
            direction += 1;
        }
    }

    public void turnLeft() {
        if (direction == 3) {
            direction = 0;
        } else {
            direction -= 1;
        }
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x_dis + ", " + y_dis + " now.");
    }
}