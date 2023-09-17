package JavaFundamentalsCoding.ADouaClasa;

import java.util.Scanner;

public class WaveProblemDoEveryStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int nr = scanner.nextInt();
        int i;
        int j;
        char [][] a = new char  [4][nr];
        for (i = 0; i < 4; i++)
        {
            for(j = 0;j < nr;j++)
            {
                if(i == j)
                {
                    a[i][j] = '*';
                }
                else if( ((i+j) + 1) % 8 == 0)
                {
                    a[i][j] = '*';
                }
                // 8-0;9-1;10-2;11-3;
                else if(  (j-i) % 8 == 0)
                {
                    a[i][j] = '*';
                }
                else
                {
                    a[i][j] = ' ';
                }
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < nr; j++) {
                System.out.print(a[i][j] );
            }
            System.out.println  ( "" );
        }
    }
}

