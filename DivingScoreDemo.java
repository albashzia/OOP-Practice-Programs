import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DivingScore {

    double difficulty;
    ArrayList<Double> scores;

    DivingScore(double difficulty) {
        this.difficulty = difficulty;
        scores = new ArrayList<>();
    }

    void addScore(double score) {
        scores.add(score);
    }

    double calculateScore() {

        Collections.sort(scores);

        scores.remove(0);
        scores.remove(scores.size() - 1);

        double sum = 0;

        for (double score : scores) {
            sum += score;
        }

        return sum * difficulty * 0.6;
    }
}

public class DivingScoreDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter degree of difficulty: ");
        double difficulty = input.nextDouble();

        DivingScore dive = new DivingScore(difficulty);

        System.out.println("Enter 7 judges scores:");

        for (int i = 1; i <= 7; i++) {

            System.out.print("Judge " + i + ": ");
            double score = input.nextDouble();

            dive.addScore(score);
        }

        double finalScore = dive.calculateScore();

        System.out.println("Final Diving Score: " + finalScore);
    }
}