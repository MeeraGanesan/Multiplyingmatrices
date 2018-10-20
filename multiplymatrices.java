import java.util.*;
class multiplymatrices
{
    public static void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n=SC.nextInt();

        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        int c[][]=new int[n][n];
        System.out.println("Enter elements for matrix 1");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                a[i][j]=SC.nextInt();
            }
        }
        System.out.println("Enter elements for matrix 2");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                b[i][j]=SC.nextInt();
            }
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
              for (int k=0;k<n;k++)
              {
                  c[i][j]=c[i][j]+a[i][k]*b[k][j];
              }
            }
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(c[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
        
         
        
        
        