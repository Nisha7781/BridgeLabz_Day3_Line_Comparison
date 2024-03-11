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

        float line1 = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Length of the line1 is: " + line1);

        System.out.print("Enter x3 co-ordinator: ");
        float x3 = sc.nextFloat();
        System.out.print("Enter y3 co-ordinator: ");
        float y3 = sc.nextFloat();
        System.out.print("Enter x4 co-ordinator: ");
        float x4 = sc.nextFloat();
        System.out.print("Enter y4 co-ordinator: ");
        float y4 = sc.nextFloat();

        float line2 = (float) Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2));
        System.out.println("Length of the line2 is: " + line2);

        String L1 = String.valueOf(line1);
        String L2 = String.valueOf(line2);

        int compare = L1.compareTo(L2);
        if(compare == 0)
        {
            System.out.println("Lines are equal");
        }
        else if(compare > 0)
        {
            System.out.println("Line1 is greater than Line2 in length.");
        }
        else
        {
            System.out.println("Line1 is smaller than Line2 in length.");
        }

    }
}