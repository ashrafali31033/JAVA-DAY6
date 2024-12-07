import java.util.*;
public class patternX {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j+i==n-1 || i==j  )
                System.out.print("X"+" ");
            
            else
            System.out.print(" "+" ");
        }
        
            

        System.out.println();
        }
    }
}
        