// import - when you want to used a package external
// org.junit.jupiter.api.Test - this is the library that we want use all core @ Test is here 
// org.junit.AssertEquals - this make assertion about 2 obj.
import org.junit.jupiter.api.Test
import static org.junit.Assert.assertEquals;

// public When applied to a class, the "public" keyword indicates that the class is accessible from other classes and packages. It means that other classes can create objects of that class and access its public members 
public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        // Arrange
        HelloWorld helloWorld = new HelloWorld();

        // Act
        String result = helloWorld.sayHello();

        // Assert
        assertEquals("Hello, World!", result);
    }
}
