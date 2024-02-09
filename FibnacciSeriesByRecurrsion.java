package Java_2K23.DSA;
// 0 1 1 2 3 5 8 Desired output.
public class FibnacciSeriesByRecurrsion {
    public static void PrintFib(int a,int b,int n){
    // base case
        if(n==0){
            return ;
        } 
        int c=a+b;// c= 0+1. c=>1
        
        System.out.print(c+" ");
        PrintFib(b,c,n-1);// passing 'a' as b and 'b' as c. and minus n by 1 each time 
    }
    public static void main(String[] args){
        int a=0,b=1,n=7;
        System.out.print(a+" "+b+" ");
        PrintFib(a,b,n-2);

    }
}
