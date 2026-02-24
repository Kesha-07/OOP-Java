import java.util.Scanner;

class College {

    private String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {

        private String studentName;
        private String course;

        public void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        public void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // Access outer class variable
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Enrolled: " + course);
        }
    }

    public static void main(String[] args) {

        College college = new College("SPB Engineering College");

        College.Admission admission = college.new Admission();

        admission.acceptDetails();
        admission.displayDetails();
    }
}
