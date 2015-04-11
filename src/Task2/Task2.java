package Task2;

import java.util.Scanner;

/**
 * Created by Никита on 03.04.2015.
 */
public class Task2 {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] dataSymbols;


    public static void main(String[] args)
    {

    }


    static public String[] dataRead()
    {
        String dataIn = "";
        try
        {
            dataIn = scanner.nextLine();
        }
        catch (Exception e){}

        dataSymbols = dataIn.split(" ");
        return dataSymbols;
    }

    static public int checkSymbol(int i)
    {
        switch (dataSymbols[i]) {
            case "+":
                return countSumm(i);
            case "-":
                return countDifference(i);
            case "/":
                return countPartition(i);
            case "*":
                return countMultiplying(i);
        }
    }

    static public int countSumm(int i)
    {
        int summ = 0;

        return summ;
    }

    static public int countDifference(int i)
    {
        int dif = 0;

        return dif;
    }

    static public int countPartition(int i)
    {
        int par = 0;

        return par;
    }

    static public int countMultiplying(int i)
    {
        int mul = 0;

        return mul;
    }
}
