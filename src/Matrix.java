import java.util.Scanner;
class DSALab2DMatrix
{
    int matrix1[][] = new int[3][3];
    int len = matrix1.length;

    public void CreateMatrix()
    {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < len; j++)
            {
                System.out.print("Enter the " + i + " th " + j +" th " + " " + "element = ");
                matrix1[i][j]= sc.nextInt();
            }
        }
    }

    public void DisplayMatrix()
    {
        System.out.println( "The element of the matrix are");

        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < len; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void largestElement()
    {
        int l = matrix1[0][0];

        for(int i = 0; i < len; i++)
        {
            for(int j = 0 ; j < len; j++)
            {
                if(l < matrix1[i][j])
                {
                    l = matrix1[i][j];
                }
            }
        }
        System.out.println("The largest  element in the matrix is = " +l);
    }

    public void smallestElement()
    {
        int s= matrix1[0][0];

        for(int i = 0; i < len; i++)
        {
            for(int j = 0;j < len;j ++)
            {
                if(s> matrix1[i][j])
                {
                    s = matrix1[i][j];
                }
            }
        }
        System.out.println("The smallest element in the matrix is = "+s);
    }
}

public class Matrix
{
    public static void main(String[] args)
    {
        DSALab2DMatrix  t1 = new DSALab2DMatrix();

        t1.CreateMatrix();
        t1.DisplayMatrix();
        t1.smallestElement();
        t1.largestElement();

    }
}
