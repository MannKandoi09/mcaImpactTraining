package Day7;

import java.util.*;

class ClassExercise_2 {
    public static void main(String args [] )
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[][] = new int[n][n];
        //this is use for to take input in arry from user 
        for(int i= 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        int total =0;

        //inside the loop diagonal and ani diagonal sum are stored
        for(int i = 0;i<n;i++)
        {
            total += a[i][i];
            total += a[i][n-1-i];

        }

        //tp find the suare of each diagonal elements input
        for(int i = 0;i<n;i++)
        {
            a[i][i] = a[i][i] * a[i][i];

        }

        for(int i = 0;i<n;i++)
        {
            a[i][n-1-i] = a[i][n-1-i] * a[i][n-1-i];

        }
        System.out.println(total);



        //it was use for to print the result of diagonal
        for(int i= 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }



    }
}