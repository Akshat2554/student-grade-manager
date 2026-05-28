import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student() {
        this.name = null;
        this.grades = new ArrayList<Double>();
    }

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<Double>();
    }

    public  void addGrades(double grade) {
        grades.add(grade);
    }

    public double getGPA() {
        double total = 0;
        for(int i = 0; i < grades.size(); i++) {
           total += grades.get(i);
        }
        return total / grades.size();
    }

    public String toString() {
        return name + "- GPA: " + String.format("%.2f", getGPA());
    }

    public String getName() {
        return name;
    }
}