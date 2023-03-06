import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create centers
        TuitionCenter center1 = new TuitionCenter("TuitionCenter 1");
        TuitionCenter center2 = new TuitionCenter("TuitionCenter 2");

        // Create tutors
        Tutor tutor1 = new Tutor("John Doe", "1234567", "123 Main St", "PhD", 10, new Date(), 5);
        Tutor tutor2 = new Tutor("Jane Smith", "7654321", "456 Oak St", "Master's", 5, new Date(), 3);

        // Add tutors to centers
        center1.addTutor(tutor1);
        center1.addTutor(tutor2);
        center2.addTutor(tutor1);

        // Create students
        Student student1 = new Student("Tom Smith", "12345", "321 New St", 2020, "UTP");
        Student student2 = new Student("Mary Johnson", "67890", "654 Old St", 2003, "UITM");

        // Add students to centers
        center1.addStudent(student1);
        center1.addStudent(student2);
        center2.addStudent(student1);

        // Set scores for students
        student1.addScore(80);
        student1.addScore(90);
        student2.addScore(70);
        student2.addScore(75);

        // Calculate statistics for each center
        List<TuitionCenter> centers = new ArrayList<>();
        centers.add(center1);
        centers.add(center2);

        for (TuitionCenter center : centers) {
            List<Student> students = center.getStudents();
            List<Tutor> tutors = center.getTutors();

            int numStudents = students.size();
            int numTutors = tutors.size();
            double avgScore = 0;
            int minScore = 0;
            int maxScore = 0;
            String tutorBackground = "";

            if (numStudents > 0) {
                avgScore = tutors.get(0).calculateAverageScore(students);
                minScore = tutors.get(0).calculateMinScore(students);
                maxScore = tutors.get(0).calculateMaxScore(students);
            }

            for (Tutor tutor : tutors) {
                tutorBackground += tutor.getBackground();
            }

            System.out.println("TuitionCenter: " + center.getName());
            System.out.println("Number of Students: " + numStudents);
            System.out.println("Number of Tutors: " + numTutors);
            System.out.println("Average Score: " + avgScore);
            System.out.println("Minimum Score: " + minScore);
            System.out.println("Maximum Score: " + maxScore);
            System.out.println("Tutors' Background: \n" + tutorBackground);
            System.out.println();
        }
    }
}
