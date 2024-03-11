import  java.util.*;
public class LineComparison
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 co-ordinator: ");
        float x1 = sc.nextFloat();
        System.out.print("Enter y1 co-ordinator: ");
        float y1 = sc.nextFloat();
        System.out.print("Enter x2 co-ordinator: ");
        float x2 = sc.nextFloat();
        System.out.print("Enter y2 co-ordinator: ");
        float y2 = sc.nextFloat();

        float length = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.println("Length of the line is: " + length);
    }
}