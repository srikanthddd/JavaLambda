package Example1;

public class LambdaExample {

    public static void main(String[] args) {

        SumFunction sumFunction = (int a, int b) -> a + b;

        int result = sumFunction.calculateSum(5, 6);

        System.out.println(result);

    }
}
