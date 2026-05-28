import java.util.ArrayList;
public class Gradebook {
    private ArrayList<Student> students;

    public Gradebook() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String student) {
        boolean found = false;
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(student)) {
                students.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            return;
        }
    }

    public Student searchStudent(String name) {
        if (students.size() == 0) return null;
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return students.get(i);
            }
        }  
            return null;
    }

    public void printAll() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public double getClassAverage() {
        if (students.size() == 0) return 0.0;
        double totalAvg = 0;
        for(Student s : students) {
           totalAvg += s.getGPA();
        }
        return totalAvg/students.size();
    }

    public Student findTopStudent(){
        if (students.size() == 0) return null;
        Student top = students.get(0);
        for(int i = 0; i < students.size(); i++){
            if (students.get(i).getGPA() > top.getGPA()) {
                top = students.get(i);
            }
        }
        return top;
    }

    public Student findBottomStudent(){
        if (students.size() == 0) return null;
        Student bottom = students.get(0);
        for(int i = 0; i < students.size(); i++){
            if (students.get(i).getGPA() < bottom.getGPA()) {
                bottom = students.get(i);
            }
        }
        return bottom;
    }
}
