public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();

        Resources book = new Book("Introduction to Programming");
        Resources journal = new Journal("Computer Science Journal");

        student.borrowResource(book);
        student.borrowResource(journal);
    }
}