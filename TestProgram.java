public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Ruselle Daanoy");
        Book book = new Book("Theory of Programming Languages");
        Journal journal = new Journal("Journal II");

        ResourceHandler resourcesHandler = new ResourceHandler();
        resourcesHandler.acquireResources(student, book);
        resourcesHandler.acquireResources(student, journal);
    }
}