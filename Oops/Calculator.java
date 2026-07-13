class Calculator {
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
    public static void main(String args[]) {
        System.out.println("Result1: " + Calculator.powerInt(2, 5));
        System.out.println("Resul2: " + Calculator.powerDouble(2.5, 3));
    }
}
