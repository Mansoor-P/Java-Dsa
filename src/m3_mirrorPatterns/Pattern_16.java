package src.m3_mirrorPatterns;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space=n-1;
        while (row <= 2 * n - 1) {
            // space
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }

            // star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            //next row
            // mirror
            if(row<n){
                star--;
                space--;
            }else {
                star++;
                space++;
            }
            row++;
            System.out.println();

        }

    }

}
