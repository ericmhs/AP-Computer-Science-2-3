
/**
 * Write a description of class FormulaDriver here.
 *
 * @author Eric Shen
 * @version Sep 27, 2023
 */
import java.util.Scanner;

public class FormulaDriver
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: "); 
        double b = input.nextDouble(); 
        System.out.print("c: "); 
        double c = input.nextDouble(); 

        OrderedPair roots = Formulas.findQuadraticRoots(a, b, c); 
        System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " + roots); 

        //--------------        
        System.out.println("SLOPE FORMULA: Find the slope between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        OrderedPair P1 = new OrderedPair(x1, y1);
        OrderedPair P2 = new OrderedPair(x2, y2);

        double Slope = Formulas.findSlope(P1, P2);
        System.out.println("A line between (" + x1 + ", " + y1+ ") and (" + x2 + ", " + y2 + ") has a slope of " + Slope + ".");

        //---------------
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double Mx1 = input.nextDouble();
        System.out.print("y1: ");
        double My1 = input.nextDouble();
        System.out.print("x2: ");
        double Mx2 = input.nextDouble();
        System.out.print("y2: ");
        double My2 = input.nextDouble();

        OrderedPair A = new OrderedPair(Mx1, My1);
        OrderedPair B = new OrderedPair(Mx2, My2);
        
        OrderedPair MidPoint = Formulas.findMidpoint(A, B);
        System.out.println("The midpoint between (" + Mx1 + ", " + My1 + ") and (" + Mx2 + ", " + My2 + ") is " + MidPoint + ".");
        
        //------------------
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int k = input.nextInt();
        System.out.print("Starts with: ");
        a = input.nextDouble();
        System.out.print("Increases by: ");
        double d = input.nextDouble();
        
        double Asum = Formulas.findArithmeticSeriesSum(a, d, k);
        System.out.println("The sum of the first " +  k  + " terms of an arithmetic series that starts with " + a + " and increases by " + d + " is " + Asum + ".");
        
        //--------------------
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        k = input.nextInt();
        System.out.print("Starts with: ");
        a = input.nextDouble();
        System.out.print("Rate of growth: ");
        double r = input.nextDouble();
        
        double Gsum = Formulas.findGeometricSeriesSum(a, r, k);
        System.out.println("The sum of the first " + k + " terms of a finite geometric series that starts with " + a + " and increases by a rate of " + r + " is " + Gsum + ".");
        
        //-------------------
        System.out.println("How many sides does your die have? ");
        int sides = input.nextInt();
        
        double num = Formulas.rollDie(sides);
        System.out.print("Rolling a " + sides + "-sided die... you got a " + num + "!");
        
    }
    
  
}
