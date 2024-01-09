public class Student {

    // Member variables
    private String usn;
    private String name;
    private int[] credits;
    private int[] marks;

    // Constructor
    public Student(String usn, String name, int[] credits, int[] marks) {
        this.usn = usn;
        this.name = name;
        this.credits = credits;
        this.marks = marks;
    }

    // Method to accept details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter USN: ");
        usn = sc.nextLine();

        System.out.println("Enter Name: ");
        name = sc.nextLine();

        System.out.println("Enter Number of Subjects: ");
        int numSubjects = sc.nextInt();

        credits = new int[numSubjects];
        marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter Credit for Subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();

            System.out.println("Enter Mark for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);

        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + ": Credits: " + credits[i] + ", Mark: " + marks[i]);
        }
    }

    // Method to calculate SGPA
    public double calculateSGPA() {
        double totalCreditPoints = 0;
        double totalCredits = 0;

        for (int i = 0; i < credits.length; i++) {
            totalCreditPoints += credits[i] * getGradePoints(marks[i]);
            totalCredits += credits[i];
        }

        return totalCreditPoints / totalCredits;
    }

    // Helper method to convert marks to grade points
    private double getGradePoints(int mark) {
        if (mark >= 90) {
            return 10.0;
        } else if (mark >= 80) {
            return 9.0;
        } else if (mark >= 70) {
            return 8.0;
        } else if (mark >= 60) {
            return 7.0;
        } else if (mark >= 50) {
            return 6.0;
        } else if (mark >= 40) {
            return 5.0;
        } else {
            return 0.0;
        }
    }

    // Optional: Main method for testing
    public static void main(String[] args) {
        int[] credits = {3, 4, 2};
        int[] marks = {85, 78, 92};

        Student student = new Student("CS18001", "John Doe", credits, marks);
        student.acceptDetails();
        student.displayDetails();
        System.out.println("SGPA: " + student.calculateSGPA());
    }
}

