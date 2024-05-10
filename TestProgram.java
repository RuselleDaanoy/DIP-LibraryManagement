public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Student 1");
        Book book = new Book("Book 1");
        Journal journal = new Journal("Journal 1");

        ResourceHandler resourcesHandler = new ResourceHandler();
        resourcesHandler.acquireResources(student, book);
        resourcesHandler.acquireResources(student, journal);
    }
}