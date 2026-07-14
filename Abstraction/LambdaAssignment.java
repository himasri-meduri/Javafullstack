interface Test {
    int myFunction(int a, int b, int c);
}
public class LambdaAssignment {
    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;
        int x = 10;
        int y = 5;
        int z = 3;
        System.out.println("Values used: " + x + ", " + y + ", " + z);
        System.out.println("------------------------------------");
        int additionResult = t1.myFunction(x, y, z);
        System.out.println("Addition Result (t1): " + additionResult);
        int multiplicationResult = t2.myFunction(x, y, z);
        System.out.println("Multiplication Result (t2): " + multiplicationResult);
    }
}
