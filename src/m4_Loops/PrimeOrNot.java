package src.m4_Loops;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        int count=0;
        for (int i = 2; i <n; i++) {
            if (n%i== 0) {
                count++;
                break;
            }
        }
        if (count==1){
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime");
        }
    }
}
