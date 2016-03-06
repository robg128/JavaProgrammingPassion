
package mytypemismatchexampleproject;

public class Main {
    
    public static void main(String[] args) {
        
        // Implicit casting - Student object instance is
        // type of Person.
        Person person1 = new Student();
        
        // Implicit casting - Teacher object instance is
        // type of Person.
        Person person2 = new Teacher();
        
        // Explicit type casting.
        Student student1 = (Student) person1;
        
        // Do the casting only when the type is verified
        if (person2 instanceof Student) {
            Student student2 = (Student) person2;
            System.out.println("person2 instanceof Student = " + true);
        } else{
            System.out.println("person2 instanceof Student = " + false);
        }
        
    }
    
}
