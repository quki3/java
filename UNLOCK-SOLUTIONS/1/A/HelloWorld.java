
/*class - define the class*/
/* public - It is an access modifier that indicates the member is accessible from anywhere in the program. Other classes, even those in different packages, can access public members.*/
/*HelloWorld - name of the class*/
public class HelloWorld {

    /* static -  It is a keyword that denotes a member or method belongs to the class itself rather than an instance of the class. It is a keyword that denotes a member or method belongs to the class itself rather than an instance of the class. This means that you can access static members without creating an instance of the class public static variable that can be accessed from anywhere in the program, even without creating an instance of the HelloWorld*/
    /* void - indicating that the method does not return any value.*/
    /* String - The String class is widely used in Java for tasks like storing user input, manipulating text data, working with file paths, and much more*/
    public static void main(String... args) {
        /* System.out.println -     System: It is a class in the java.lang package that provides access to the system resources, including input, output, and error streams.
    out: It is a static member of the System class, which represents the standard output stream.
    println: It is a method of the PrintStream class, accessible through the out member. It is used to print a line of text or a value followed by a line break.*/
        System.out.println("Hello, World!");
    }
}

// you can compiler this with $>_ `javac name-file.java`
// you can run this with $>_ `java name-file`

