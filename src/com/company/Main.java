package com.company;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
	    Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] line = a.split("");

       /* while (b != 0)
        {
            c++;
            b/=10;
        }*/

        int[] arr = new int[line.length];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(line[i]);
        }

        int current_pos = 0;
        int max_low_floor = 0;
        int max_high_floor = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 1)
            {
                current_pos += 1;
            }
            else current_pos -= 1;

            if (current_pos < 0)
            {
                if (Math.abs(max_low_floor) < Math.abs(current_pos)) max_low_floor = current_pos*-1;
            }
            else if (current_pos > 0)
            {
                if (max_high_floor < current_pos) max_high_floor = current_pos;
            }
        }

        System.out.println(max_high_floor + max_low_floor + 1);
    }
}
