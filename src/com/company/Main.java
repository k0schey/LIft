package com.company;

import java.math.BigInteger;
import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
	    Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] line = a.split(" ");

        BigInteger a1 = new BigInteger(line[0]);
        BigInteger a2 = new BigInteger(line[1]);
        BigInteger a3 = new BigInteger(line[2]);

        // если 1 > 2
        if (a1.compareTo(a2) == 1)
        {
            // 1 > 3
            if (a1.compareTo(a3) == 1) System.out.println(a1);
            else System.out.println(a3);
        }
        else if (a2.compareTo(a3) == 1)
        {
            System.out.println(a2);
        }
        else System.out.println(a3);
    }
}
