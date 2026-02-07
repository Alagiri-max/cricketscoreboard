package console;

public class Scoreboard {
    int runs = 0;
    int wickets = 0;
    int balls = 0;

    void addRuns(int r) {
        runs += r;
        balls++;
        System.out.println("Runs Added.");
    }

    void addWicket() {
        wickets++;
        balls++;
        System.out.println("Wickets Added.");
    }

    void countBall() {
    	System.out.println("Balls :"+balls);
        balls++;
        
    }

    void showScore() {
        int overs = balls / 6;
        int remBalls = balls % 6;
        System.out.println("Score: " + runs + "/" + wickets + " in " + overs + "." + remBalls + " overs");
    }

    void runRate() {
        double overs = balls / 6.0;
        if (overs == 0) {
            System.out.println("Run Rate: 0");
        } else {
            System.out.printf("Run Rate: %.2f\n", (runs / overs));
        }
    }

    void reset() {
        runs = 0;
        wickets = 0;
        balls = 0;
        System.out.println("Scoreboard Reset!");
    }
}


