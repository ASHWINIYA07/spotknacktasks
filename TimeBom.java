import java.util.Scanner;


class TimeBomb extends Thread {
    private boolean defused = false;

    public void run() {
        try {
            for (int i = 10; i >= 0; i--) {
               
                if (defused) {
                    return;
                }

                System.out.println("Bomb exploding in " + i + " seconds...");
                Thread.sleep(1000); 
            }
            System.out.println("BOOM! The bomb exploded.");
        } catch (InterruptedException e) {
            System.out.println("Bomb Defused!");
        }
    }

    
    public void defuse() {
        defused = true;
        this.interrupt();
    }
}


public class TimeBom{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TimeBomb bomb = new TimeBomb();
        bomb.start(); 

        System.out.print("Enter password to defuse the bomb: ");
        String input = scanner.nextLine();

        String correctPassword = "1234";

        if (input.equals(correctPassword)) {
            bomb.defuse();
        } else {
            System.out.println("Wrong password! Try again next time...");
        }

        scanner.close();
    }
}