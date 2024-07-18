public class CourseDriver {
    public static void main(String[] args) {
        String[] students = {"Elias", "Mikeal", "Daniel", "Simon"};
        // create an object
        Course course = new Course(students);
        // use the object to run non static method
        course.printStudents();
    }
}
