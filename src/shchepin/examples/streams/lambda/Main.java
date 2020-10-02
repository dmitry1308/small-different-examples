package shchepin.examples.streams.lambda;

public class Main {
    public static void main(String[] args) {

        int[] nums = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(LambdaApp.sum(nums, ExpressionHelper::isEven));

        Expression expr = ExpressionHelper::isPositive;
        System.out.println(LambdaApp.sum(nums, expr));
    }

}
