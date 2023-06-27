// import - when you want to used a package external
// org.junit.jupiter.api.Test - this is the library that we want use all core @ Test is here 
// org.junit.AssertEquals - we want to use this here
import org.junit.jupiter.api.Test
import static org.junit.Assert.assertEquals;

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
