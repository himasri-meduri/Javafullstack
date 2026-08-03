package com.wipro.task;
import java.util.Arrays;
public class Dailytask {
    public String doStringConcat(String s1, String s2) {
        return s1 + " " + s2;
    }
    public int[] sortValues(int arr[]) {
        Arrays.sort(arr);
        return arr;
    }
    public boolean checkPresence(String str, String a) {
        return str.contains(a);
    }
    public static void main(String[] args) {
        Dailytask tasks = new Dailytask();
        System.out.println("--- Test 1: doStringConcat ---");
        String concatResult = tasks.doStringConcat("Hello", "Wipro");
        System.out.println("Result: " + concatResult); 
        System.out.println("\n--- Test 2: sortValues ---");
        int[] numbers = {5, 2, 9, 1, 3};
        System.out.println("Before Sort: " + Arrays.toString(numbers));
        int[] sortedNumbers = tasks.sortValues(numbers);
        System.out.println("After Sort:  " + Arrays.toString(sortedNumbers));
        System.out.println("\n--- Test 3: checkPresence ---");
        boolean isPresent = tasks.checkPresence("Java Programming", "Java");
        System.out.println("Does 'Java Programming' contain 'Java'? " + isPresent);
    }
}
