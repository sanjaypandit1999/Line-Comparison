package linecomparison;

import java.util.Scanner;

public class LineComparisonUc1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first co-ordinator x1- ");
        int x1= sc.nextInt();
        System.out.print("Enter first co-ordinator y1- ");
        int y1= sc.nextInt();
        System.out.print("Enter second co-ordinator x2- ");
        int x2= sc.nextInt();
        System.out.print("Enter second co-ordinator y2- ");
        int y2= sc.nextInt();
        int a = x2-x1;
        int b = y2-y1;
        double length = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Total length of line= " +length);
    }
}
