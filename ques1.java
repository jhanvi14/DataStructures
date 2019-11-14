
import java.util.Scanner;

public class subarray {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int num=in.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("starting index: "+i+" Ending index: "+i);
            }
            else
            {
                int j=i+1;
                int sum=arr[i];
                while(j!=n)
                {
                    sum+=arr[j];
                    if(sum==num)
                    {
                        System.out.println("starting index: "+i+" Ending index: "+j);
                    }
                    j++;
                }
            }
        }
    }

}

