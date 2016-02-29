
public class MaxArray {
    public static boolean checkInput(String element) {
        try {
                Double.parseDouble(element);
            }
        catch (Exception e) {
                return false;
            }
        return true;
    }

    public static void main(String[] args)
    {
        Boolean incorrectInput=false;
        try {
            checkInput(args[0]);
        }
        catch (Exception e) {
            System.out.println("You need to input some values.");
            incorrectInput=true;
        }
        for (int counter=0; counter<args.length; counter++) {
            if (checkInput(args[counter]) != true) incorrectInput=true;
        }
        if ((incorrectInput != true)&&(args.length%2==0)) {
        Double MaxValue=Double.parseDouble(args[0])+Double.parseDouble(args[args.length-1]);
        for (int counter=1; counter<=args.length/2-1; counter++) {
            if (MaxValue<(Double.parseDouble(args[counter])+Double.parseDouble(args[args.length-counter-1]))) {
                MaxValue=Double.parseDouble(args[counter])+Double.parseDouble(args[args.length-counter-1]);
            }
        }
            System.out.println("Maximum of the sum of symmetrical pairs of array is : " + Double.toString(MaxValue));
        }
        else {
                System.out.println("Not everyone from args is real number or length of array is not divied into two");
        }
    }
}
