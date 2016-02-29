
public class MatrixMake {
    public static boolean checkInput(String dimension) {
        try {
            Integer.parseInt(dimension);
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
            System.out.println("You need to input one positive integer argument");
            incorrectInput=true;
        }
        if ((incorrectInput==false)&&(args.length>1)) {
            System.out.println("You need to input ONLY one argument");
            incorrectInput=true;
        }
        if ((incorrectInput == false)&&(checkInput(args[0])==true)) {
            if ((Integer.parseInt(args[0]))>0) {
                int[][] xArray = new int[Integer.parseInt(args[0])][Integer.parseInt(args[0])];
                for (int counter = 0; counter < Integer.parseInt(args[0]); counter++) {
                    System.out.print("| ");
                    for (int counter2 = 0; counter2 < Integer.parseInt(args[0]); counter2++) {
                        if ((counter2 == counter) || (counter2 == Integer.parseInt(args[0]) - counter - 1)) {
                            xArray[counter][counter2] = 1;
                        } else {
                            xArray[counter][counter2] = 0;
                        }
                        System.out.print(Integer.toString(xArray[counter][counter2]) + " ");
                    }
                    System.out.println("|");
                }
            }
            else {
                System.out.println("Dimension of array must be positive");
            }
        }
        else {
            System.out.println("Dimension of array is not natural integer");
        }
    }
}
