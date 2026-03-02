
import java.util.ArrayList;
import java.util.Scanner;
class Student56 {
    int id;
    String name;
    int age;
    String course;

    Student56(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + age + "\t" + course);
    }
}
    public class StudentManagement {

        static ArrayList<Student56> students = new ArrayList<>();
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            while (true) {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Search Student");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1: addStudent(); break;
                    case 2: viewStudents(); break;
                    case 3: updateStudent(); break;
                    case 4: deleteStudent(); break;
                    case 5: searchStudent(); break;
                    case 6:
                        System.out.println("Thank you!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }

        static void addStudent() {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            students.add(new Student56(id, name, age, course));
            System.out.println("Student added successfully!");
        }

        static void viewStudents() {
            if (students.isEmpty()) {
                System.out.println("No students found.");
                return;
            }
            System.out.println("ID\tName\tAge\tCourse");
            for (Student56 s : students) {
                s.display();
            }
        }

        static void updateStudent() {
            System.out.print("Enter Student ID to update: ");
            int id = sc.nextInt();

            for (Student56 s : students) {
                if (s.id == id) {
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    s.name = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    s.age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    s.course = sc.nextLine();

                    System.out.println("Student updated successfully!");
                    return;
                }
            }
            System.out.println("Student not found!");
        }

        static void deleteStudent() {
            System.out.print("Enter Student ID to delete: ");
            int id = sc.nextInt();

            for (Student56 s : students) {
                if (s.id == id) {
                    students.remove(s);
                    System.out.println("Student deleted successfully!");
                    return;
                }
            }
            System.out.println("Student not found!");
        }

        static void searchStudent() {
            System.out.print("Enter Student ID to search: ");
            int id = sc.nextInt();

            for (Student56 s : students) {
                if (s.id == id) {
                    System.out.println("ID\tName\tAge\tCourse");
                    s.display();
                    return;
                }
            }
            System.out.println("Student not found!");
        }
    }


