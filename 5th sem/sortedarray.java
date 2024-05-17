// given an array x with n number of elements, reutrn true if the given array x is sorted else return false. 
// you may consider multiple position may be shiefted if the array x.

public class sortedarray
{
    public static void main(String[] args) {
        int a[] = new int[args.length];
        for(int i=0; i<args.length; i++)
        a[i]=Integer.parseInt(args[i]);
        System.out.println(sorted(a));
    }
    public static boolean sorted(int a[])
    {
        int n=a.length;
        int min=0;
        for(int i=0; i<n; i++)
            if(a[i]<a[min])
                min=i;
        for(int i=min; i<n-1; i++)
            if(a[i]>a[i+1])
                return false;
        for(int i=min-1; i>=0; i--)
            if(a[min]>=a[min-1])
                return false;
        return true;
    }
}