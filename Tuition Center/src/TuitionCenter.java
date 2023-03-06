import java.util.ArrayList;
import java.util.List;

public class TuitionCenter {
    private String name;
    private String address;
    private HeadMaster headMaster;
    private List<Tutor> tutors;
    private List<Student> students;

    public TuitionCenter(String name, String address, HeadMaster headMaster) {
        this.name = name;
        this.address = address;
        this.headMaster = headMaster;
        this.tutors = new ArrayList<>();
        this.students = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public HeadMaster getHeadMaster() {
        return headMaster;
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addTutor(Tutor tutor) {
        tutors.add(tutor);
    }

    public void removeTutor(Tutor tutor) {
        tutors.remove(tutor);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public int getNumberOfTutors() {
        return tutors.size();
    }

    public double getAverageMarks() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageScore();
        }
        return sum / students.size();
    }

    public double getMinimumMarks() {
        double min = Double.MAX_VALUE;
        for (Student student : students) {
            if (student.getMinScore() < min) {
                min = student.getMinScore();
            }
        }
        return min;
    }

    public double getMaximumMarks() {
        double max = Double.MIN_VALUE;
        for (Student student : students) {
            if (student.getMaxScore() > max) {
                max = student.getMaxScore();
            }
        }
        return max;
    }

    public List<String> getTutorsBackground() {
        List<String> backgrounds = new ArrayList<>();
        for (Tutor tutor : tutors) {
            backgrounds.add(tutor.getBackground());
        }
        return backgrounds;
    }
}
