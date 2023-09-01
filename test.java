import java.util.Scanner;

public class test {
    
    public static Scanner sc = new Scanner(System.in);
    public static void Solve(int T)
    {
        int[] m= new int[500];
        long n= sc.nextLong();
        System.out.printf("Test %d:", T);
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                m[i]=0;
                while(n%i==0)
                {
                    m[i]++;
                    n/=i;
                }
            }
            if(m[i]!=0)
            {
                System.out.print(" "+i+"("+m[i]+")"+" ");
            }
            
        }
        if(n!=1)
        {
            System.out.print(n+"(1)");
        }
       System.out.println();
    }
    public static void main(String[] args) {
        int T= sc.nextInt();
        for(int i=1; i<=T; i++)
        {
            Solve(i);
        }
    }
    
}