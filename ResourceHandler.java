public class ResourceHandler {
    public void acquireResources(Student student, Resources resources) {
        System.out.println(student.getName() + " borrowed: ");
        resources.borrow();
        
    }
}