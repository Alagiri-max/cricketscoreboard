package console;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scoreboard sb = new Scoreboard();

        Player[] players = {
            new Player("Rohit"),
            new Player("Virat"),
            new Player("Dhoni"),
            new Player("Gill"),
            new Player("Hardik")
        };

        while (true) {
            System.out.println("\n--- Cricket Scoreboard ---");
            System.out.println("1. Add Runs");
            System.out.println("2. Add Wicket");
            System.out.println("3. Count Ball");
            System.out.println("4. Show Score");
            System.out.println("5. Run Rate");
            System.out.println("6. Reset Score");
            System.out.println("7. Player List");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter runs: ");
                    int r = sc.nextInt();
                    sb.addRuns(r);
                    break;

                case 2:
                    sb.addWicket();
                    break;

                case 3:
                    sb.countBall();
                    break;

                case 4:
                    sb.showScore();
                    break;

                case 5:
                    sb.runRate();
                    break;

                case 6:
                    sb.reset();
                    break;

                case 7:
                    System.out.println("Players:");
                    for (Player p : players)
                        p.display();
                    break;

                case 8:
                	System.out.println("Thank You...!");
                    System.exit(0);
            }
        }
    }
}

