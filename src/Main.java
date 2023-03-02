/*
Code written by Artyom Pionov entirely.

This code is for the tank class that works
with the input that is provided by the user / question.
*/
public class Main {
    public static void main(String[] args) {
    /*
    Make with fuel and different constructors
    */
        // At (0;0) fuel=100
        Tank justTank = new Tank();
        // At (10,10) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // At (20,30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(100);
        justTank.printPosition();
        anywareTank.goBackward(-100);
        anywareTank.printPosition();
        customTank.goForward(200);
        customTank.printPosition();

        /*
        This fragment of code has to output
        The Tank is at 100, 0 now.
        The Tank is at 110, 10 now.
        The Tank is at 220, 30 now.

        Output:
        The Tank is at 100, 0 now.
        The Tank is at 110, 10 now.
        The Tank is at 220, 30 now.
        */
    }

}