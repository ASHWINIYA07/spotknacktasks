import java.util.*;

class Student {
    String Name;
    int marks;
    char Grade;

    Student(String Name, int marks) {
        this.Name = Name;
        this.marks = marks;
        this.Grade = calculategrade();
    }
    public char calculategrade() {
        if(marks >= 90)
            return 'A';
        else if(marks >= 75)
            return 'B';
        else if(marks >= 60)
            return 'C';
        else
            return 'F';
    }
    public void displaydetails() {
        System.out.println("\n-- STUDENT DETAILS --");
        System.out.println("Name  : " + Name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + Grade);
    }
}
public class Studentgradesystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        ArrayList<Student> Students = new ArrayList<>();
        while(true) {
            System.out.println("\n1. ADD STUDENT | 2. VIEW ALL | 3. SEARCH | 4. EXIT");
            System.out.print("Choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    if(Students.size() >= 5) {
                        System.out.println(" Student limit reached!");
                        break;
                    }
                    System.out.print("Enter Name: ");
                    String Name = scan.nextLine();
                    boolean exists = false;
                    for(Student s : Students) {
                        if(s.Name.equalsIgnoreCase(Name)) {
                            exists = true;
                            break;
                        }
                    }
                    if(exists) {
                        System.out.println("Error: Student already exists!");
                        break;
                    }
                    System.out.print("Enter Marks: ");
                    int marks = scan.nextInt();
                    if(marks < 0 || marks > 100) {
                        System.out.println("Error: Marks must be between 0 and 100!");
                        break;
                    }
                    Students.add(new Student(Name, marks));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    if(Students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        for (Student s : Students) {
                            s.displaydetails();
                     }
                    }
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String search = scan.nextLine();
                    boolean found = false;
                    for(Student s : Students) {
                        if(s.Name.equalsIgnoreCase(search)) {
                            s.displaydetails();
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                default:
                    System.out.println("INVALID CHOICE!");
         }
    }
    }
}
