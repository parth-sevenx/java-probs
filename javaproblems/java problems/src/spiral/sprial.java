package spiral;
import java.util.Scanner;

public class sprial
{  
public static void main(String args[])  
{  
    int i, j, counter; 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] matrix = new int[n][n];  
    int left, top;
    
    left = 0;  
    top  = n-1;  
    counter = 1;
    i=1;
    while(i<=n/2)  
    {  
        //fill from left to right  
        for(j=left; j<=top; j++)  
        {  
            matrix[left][j] = counter;
            counter++;
        }  
        //fill from top to down  
        for(j=left+1; j<=top; j++)  
        {  
            matrix[j][top] = counter;
            counter++;
        }  
        //fill from right to left  
        for(j=top-1; j>=left; j--)  
        {  
            matrix[top][j] = counter;
            counter++;
        }  
        //fill from down to top  
        for(j=top-1; j>=left+1; j--)  
        {  
            matrix[j][left] = counter;
            counter++;
        }  
    
        left++;
        top--; 
        i++;
    }
    //print the pattern  
    for(i=0; i<n; i++)  
    {  
        for(j=0; j<n; j++)  
        {  
            System.out.printf("%4d",matrix[i][j]);  
        }  
    System.out.printf("\n");  
    }  
}  
}  