
import static java.lang.Math.tan;

public class FunctionCalc {
    public static boolean checkInput(String string) {
        try {
           Double.parseDouble(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static double functionCalc(Double x) {
        return tan(2*x)-3;
    }

    public static void main(String[] args)
    {
        Boolean incorrectInput=false;
        try {
            checkInput(args[2]);
        }
        catch (Exception e) {
            System.out.println("You need to input three values: beginning and the end of the segment and step of calculation");
            incorrectInput=true;
        }
        if ((incorrectInput==false)&&(args.length>3)) {
            System.out.println("You need to input only THREE values");
            incorrectInput=true;
        }
        if (incorrectInput==false) {
            if ((checkInput(args[0]) == true)&&(checkInput(args[1]) == true)&&(checkInput(args[2]) == true)) {
                Double segmentBegin = Double.parseDouble(args[0]);
                Double segmentEnd = Double.parseDouble(args[1]);
                Double step = Double.parseDouble(args[2]);
                if ((step>0)&&((segmentEnd-segmentBegin-step) >0)) {
                    System.out.println("---------------------------");
                    System.out.println("|   value    |   result   |");
                    System.out.println("---------------------------");
                    Integer Natural;
                    final double pi = 3.14159265;
                    for (double counter=segmentBegin; counter<=segmentEnd;counter+=step) {
                        System.out.print("| ");
                        System.out.format("%10.4f", counter);
                        System.out.print(" | ");
                        if (((counter-(pi/2))/pi)%1==0) {
                            System.out.format("  No Value  ");
                        }
                        else {
                            System.out.format("%10.4f", functionCalc(counter));
                        }
                        System.out.println(" |");
                    }
                    System.out.println("---------------------------");
                }
                else {
                    System.out.println("The values are not a segment and step of calculation");
                }
            }
            else {
                System.out.println("The values are not a numbers");
            }
        }
    }

}
