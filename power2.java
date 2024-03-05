// given an integer N, Return true if ni sa power of two else return false.
// an integer n is a power of two if an iteger X eists such as N==2^x.
// input 1->true.
// input 16->true



public class power2
{
    public static void main(String[] args) {
        
        System.out.println(power(Integer.parseInt(args[0])));
    }
    public static boolean power(int a)
    {
        int n=0;
        while(n<=a)
        {
            if(Math.pow(2,n)==a)
            return true;
            n++;
        }
        return false;
    }
}