class University 
{

    static int totalStudents;

    static String universityName;

    static 
    {
        universityName = "Global Tech University";
        totalStudents = 0;
        System.out.println("Static block executed: University initialized");
    }

    {
        System.out.println("Instance block executed: Student object is being created");
        totalStudents++;
    }

    University() 
    {
        System.out.println("Constructor executed");
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {

        System.out.println("University Name: " + universityName);

        University s1 = new University();
        System.out.println();

        University s2 = new University();
        System.out.println();

        System.out.println("Total Students Created: " + University.getTotalStudents());
    }
}
