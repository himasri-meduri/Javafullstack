public class MathOperation {
    public static void main(String[] args) {
        int[] a = new int[5];
        int sum = 0;
        try {
            for (int i = 0; i < 5; i++) {
                sum += a[i];
            }
            double average = (double) sum / a.length;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Error: NumberFormatException - Please enter integers only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: ArrayIndexOutOfBoundsException - Please provide exactly 5 integer arguments.");
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException occurred.");
        }
    }
}
