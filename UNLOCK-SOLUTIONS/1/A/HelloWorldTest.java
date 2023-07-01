// import - when you want to used a package external
// org.junit.jupiter.api.Test - this is the library that we want use all core @ Test is here 
// org.junit.AssertEquals - this make assertion about 2 obj.
import org.junit.jupiter.api.Test
import static org.junit.Assert.assertEquals;

// public - When applied to a class, the "public" keyword indicates that the class is accessible from other classes and packages. It means that other classes can create objects of that class and access its public members
// class - A class in Java encapsulates data (variables) and methods (functions) that operate on that data. It defines the structure and behavior of objects, allowing you to create multiple instances of the class with similar characteristics.
public class HelloWorldTest {
    // @ test - Annotations are used to provide additional information or metadata about classes, methods, or other program elements.it indicates that the annotated method should be executed as a test case when running the JUnit test suite.
    @Test
           // void - it means that the method does not return any value.
    public void testHelloWorld() {
        // HelloWorld - is the name of a class. It could be a class defined in your own code or a class from a library or framework.
        // helloWorld - variable name
        // is a special keyword combination that creates a new instance of the HelloWorld class using the class's constructor.
        HelloWorld helloWorld = new HelloWorld();

        // Act
        String result = helloWorld.sayHello();

        // Assert
        assertEquals("Hello, World!", result);
    }
}
