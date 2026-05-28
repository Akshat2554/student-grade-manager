import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Gradebook gradeBook = new Gradebook();
        boolean running = true;

        System.out.println("=== Grade Manager ===");

        while(running) {
            System.out.println("\n1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Print all students");
            System.out.println("5. Class Average");
            System.out.println("6. Top Student");
            System.out.println("7. Bottom Student");
            System.out.println("8. Quit");
            System.out.println("Choose: ");

            int choice = scnr.nextInt();
            scnr.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = scnr.nextLine();
                    Student s1 = new Student(name);
                    System.out.println("How many grades?");
                    int numGrades = scnr.nextInt();
                    for(int i = 0; i < numGrades; i++) {
                    System.out.println("Enter grades: ");
                    s1.addGrades(scnr.nextDouble());
                    }
                    gradeBook.addStudent(s1);
                    System.out.println(name + " added.");
                    break;

                case 2:
                    System.out.println("Enter name: ");
                    String nameToRemove = scnr.nextLine();
                    gradeBook.removeStudent(nameToRemove);
                    break;

                case 3:
                    System.out.println("Enter name: ");
                    String nameToSearch = scnr.nextLine();
                    System.out.println(gradeBook.searchStudent(nameToSearch));
                    break;

                case 4:
                    gradeBook.printAll();
                    break;

                case 5:
                    System.out.println(gradeBook.getClassAverage());
                    break;

                case 6:
                    System.out.println(gradeBook.findTopStudent());
                    break;

                case 7:
                    System.out.println(gradeBook.findBottomStudent());
                    break;

                case 8:
                    running = false;
                    break;
            }
        }
        System.out.println("Goodbye!");
        scnr.close();
    }
}
