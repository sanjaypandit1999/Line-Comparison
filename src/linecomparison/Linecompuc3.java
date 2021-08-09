package linecomparison;

import java.util.Scanner;

public class Linecompuc3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);//System.in is a standard input stream
        System.out.print("enter line 2 co-ordinate x1,y1,x2,y2\n");
        System.out.print("Enter first co-ordinator x1- ");
        int x1= sc.nextInt();
        System.out.print("Enter first co-ordinator y1- ");
        int y1= sc.nextInt();
        System.out.print("Enter second co-ordinator x2- ");
        int x2= sc.nextInt();
        System.out.print("Enter second co-ordinator y2- ");
        int y2= sc.nextInt();
        int i = x2-x1;
        int j = y2-y1;
        double length1 = Math.sqrt(Math.pow(i,2) + Math.pow(j,2));
        System.out.println("Total length of line= " +length1);

        //line  no 2
        System.out.print("enter line 2 co-ordinate a1,b1,a2,b2\n");
        System.out.print("Enter first co-ordinator a1- ");
        int a1= sc.nextInt();
        System.out.print("Enter first co-ordinator b1- ");
        int b1= sc.nextInt();
        System.out.print("Enter second co-ordinator a2- ");
        int a2= sc.nextInt();
        System.out.print("Enter second co-ordinator b2- ");
        int b2= sc.nextInt();
        int u = -a2-a1;
        int v = b2-b1;
        double length2 = Math.sqrt(Math.pow(u,2) + Math.pow(v,2));
        System.out.println("Total length of line= " + length2);

        if (length1 == length2)
            System.out.println(length1 + " equals " + length2);
        else if (length1 < length2)
            System.out.println(length1 + "  greater than " +length2 );
        else
            System.out.println(length1 + "  less than " +length2 );
    }
}
