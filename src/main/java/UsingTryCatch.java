import java.util.Scanner;
import java.util.InputMismatchException;

public class UsingTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter a number between 0 - 9 :");
            Scanner myscan = new Scanner(System.in);
            int myNum = myscan.nextInt();
            if (myNum < +9 && myNum > 0) {
                System.out.println("You entered :" + myNum);
            } else {
                System.out.println("Not a valid number");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid numerical value.");
        }
    }
}
