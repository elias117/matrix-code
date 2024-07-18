public class Course {
    private String[] students;

    public Course(String[] students) {
        this.students = students;
    }

    public void printStudents() {
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        // enhanced for loop
        // for (String student : students) {
        //     System.out.println(student);
        // }
    }
}
