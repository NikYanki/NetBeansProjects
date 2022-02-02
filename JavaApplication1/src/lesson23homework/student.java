package lesson23homework;

public class student {

    private static StringBuilder name;

    public static StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }
    private static int course, grade;

    public static int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 10) {
            this.grade = grade;
        }
    }

    public static int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course < 5) {
            this.course = course;
        }
    }

    public void showInfo() {
        System.out.println("Srudent name: " + student.getName());
        System.out.println("Srudent course: " + student.getCourse());
        System.out.println("Srudent grade: " + student.getGrade());
    }
}

class TestStudent {

    public static void main(String[] args) {
        student s1 = new student();
        s1.setName(new StringBuilder("Valera"));
        s1.setGrade(6);
        s1.setCourse(3);
        s1.showInfo();
        s1.setName(new StringBuilder("f"));
        student.getName().append("fwfwfnwdwdo");
        s1.setCourse(-1);
        s1.setGrade(-4);
        s1.showInfo();
    }
}
