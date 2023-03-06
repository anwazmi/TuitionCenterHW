import java.util.Collections;
import java.util.Date;
import java.util.List;


public class Tutor {
    private String name;
    private String IC;
    private String address;
    private String qualification;
    private int yearsOfExperience;
    private Date dateJoined;
    private int yearsInCenter;

    public Tutor(String name, String IC, String address, String qualification, int yearsOfExperience, Date dateJoined, int yearsInCenter) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
    }

    public double calculateAverageScore(List<Student> students) {
        double totalScore = 0;
        int numOfScores = 0;
        for (Student student : students) {
            List<Integer> scores = student.getScores();
            for (int score : scores) {
                totalScore += score;
                numOfScores++;
            }
        }
        if (numOfScores == 0) {
            return 0;
        }
        return totalScore / numOfScores;
    }

    public int calculateMinScore(List<Student> students) {
        int minScore = Integer.MAX_VALUE;
        for (Student student : students) {
            List<Integer> scores = student.getScores();
            for (int score : scores) {
                if (score < minScore) {
                    minScore = score;
                }
            }
        }
        if (minScore == Integer.MAX_VALUE) {
            return 0;
        }
        return minScore;
    }

    public int calculateMaxScore(List<Student> students) {
        int maxScore = Integer.MIN_VALUE;
        for (Student student : students) {
            List<Integer> scores = student.getScores();
            for (int score : scores) {
                if (score > maxScore) {
                    maxScore = score;
                }
            }
        }
        if (maxScore == Integer.MIN_VALUE) {
            return 0;
        }
        return maxScore;
    }

    public String getBackground() {
        String background = "Name: " + name + "\n"
                + "IC: " + IC + "\n"
                + "Address: " + address + "\n"
                + "Qualification: " + qualification + "\n"
                + "Years of Experience: " + yearsOfExperience + "\n"
                + "Date Joined: " + dateJoined + "\n"
                + "Years in Center: " + yearsInCenter + "\n";
        return background;
    }
}
