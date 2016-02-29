import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TriangleArea {
    public static boolean checkLeg(String string) {
        try {
            Float.parseFloat(string);
        } catch (Exception e) {
            return false;
        }
        if (Float.parseFloat(string)<0) {
            return false;
        }
        return true;
    }


    public static void main(String[] args)
    {
        Boolean incorrectInput=false;
        try {
            checkLeg(args[1]);
        }
        catch (Exception e) {
            System.out.println("You need to input value for each leg of triangle");
            incorrectInput=true;
        }
        if ((incorrectInput==false)&&(args.length>2)) {
            System.out.println("You need to input only TWO values");
            incorrectInput=true;
        }
        if (incorrectInput==false) {
            if ((checkLeg(args[0]) == true)&&(checkLeg(args[1]) == true)) {
                Float firstLeg = Float.parseFloat(args[0]);
                Float secondLeg = Float.parseFloat(args[1]);
                System.out.println("Area of triangle with legs a="+args[0]+" and b="+args[1]+" is "+Double.toString(firstLeg*secondLeg/2));
                System.out.println("Perimeter of triangle with legs a="+args[0]+" and b="+args[1]+" is "+Double.toString(firstLeg+secondLeg+sqrt(pow(firstLeg,2)+pow(secondLeg,2))));
            }
            else {
                System.out.println("The values can't be a legs of triangle");
            }
        }
    }
}
