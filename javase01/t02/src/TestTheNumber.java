
public class TestTheNumber {
    public static boolean checkNumber(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        if (string.length()>4) {
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Boolean incorrectInput=false;
        try {
            checkNumber(args[0]);
        }
        catch (Exception e) {
            System.out.println("You need to input JUST one argument");
            incorrectInput=true;
        }
        if ((incorrectInput==false)&&(args.length>1)) {
            System.out.println("You need to input ONLY one argument");
            incorrectInput=true;
        }
        if (incorrectInput==false) {
            if (checkNumber(args[0]) == true) {
                Integer fourDigitNumber = Integer.parseInt(args[0]);
                if ((fourDigitNumber/1000)+((fourDigitNumber/100)%10)==((fourDigitNumber/10)%10)+(fourDigitNumber % 10)) {
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
            }
            else {
                System.out.println("The value " + args[0] + " is not four-digit number");
            }
        }
    }
}
