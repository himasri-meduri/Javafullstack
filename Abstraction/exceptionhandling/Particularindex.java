import java.util.Scanner;
public class Particularindex{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the index of the array elements you want to access");
        int index=sc.nextInt();
         if (index >= 0 && index < n) {
            System.out.println("Element at index " + index + " is: " + a[index]);
        } else {
            System.out.println("Invalid index! Please enter a value between 0 and " + (n - 1));
        }
            
        }

    }
