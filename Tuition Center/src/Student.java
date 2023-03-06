import java.util.ArrayList;

public class Student {
    private String name;
    private String IC;
    private String address;
    private int year;
    private String schoolName;
    private ArrayList<Integer> scores;

    public Student(String name, String IC, String address, int year, String schoolName) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.scores = new ArrayList<Integer>();
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIC() {
        return this.IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public ArrayList<Integer> getScores() {
        return this.scores;
    }

    public void addScore(int score) {
        this.scores.add(score);
    }

    public double getAverageScore() {
        if (scores.size() == 0) {
            return 0;
        }
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.size();
    }

    public int getMinScore() {
        if (scores.size() == 0) {
            return 0;
        }
        int min = scores.get(0);
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public int getMaxScore() {
        if (scores.size() == 0) {
            return 0;
        }
        int max = scores.get(0);
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    public String toString() {
        return "Name: " + this.name +
                "\nIC: " + this.IC +
                "\nAddress: " + this.address +
                "\nYear: " + this.year +
                "\nSchool Name: " + this.schoolName +
                "\nScores: " + this.scores;
    }
}
