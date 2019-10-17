import java.util.Arrays;
import java.util.Scanner;

public class arrays
{
    public static void main(String[] args)
    {
        /*
        Scanner sc = new Scanner(System.in);
        // dataType[] variable = new dataType[size]
        int[] numbersArray = new int[5];

        // Standard for loop
        for (int i = 0; i < numbersArray.length; i++)
        {
            numbersArray[i] = sc.nextInt();
        }
        // For each element in numbersArray...
        for (int element: numbersArray)
        {
            System.out.println(element);
        }
        System.out.println(Arrays.toString(numbersArray));

        int[] initializedArray = {1, 2, 3, 4, 5};
        String[] words = {"hello", "whatever"};
        */

        /*
        int[] initializedArray = {0, 2, 4, 8};
        doStuff(initializedArray);
        System.out.println(Arrays.toString(initializedArray));
        */

        int[][] twoDimensionArray = {{0, 0, 0},
                                     {1, 1, 1}};
        // This won't work
        System.out.println(Arrays.toString(twoDimensionArray));

        // This will
        for (int row = 0; row < twoDimensionArray.length; row++)
        {
            for (int column = 0; column < twoDimensionArray[row].length; column++)
            {
                System.out.println(twoDimensionArray[row][column]);
            }
        }
    }

    public static int[] doStuff(int[] passedArray)
    {
        for (int i = 0; i < passedArray.length; i++)
        {
            passedArray[i] = 6;
        }
        // Element is temporary
        for (int element : passedArray)
        {
            System.out.println(element);
        }

        return passedArray;
    }
}
