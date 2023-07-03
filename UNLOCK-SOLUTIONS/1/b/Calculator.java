public class Calculator {
  public int evaluate(String expression) {
    int sum = 0;
    // for - bucle for
                                  // split - which splits the string at each occurrence of the + character. The resulting substrings (summands) are stored in an array.
    for (String summand: expression.split("\\+"))
             //Interger.valueOf - converts a specified input into an Integer
      sum += Integer.valueOf(summand);
    return sum;
  }
}
