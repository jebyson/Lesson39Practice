package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println( sal(5));
    }

    public static int rig(int n)
    {
        if ( (n == 0) )
        {
            return 5;
        }
        else if ( n == 1)
        {
            return 8;
        }
        else
        {
            return rig(n - 1) - rig(n - 2);
        }
    }

    public static int sal(int n)
    {
        if (n == 2)
        { return 100; }
        else if (n == 3)
        { return 200; }
        else
        {
            return (2 * sal(n - 1) + sal(n - 2) + 1);
        }
    }
}
