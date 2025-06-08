/*
   =======================================================================
   |               CONVERT ROMAN NUMBERS TO INTEGERS                     |
   |                                                                     |
   |                                                           ~ NEELESH |
   =======================================================================
   - DOCUMENTED ON 08-06-2025 (08:40 P.M. IST)
   - TO SELF FOR FUTURE REFERENCE...
 */
// package Basics;

import java.util.Scanner;

public class RomanToInteger
{
    // HELPER FUNCTION -- CONVERTS EACH CHARACTER TO A NUMBER
    public static int ConvChar2Num(char ch)
    {
        int temp = 0;

        switch(ch)
            {
                case 'i':
                    temp = 1;
                    break;
                
                case 'v':
                    temp = 5;
                    break;
                
                case 'x':
                    temp = 10;
                    break;

                case 'l':
                    temp = 50;
                    break;
                
                case 'c':
                    temp = 100;
                    break;
                
                case 'd':
                    temp = 500;
                    break;
                
                case 'm':
                    temp = 1000;
                    break;

                default:
                    temp = 0;
                    break;
            }

        return temp;
    }
    // MAIN FUNCTION -- CONVERTS ROMAN TO INTEGER
    public static int ConvRom2Num(String rom)
    {
        int num = 0, prev = 0;

        rom = rom.toLowerCase();
        for(int counter = (rom.length() - 1); counter >= 0; counter--)
        {
            int curr = ConvChar2Num(rom.charAt(counter));

            if(curr < prev)
            {
                num-=curr;
            }
            else
            {
                num+=curr;
            }
            prev=curr;
        }
        return num;
    }
    public static void main(String args[])
    {
        // INITIALIZATION AND INPUT
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman Number: ");
        String Roman = sc.nextLine();
        // int Number = 0;

        int Number = ConvRom2Num(Roman);

        // OUTPUT
        System.out.println("The Numerical Value of Entered Roman Number (" + Roman + ") is : " + Number);
        sc.close();
    }
}