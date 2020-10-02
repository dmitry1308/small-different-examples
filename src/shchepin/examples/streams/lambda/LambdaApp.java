package shchepin.examples.streams.lambda;

public class LambdaApp {
    static int sum(int[] numbers, Expression func)
    {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}
