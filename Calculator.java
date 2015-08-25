/**
 * @author Nick Wilson
 * @version 8.25.15
 *
 * Copied from
 *   https://github.com/junit-team/junit/wiki/Getting-started
 * Basic class for starting with JUnit
 */
public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
}
