package Task1;

import java.util.Scanner;

/**
 * Created by Никита on 03.04.2015.
 */
public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println(dataPrepare());
    }



    static public String[] dataRead()
    {
        String dataIn = "";
        try
        {
            dataIn = scanner.nextLine();
        }
        catch (Exception e){}

        String[] dataWords = dataIn.split(" ");
        return dataWords;
    }

    static public boolean checkNumber(String word)
    {
        try {
            Integer.parseInt(word);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    static public String dataPrepare()
    {
        String dataOut = "";
        String[] data = dataRead();
        for (int i = 0; i < data.length; i++)
        {
            if (checkNumber(data[i]))
                data[i] = new StringBuilder(data[i]).reverse().toString();
        }

        for (int i = 0; i < data.length; i++)
        {
            dataOut += data[i] + " ";
        }
        return dataOut;
    }
}
