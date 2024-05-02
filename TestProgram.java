public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();

        Resources book = new Book("");
        Resources journal = new Journal("");

        student.borrowResource(book);
        student.borrowResource(journal);
    }
}