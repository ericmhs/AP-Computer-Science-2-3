
/**
 * Write a description of class Formulas here.
 *
 * @author Eric Shen
 * @version Sep 27, 2023
 */

public class Formulas
{
    public static OrderedPair findQuadraticRoots (double a, double b, double c) {
        double answer1 = ((-b)+(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a);
        double answer2 = ((-b)-(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a);
        OrderedPair answer = new OrderedPair(answer1, answer2);
        return answer;  
    }

    public static double findSlope (OrderedPair P1, OrderedPair P2){
        double slope = (P2.getY()-P1.getY())/(P2.getX()-P1.getX());
        return slope;
    }

    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {

        double MidPointx = (A.getX() + B.getX())/2;
        double MidPointy = (A.getY() + B.getY())/2;
        OrderedPair MidPoint = new OrderedPair(MidPointx, MidPointy);
        return MidPoint;
    }

    public static double findArithmeticSeriesSum (double a, double d, int k) {
        double ArithmeticSum = (k/2)*(2*a+d*(k-1));
        return ArithmeticSum;
    }

    public static double findGeometricSeriesSum (double a, double r, int k) {
        double GeometricSum = a*((1-Math.pow(r, k))/(1-r));
        return GeometricSum;
    }
    
    public static int rollDie (int sides) {
        int num = (int)(Math.random()*sides)+1;
        return num;
    }

}