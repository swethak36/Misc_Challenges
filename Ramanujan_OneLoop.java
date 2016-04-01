import java.util.*;
public class Ramanujan 
{
    public static void main(String args[] ) throws Exception 
    {
        Ramanujan s=new Ramanujan();
        System.out.println("Enter a number : This lists the -Number- of Ramanujan Numbers");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=0,k=1;
        while(i<n){
            if(s.checkRamanujan(k))
            {
                i=i+1;
                System.out.println(i+" th ramanujan number is "+k);
            }
            k++;
        }
        scan.close();
    }
    //checking whether a number is ramanujan number
    public boolean checkRamanujan(int a)
    {   
        int count=0;
        int cbrt=(int)Math.cbrt(a);
        //numbers only below and equal to cube th root of number
        for(int i=1;i<=cbrt;i++)
        {
            int difference=a-(i*i*i);
            int a1=(int) Math.cbrt(difference);                //checking whether the difference is perfect cube 

            if(a1==Math.cbrt(difference)){
                count=count+1;
            }
            if(count>2){            //checking if two such pairs exists i.e. (a*a*a)+(b*b*b)=(c*c*c)+(d*d*d)=number
                return true;
            }
        }
        return false;
    }
}
